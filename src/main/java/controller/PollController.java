package controller;

import model.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by flori_000 on 23/05/2017.
 */

@Controller
public class PollController {

    private String pseudo;
    private String age;

    @RequestMapping(value = "/polls", method = GET)
    public ModelAndView getPolls () {
        ModelAndView view = new ModelAndView("polls");
        view.addObject("userLogged", SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        return view;
    }

    @RequestMapping(value = "/polls", method = POST)
    public String postPolls (HttpServletRequest request) {
        this.pseudo = request.getParameter("pseudo");
        this.age = request.getParameter("age");

        return "redirect:/polls";
    }

    @RequestMapping(value = "/poll", method = GET)
    public ModelAndView getPoll () {
        ModelAndView view = new ModelAndView("poll");
        view.addObject("userLogged", SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        return view;
    }

    @RequestMapping(value = "/poll", method = POST)
    public String postPoll () {
        return "redirect:/poll";
    }
}
