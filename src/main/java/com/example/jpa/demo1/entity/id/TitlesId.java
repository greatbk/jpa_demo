package com.example.jpa.demo1.entity.id;

import com.example.jpa.demo1.common.Constrant;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class TitlesId implements Serializable {

    private int empNo;

    @Column(name = "title")
    private String title;

    @Column(name = "from_date")
    private LocalDate fromDate;

    @Transient
    private String strFromDate;

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

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public String getStrFromDate() {
        if(fromDate != null) {
            setStrFromDate(fromDate.format(Constrant.defaultDateFormat));
        }
        return strFromDate;
    }

    public void setStrFromDate(String strFromDate) {
        this.strFromDate = strFromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }
}
