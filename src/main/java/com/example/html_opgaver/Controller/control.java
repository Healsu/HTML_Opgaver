package com.example.html_opgaver.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class control {



    @GetMapping("/Politikken")
    public String test(){


        return "Exercise";
    }
}
