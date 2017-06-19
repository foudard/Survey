package controller;

import dao.PollDao;
import model.Poll;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.PollService;

import javax.servlet.http.HttpServletRequest;

import java.util.Date;

import static java.lang.Integer.parseInt;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by flori_000 on 23/05/2017.
 */

@Controller
public class PollController {

    private String pseudo;
    private Integer age;

    @Autowired
    PollService pollService;

    @RequestMapping(value = "/polls", method = GET)
    public ModelAndView getPolls () {
        ModelAndView view = new ModelAndView("polls");
        view.addObject("userLogged", SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        view.addObject("polls", pollService.findAll());
        return view;
    }

    @RequestMapping(value = "/polls", method = POST)
    public String postPolls (HttpServletRequest request) {
        this.pseudo = request.getParameter("pseudo");
        this.age = parseInt(request.getParameter("age"));

        return "redirect:/polls";
    }

    @RequestMapping(value = "/poll/{id}", method = GET)
    public ModelAndView getPoll (@PathVariable("id") Integer id) {
        ModelAndView view = new ModelAndView("poll");
        view.addObject("userLogged", SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        view.addObject("poll", pollService.findOne(id));
        return view;
    }

    @RequestMapping(value = "/poll/{id}", method = POST)
    public String postPoll (@PathVariable("id") Integer id, HttpServletRequest request) {

        return "redirect:/poll";
    }

    @RequestMapping(value = "/poll/add", method = GET)
    public ModelAndView getAddPoll () {
        ModelAndView view = new ModelAndView("addPoll");
        view.addObject("userLogged", SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() == "anonymousUser") {
            view.setViewName("redirect:/");
        }
        return view;
    }

    @RequestMapping(value = "/poll/add", method = POST)
    public String postAddPoll (HttpServletRequest request) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String[] strBegin = request.getParameter("begin_date").split("/");
        String[] strEnd = request.getParameter("end_date").split("/");

        Poll survey = new Poll();
        survey.setUser(user);
        survey.setName(request.getParameter("name"));
        survey.setDescription(request.getParameter("description"));
        survey.setDateBegin(new java.util.Date(parseInt(strBegin[2]) - 19, parseInt(strBegin[1]), parseInt(strBegin[0])));
        survey.setDateEnd(new java.util.Date(parseInt(strEnd[2]) - 19, parseInt(strEnd[1]), parseInt(strEnd[0])));

        pollService.save(survey);
        return "redirect:/";
    }
}
