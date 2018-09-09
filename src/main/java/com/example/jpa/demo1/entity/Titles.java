package com.example.jpa.demo1.entity;

import com.example.jpa.demo1.common.Constrant;
import com.example.jpa.demo1.entity.id.TitlesId;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "titles")
public class Titles implements Serializable {

    @EmbeddedId
    private TitlesId id;

    @MapsId("empNo")
    @ManyToOne
    @JoinColumn(name = "emp_no")
    private Employees employees;

    @Column(name = "to_date")
    private LocalDate toDate;

    @Transient
    private String strToDate;

    public TitlesId getId() {
        return id;
    }

    public void setId(TitlesId id) {
        this.id = id;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public String getStrToDate() {
        if(toDate != null) {
            setStrToDate(toDate.format(Constrant.defaultDateFormat));
        }
        return strToDate;
    }

    public void setStrToDate(String strToDate) {
        this.strToDate = strToDate;
    }
}

