package controller;

import model.*;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.AgeGroupService;
import service.PollService;
import service.ResponseService;
import service.ResultService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.lang.Integer.parseInt;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by flori_000 on 23/05/2017.
 */

@Controller
public class PollController {

    @Autowired
    PollService pollService;

    @Autowired
    AgeGroupService ageGroupService;

    @Autowired
    ResponseService responseService;

    @Autowired
    ResultService resultService;

    @RequestMapping(value = "/polls", method = GET)
    public ModelAndView getPolls () {
        ModelAndView view = new ModelAndView("polls");
        view.addObject("userLogged", SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        view.addObject("polls", pollService.findAll());
        return view;
    }

    @RequestMapping(value = "/polls", method = POST)
    public String postPolls (HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("pseudo", request.getParameter("pseudo"));
        session.setAttribute("age", parseInt(request.getParameter("age")));
        Integer age = parseInt(request.getParameter("age"));
        if (age < 10) {
            session.setAttribute("ageGroup", ageGroupService.findOne(1));
        } else if (10 <= age && age < 15){
            session.setAttribute("ageGroup", ageGroupService.findOne(2));
        } else if (15 <= age && age < 20){
            session.setAttribute("ageGroup", ageGroupService.findOne(3));
        } else if (20 <= age && age < 25){
            session.setAttribute("ageGroup", ageGroupService.findOne(4));
        } else if (25 <= age && age < 30){
            session.setAttribute("ageGroup", ageGroupService.findOne(5));
        } else if (30 <= age && age < 35){
            session.setAttribute("ageGroup", ageGroupService.findOne(6));
        } else if (35 <= age && age < 40){
            session.setAttribute("ageGroup", ageGroupService.findOne(7));
        } else if (40 <= age && age < 45){
            session.setAttribute("ageGroup", ageGroupService.findOne(8));
        } else if (45 <= age && age < 50){
            session.setAttribute("ageGroup", ageGroupService.findOne(9));
        } else if (50 <= age && age < 55){
            session.setAttribute("ageGroup", ageGroupService.findOne(10));
        } else if (55 <= age && age < 60){
            session.setAttribute("ageGroup", ageGroupService.findOne(11));
        } else if (60 <= age && age < 65){
            session.setAttribute("ageGroup", ageGroupService.findOne(12));
        } else if (65 <= age && age < 70){
            session.setAttribute("ageGroup", ageGroupService.findOne(13));
        } else if (70 <= age && age < 75){
            session.setAttribute("ageGroup", ageGroupService.findOne(14));
        } else if (75 <= age && age < 80){
            session.setAttribute("ageGroup", ageGroupService.findOne(15));
        } else if (80 <= age && age < 65){
            session.setAttribute("ageGroup", ageGroupService.findOne(16));
        } else if (85 <= age && age < 90){
            session.setAttribute("ageGroup", ageGroupService.findOne(17));
        } else {
            session.setAttribute("ageGroup", ageGroupService.findOne(18));
        }
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
        HttpSession session = request.getSession();
        Result result = new Result();
        result.setPseudo((String) session.getAttribute("pseudo"));
        result.setAge((Integer) session.getAttribute("age"));
        result.setAgeGroup((AgeGroup) session.getAttribute("ageGroup"));
        result.setResponse(responseService.findOne(parseInt(request.getParameter("resultId"))));
        resultService.save(result);
        return "redirect:/polls";
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
        List<Response> responses = new ArrayList<Response>();

        Poll survey = new Poll();
        survey.setUser(user);
        survey.setName(request.getParameter("name"));
        survey.setDescription(request.getParameter("description"));
        survey.setDateBegin(new java.util.Date(parseInt(strBegin[2]) - 1900, parseInt(strBegin[1]), parseInt(strBegin[0])));
        survey.setDateEnd(new java.util.Date(parseInt(strEnd[2]) - 1900, parseInt(strEnd[1]), parseInt(strEnd[0])));

        JSONArray jsonarray = new JSONArray(request.getParameter("responses"));
        for (int i = 0; i < jsonarray.length(); i++) {
            JSONObject jsonobject = jsonarray.getJSONObject(i);
            responses.add(new Response(jsonobject.getString("value"), survey));
        }
        survey.setResponses(responses);

        pollService.save(survey);
        return "redirect:/";
    }
}
