package controller;

import dao.PollDao;
import model.Poll;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.PollService;

import javax.servlet.http.HttpServletRequest;

import static java.lang.Integer.parseInt;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by flori_000 on 23/05/2017.
 */

@Controller
public class PollController {

    private String pseudo;
    private String age;

    @Autowired
    PollService pollService;

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
