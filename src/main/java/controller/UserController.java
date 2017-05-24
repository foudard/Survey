package controller;

import model.Role;
import model.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.RoleService;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Val on 24/05/2017.
 */

@Controller
public class UserController {
    @RequestMapping(value = "/user/add", method = GET)
    public ModelAndView addWriter () {
        ModelAndView view = new ModelAndView("adduser");
        view.addObject("userLogged", SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        return view;
    }

    @RequestMapping(value = "/user/add", method = POST)
    public String createWriter (HttpServletRequest request) {
        RoleService roleService = new RoleService();
        Role role = roleService.findByName("wirter");
        User user = new User(request.getParameter("login"),  new BCryptPasswordEncoder().encode(request.getParameter("password")), role);
        // user.save();
        return "redirect:/";
    }
}
