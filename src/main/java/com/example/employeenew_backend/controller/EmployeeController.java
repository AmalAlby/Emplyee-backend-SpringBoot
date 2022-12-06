package com.example.employeenew_backend.controller;

import com.example.employeenew_backend.dao.EmployeeDao;
import com.example.employeenew_backend.model.AddEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {

    @Autowired
    private EmployeeDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String Webpage(){
        return "This is my webpage";
    }

    @CrossOrigin(origins = "*")
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

    @CrossOrigin(origins = "*")
    @PostMapping("/search")
    public String Search_employee(){
        return "This is my employee search page";
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/edit")
    public String Edit_employee(){
        return "This is my employee edit page";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<AddEmployee> View_employee(){

        return (List<AddEmployee>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/delete")
    public String Delete_employee(){
        return "This is my employee delete page";
    }


}
