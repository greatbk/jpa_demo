package com.example.jpa.demo1.service.employees;

import com.example.jpa.demo1.entity.Employees;
import com.example.jpa.demo1.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired
    private EmployeesRepository employeesRepository;

    @Override
    public long getCount() {
        return employeesRepository.count();
    }

    @Override
    public List<Employees> findByLastName(String lastName) {
        List<Employees> list = new ArrayList<>();
        employeesRepository.findByLastName(lastName).forEach(row -> list.add(row));
        return list;
    }
}
