package com.example.jpa.demo1.mvc.service.titles;

import com.example.jpa.demo1.entity.Titles;

import java.util.List;

public interface TitlesService {

    List<Titles> findByEmpNo(int empNo);
}
