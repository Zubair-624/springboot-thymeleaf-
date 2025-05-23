package com.springboot_thymeleaf.controller;

import com.springboot_thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    //handler method to handel -> /userInformation
    // http://localhost:8080/userInformation
    @GetMapping("/userInformation")
    public String userInformation(Model model){

        User user = User.builder()
                .name("Zubair Mazumder")
                .email("z@gmail.com")
                .role("Admin")
                .gender("Male")
                .build();

        model.addAttribute("userInformation", user);

        return "UserInformation";
    }

    //handler method to handel -> userInformation(Selection Expression Request)
    //http://localhost:8080/selectionExpression
    @GetMapping("/selectionExpression")
    public String selectionExpression(Model model){

        User user = User.builder()
                .name("Khadija Mazumder")
                .email("khadija@gmail.com")
                .role("User")
                .gender("Female")
                .build();

        model.addAttribute("selectExpression", user);

        return "selectionExpression";
    }

    //handler method to handle -> Message Expression
    // http://localhost:8080/messageExpression
    @GetMapping("/messageExpression")
    public String messageExpression(){

        return "messageExpression";
    }

    //handler method to handle -> Link Expression
    // http://localhost:8080/linkExpression
    @GetMapping("/linkExpression")
    public String linkExpression(Model model){

        model.addAttribute("id", 1);

        return "linkExpression";
    }

    //handler method to handle -> Fragment Expression\
    // http://localhost:8080/fragmentExpression
    @GetMapping("/fragmentExpression")
    public String fragmentExpression(){

        return "fragmentExpression";
    }
}
