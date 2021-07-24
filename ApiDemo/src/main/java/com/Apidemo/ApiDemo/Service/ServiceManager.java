package com.Apidemo.ApiDemo.Service;

import java.util.List;

import com.Apidemo.ApiDemo.Classes.Employee;

public interface ServiceManager {

    public List<String> getName();

    public void persitEmployee(Employee Emp);

    public List<Employee> fetchAllEmp();

    public List<Employee> getDetails();
}
