package com.sampleproject.sampleproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(path = "/info")
    public String getInfo(){
        return "Hello World";
    }
}
