package com.example.jpa.demo1.repository;

import com.example.jpa.demo1.entity.Titles;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TitlesRepository extends CrudRepository<Titles, Integer> {

    List<Titles> findByEmpNo(int empNo);
}
