package com.example.jpa.demo1.repository;

import com.example.jpa.demo1.entity.Titles;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TitlesRepository extends CrudRepository<Titles, Integer> {

    @Query("SELECT t FROM Titles t WHERE t.id.empNo = :empNo ORDER BY t.id.fromDate ASC")
    List<Titles> findByEmpNo(@Param("empNo") int empNo);
}
