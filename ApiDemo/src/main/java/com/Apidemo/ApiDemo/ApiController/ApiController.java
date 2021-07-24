package com.Apidemo.ApiDemo.ApiController;

import java.util.List;

import com.Apidemo.ApiDemo.Classes.Employee;
import com.Apidemo.ApiDemo.Service.ServiceManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController extends BaseApiController {

    @Autowired
    public ServiceManager sm;

    @PutMapping(value = "/employee", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Employee>> addEmployee(@RequestBody Employee Emp) {
        System.out.println(Emp);
        sm.persitEmployee(Emp);
        return new ResponseEntity<List<Employee>>(sm.fetchAllEmp(), HttpStatus.OK);
    }

    @PostMapping(value = "/employee", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Employee>> updateEmployee(@RequestBody Employee Emp) {
        System.out.println(Emp);
        sm.persitEmployee(Emp);
        return new ResponseEntity<List<Employee>>(sm.fetchAllEmp(), HttpStatus.OK);
    }

    @GetMapping(value = "/names", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getName() {

        return new ResponseEntity<List<String>>(sm.getName(), HttpStatus.OK);
    }
}
