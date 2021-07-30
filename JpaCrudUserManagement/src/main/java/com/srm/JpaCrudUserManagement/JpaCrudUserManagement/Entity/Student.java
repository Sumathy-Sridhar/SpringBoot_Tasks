package com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode
@Table(name = "composite_Tbl")
@IdClass(StudentPk.class)
public class Student {

    @Id
    private int sid;

    @Id
    private int deptid;

    @Column(name = "sname")
    private String studname;

    @Column(name = "dept")
    private String dept;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getStudname() {
        return studname;
    }

    public void setStudname(String studname) {
        this.studname = studname;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

}