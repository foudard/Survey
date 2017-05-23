package controller;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String getPolls () {
        return "polls";
    }

    @RequestMapping(value = "/polls", method = POST)
    public String postPolls (HttpServletRequest request) {
        this.pseudo = request.getParameter("pseudo");
        this.age = request.getParameter("age");

        return "redirect:/polls";
    }

    @RequestMapping(value = "/poll", method = GET)
    public String getPoll () {
        return "poll";
    }

    @RequestMapping(value = "/poll", method = POST)
    public String postPoll () {
        return "redirect:/poll";
    }
}
