package controller;

/**
 * Created by flori_000 on 16/05/2017.
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // This means that this class is a rest controller
@RequestMapping(path="/") // This means URL's start with / (after Application path)
public class MainController {

    @GetMapping(path="/index") // Map ONLY GET Requests
    public @ResponseBody String index () {
        return "../../views/index";
    }
}
