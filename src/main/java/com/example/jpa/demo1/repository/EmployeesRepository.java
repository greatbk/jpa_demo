package com.example.jpa.demo1.repository;

import com.example.jpa.demo1.entity.Employees;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeesRepository extends CrudRepository<Employees, Integer> {

    List<Employees> findByLastName(String lastName);
}
