package com.springboot_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    //handler method to handle -> /helloWorld
    // http://localhost:8080/helloWorld
    @GetMapping("/helloWorld")
    public String helloWorld(Model model){
        model.addAttribute("message", "Hello World - Zubair");

        return "helloWorld";

    }
}
