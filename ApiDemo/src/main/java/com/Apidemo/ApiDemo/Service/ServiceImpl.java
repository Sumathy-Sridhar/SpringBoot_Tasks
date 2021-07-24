package com.Apidemo.ApiDemo.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.Apidemo.ApiDemo.Classes.Employee;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements ServiceManager {

    List<Employee> emplist = new ArrayList<>();

    @Override
    public List<String> getName() {

        return Arrays.asList("Python", "Java", "Javascript", "R", "GoLang");
    }

    @Override
    public void persitEmployee(Employee Emp) {
        emplist.add(Emp);
    }

    @Override
    public List<Employee> fetchAllEmp() {
        return emplist;
    }

}
