package com.example.jpa.demo1.mvc.service.employees;

import com.example.jpa.demo1.entity.Employees;
import com.example.jpa.demo1.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired
    private EmployeesRepository employeesRepository;

    @Override
    public long getCount() {
        return employeesRepository.count();
    }

    @Override
    public List<Employees> findByLastName(String lastName) {
        return employeesRepository.findByLastName(lastName);
    }
}
