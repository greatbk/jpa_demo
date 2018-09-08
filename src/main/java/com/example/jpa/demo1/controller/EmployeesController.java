package com.example.jpa.demo1.controller;

import com.example.jpa.demo1.entity.Employees;
import com.example.jpa.demo1.service.employees.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("employees")
public class EmployeesController {

    @Autowired
    private EmployeesService employeesService;

    @GetMapping("count")
    public ResponseEntity<Long> count() {
        Long count = employeesService.getCount();
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @GetMapping("list/{lastName}")
    public ResponseEntity<List<Employees>> retrieveList(@PathVariable String lastName) {
        List<Employees> list = employeesService.findByLastName(lastName);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}

