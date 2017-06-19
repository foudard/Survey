package controller;

/**
 * Created by flori_000 on 16/05/2017.
 */

import dao.UserDao;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.UserService;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class MainController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/", method=GET)
    public ModelAndView index () {
        ModelAndView view = new ModelAndView("index");
        view.addObject("userLogged", SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        return view;
    }

    @RequestMapping(value="/login", method=GET)
    public ModelAndView login () {
        ModelAndView view = new ModelAndView("login");
        view.addObject("userLogged", SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        return view;
    }
}
