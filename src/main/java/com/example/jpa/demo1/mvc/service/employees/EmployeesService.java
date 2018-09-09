package com.example.jpa.demo1.mvc.service.employees;

import com.example.jpa.demo1.entity.Employees;

import java.util.List;

public interface EmployeesService {

    long getCount();

    List<Employees> findByLastName(String lastName);

    /*
    Employees retrieveOne(int empNo);

    boolean add(Employees param);

    void update(Employees param);

    void delete(int empNo);
    */
}
