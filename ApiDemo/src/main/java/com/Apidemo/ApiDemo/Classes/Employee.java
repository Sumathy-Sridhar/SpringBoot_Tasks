package com.Apidemo.ApiDemo.Classes;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Employee {

    private int empid;
    private String empname;
    private String designation;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date doj;

    public int getEmpid() {
        return empid;
    }

    @Override
    public String toString() {
        return "Employee Details: [designation=" + designation + ", doj=" + doj + ", empid=" + empid + ", empname="
                + empname + "]";
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

}
