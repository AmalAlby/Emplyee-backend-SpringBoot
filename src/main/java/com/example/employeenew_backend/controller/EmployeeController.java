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

    @GetMapping("/search")
    public String Search_employee(){
        return "This is my employee search page";
    }

    @GetMapping("/edit")
    public String Edit_employee(){
        return "This is my employee edit page";
    }

    @GetMapping("/view")
    public String View_employee(){
        return "This is my employee view page";
    }


}
