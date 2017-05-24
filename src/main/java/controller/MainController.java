package controller;

/**
 * Created by flori_000 on 16/05/2017.
 */

import dao.UserDao;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class MainController {

    UserService userService;

    @RequestMapping(value="/", method=GET)
    public String index () {
        return "index";
    }

    @RequestMapping(value="/login", method=GET)
    public String login () {
        return "login";
    }

    @RequestMapping(value="/login", method=POST)
    public String connect (HttpServletRequest request) {
        User user = new User();
        user.setLogin(request.getParameter("login"));
        user.setPassword(request.getParameter("password"));



        return "redirect:/";
    }
}
