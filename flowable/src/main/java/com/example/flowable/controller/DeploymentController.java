package com.example.flowable.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("deployment")
public class DeploymentController {

    @GetMapping("test")
    public String t(){
        return "0.0";
    }

}
