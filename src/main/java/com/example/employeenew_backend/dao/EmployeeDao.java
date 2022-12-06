package com.example.employeenew_backend.dao;

import com.example.employeenew_backend.model.AddEmployee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<AddEmployee,Integer> {
}
