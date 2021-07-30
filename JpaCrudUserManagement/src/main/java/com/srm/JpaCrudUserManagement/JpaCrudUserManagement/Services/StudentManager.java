package com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Services;

import java.util.List;

import com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Entity.Student;

public interface StudentManager {

    public void addstudent(Student Stud);

    public List<Student> getAllstudents();
}
