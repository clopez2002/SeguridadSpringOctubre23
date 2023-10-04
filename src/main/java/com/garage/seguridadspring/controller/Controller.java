package com.garage.seguridadspring.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String inicio(){


        return "archivoInicio";
    }


}
