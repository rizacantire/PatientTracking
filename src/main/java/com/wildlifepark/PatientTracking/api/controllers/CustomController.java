package com.wildlifepark.PatientTracking.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/custom/")

public class CustomController {

    @GetMapping("get")
    public String get(){
        return "Merhaba";
    }
}
