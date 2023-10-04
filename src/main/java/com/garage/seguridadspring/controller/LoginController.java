package com.garage.seguridadspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/miFormularioDeLoginURL")
    public String formLoginMethod (){



        return "loginPageFile";
    }
}
