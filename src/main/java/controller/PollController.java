package controller;

import model.Poll;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.PollService;

import javax.servlet.http.HttpServletRequest;

import java.util.Date;

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

    @RequestMapping(value = "/poll/add", method = GET)
    public String getAddPoll () { return "addPoll"; }

    @RequestMapping(value = "/poll/add", method = POST)
    public String postAddPoll (HttpServletRequest request) {
        Poll survey = new Poll();
        survey.setUserId(1);
        survey.setName(request.getParameter("name"));
        survey.setDescription(request.getParameter("description"));
        // survey.setDateBegin(request.getParameter("begin_date");
        // survey.setDateEnd(request.getParameter("end_date"));

        PollService pollService = new PollService();
        pollService.save(survey);

        // Response resp = new Response();
        // resp.setValue();
        // resp.setPollId();
        return "addPoll";
    }


}
