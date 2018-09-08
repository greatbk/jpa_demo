package com.example.jpa.demo1.service.titles;

import com.example.jpa.demo1.entity.Titles;
import com.example.jpa.demo1.repository.TitlesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TitlesServiceImpl implements TitlesService {

    @Autowired
    private TitlesRepository titlesRepository;

    @Override
    public List<Titles> findByEmpNo(int empNo) {
        List<Titles> list = new ArrayList<>();
        titlesRepository.findByEmpNo(empNo).forEach(row -> list.add(row));
        return list;
    }
}

