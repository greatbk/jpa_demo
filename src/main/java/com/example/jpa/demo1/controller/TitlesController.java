package com.example.jpa.demo1.controller;

import com.example.jpa.demo1.entity.Titles;
import com.example.jpa.demo1.service.titles.TitlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("titles")
public class TitlesController {

    @Autowired
    private TitlesService titlesService;

    @GetMapping("list/{empNo}")
    public ResponseEntity<List<Titles>> retrieveList(@PathVariable int empNo) {
        List<Titles> list = titlesService.findByEmpNo(empNo);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
