package com.example.jpa.demo1.mvc.service.titles;

import com.example.jpa.demo1.entity.Titles;
import com.example.jpa.demo1.repository.TitlesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class TitlesServiceImpl implements TitlesService {

    @Autowired
    private TitlesRepository titlesRepository;

    @Override
    public List<Titles> findByEmpNo(int empNo) {
        return titlesRepository.findByEmpNo(empNo);
    }
}

