package com.example.springboot1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String openRegPage() {
        return "registerPage"; // This will map to the "registerPage.jsp" in the "templates" folder
    }
}
