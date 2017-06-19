package controller;

import model.Role;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.RoleService;
import service.UserService;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Val on 24/05/2017.
 */

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @RequestMapping(value = "/user/add", method = GET)
    public ModelAndView addWriter () {
        ModelAndView view = new ModelAndView("adduser");
        view.addObject("userLogged", SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        return view;
    }

    @RequestMapping(value = "/user/add", method = POST)
    public String createWriter (HttpServletRequest request) {

        Role role = roleService.findByName("writer");
        User user = new User(request.getParameter("login"),  new BCryptPasswordEncoder().encode(request.getParameter("password")), role);
        userService.save(user);
        return "redirect:/";
    }
}
