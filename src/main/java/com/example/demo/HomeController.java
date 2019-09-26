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

    @RequestMapping("/vegan")
    public String veganScone(){
        return "vegan";
    }

    @RequestMapping("/garlic")
    public String plantGarlic(){
        return "garlic";
    }

    @RequestMapping("/columngrid")
    public String columnGrid(){return "columngrid";}

    @RequestMapping("/rowgrid")
    public String rowGrid(){ return "rowgrid";}

}
