package com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Controller;

import java.util.List;

import com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Entity.Student;
import com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Services.StudentManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api")
@RestController
public class StudentController extends BaseController {

    @Autowired
    private StudentManager studService;

    @GetMapping(value = "/getstud", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> getAllsStudents() {
        return studService.getAllstudents();
    }

    @PostMapping(value = "/poststud", produces = MediaType.APPLICATION_JSON_VALUE)
    public void addUser(@RequestBody Student student) {
        studService.addstudent(student);
    }

}
