package com.example.jpa.demo1.repository;

import com.example.jpa.demo1.entity.Employees;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeesRepository extends CrudRepository<Employees, Integer> {

    @Query("SELECT e FROM Employees e WHERE e.lastName = :lastName ORDER BY e.firstName")
    List<Employees> findByLastName(@Param("lastName") String lastName);
}
