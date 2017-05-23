package controller;

/**
 * Created by flori_000 on 16/05/2017.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String index () {
        return "index";
    }
}
