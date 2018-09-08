package com.example.jpa.demo1.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;

public class TitlesId implements Serializable {

    private int empNo;
    private String title;
    private Calendar fromDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TitlesId titlesId = (TitlesId) o;
        return empNo == titlesId.empNo &&
                Objects.equals(title, titlesId.title) &&
                Objects.equals(fromDate, titlesId.fromDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNo, title, fromDate);
    }
}
