package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")//connect to RequestMapping
    public String index(){
        return "index";
    }

    @RequestMapping("/about")
    //<a href="homepage"></a>
    public String homePage(){
        return "about";
    }
    @RequestMapping("/vegan")
    //<a href="homepage"></a>
    public String veganScone(){
        return "vegan";
    }

    @RequestMapping("/garlic")
    //<a href="homepage"></a>
    public String plantGarlic(){
        return "garlic";
    }
    @RequestMapping("/main")
    //<a href="homepage"></a>
    public String mainpage(){
        return "Main";
    }
}
