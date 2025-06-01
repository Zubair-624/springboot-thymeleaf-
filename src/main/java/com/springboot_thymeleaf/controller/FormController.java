package com.springboot_thymeleaf.controller;

import com.springboot_thymeleaf.model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {

    // handler method to handle - User Registration form
    @GetMapping("/userRegistration")
    public String userRegistration(Model model){

        //Empty UserForm model object to store form data
        UserForm userFormObject = new UserForm();
        model.addAttribute("userForm", userFormObject);

        List<String> listProfessionFormObject = Arrays.asList("Developer", "Tester", "Architect");
        model.addAttribute("listprofessionForm", listProfessionFormObject);

        return "userRegistration";



    }
}
