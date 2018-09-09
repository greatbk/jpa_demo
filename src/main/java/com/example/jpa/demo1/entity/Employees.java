package com.example.jpa.demo1.entity;

import com.example.jpa.demo1.common.Constrant;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "employees")
public class Employees implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "emp_no")
    private int empNo;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "hire_date")
    private LocalDate hireDate;

    @Transient
    private String strBirthDate;

    @Transient
    private String strHireDate;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getStrBirthDate() {
        if(birthDate != null) {
            setStrBirthDate(birthDate.format(Constrant.defaultDateFormat));
        }
        return strBirthDate;
    }

    public void setStrBirthDate(String strBirthDate) {
        this.strBirthDate = strBirthDate;
    }

    public String getStrHireDate() {
        if(hireDate != null) {
            setStrHireDate(hireDate.format(Constrant.defaultDateFormat));
        }
        return strHireDate;
    }

    public void setStrHireDate(String strHireDate) {
        this.strHireDate = strHireDate;
    }
}
