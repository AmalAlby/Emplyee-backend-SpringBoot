package com.example.employeenew_backend.controller;

import com.example.employeenew_backend.dao.EmployeeDao;
import com.example.employeenew_backend.model.AddEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class EmployeeController {

    @Autowired
    private EmployeeDao dao;


    @GetMapping("/")
    public String Webpage(){
        return "This is my webpage";
    }

    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String Add_employee(@RequestBody AddEmployee e){
        System.out.println(e.getEmpcode());
        System.out.println(e.getEmpname().toString());
        System.out.println(e.getCompanyname().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getMobilenumber().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());
        dao.save(e);
        return "This is my add employee page";
    }

    @PostMapping("/search")
    public String Search_employee(){
        return "This is my employee search page";
    }

    @PostMapping("/edit")
    public String Edit_employee(){
        return "This is my employee edit page";
    }

    @GetMapping("/view")
    public List<AddEmployee> View_employee(){

        return (List<AddEmployee>) dao.findAll();
    }

    @PostMapping("/delete")
    public String Delete_employee(){
        return "This is my employee delete page";
    }


}
