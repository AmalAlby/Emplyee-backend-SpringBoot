package com.example.employeenew_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

    @GetMapping("/")
    public String Webpage(){
        return "This is my webpage";
    }

    @GetMapping("/add")
    public String Add_employee(){
        return "This is my add employee page";
    }


}
