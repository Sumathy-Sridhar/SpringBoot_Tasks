package com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Services;

import java.util.ArrayList;
import java.util.List;

import com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Entity.Student;
import com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Repo.StudentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentImpl implements StudentManager {

    @Autowired
    private StudentRepo sp;

    @Override
    public void addstudent(Student stud) {

        sp.save(stud);

    }

    @Override
    public List<Student> getAllstudents() {
        List<Student> studList = new ArrayList<>();
        sp.findAll().forEach(studList::add);
        return studList;

    }

}
