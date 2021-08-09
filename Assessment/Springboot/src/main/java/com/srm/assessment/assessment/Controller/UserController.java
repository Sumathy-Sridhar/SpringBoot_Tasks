package com.srm.assessment.assessment.Controller;

import java.util.List;

import com.srm.assessment.assessment.Entity.UserTable;
import com.srm.assessment.assessment.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping(value = "/userlist")
    public ResponseEntity<List<UserTable>> findAllUser() {
        return new ResponseEntity<List<UserTable>>(service.getAllUsers(), HttpStatus.CREATED);
    }

    @PostMapping(value = "/adduser", produces = MediaType.APPLICATION_JSON_VALUE)
    public void addUser(@RequestBody UserTable userRecord) {
        service.addUser(userRecord);
    }

    @PutMapping(value = "/updateuser/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void updateUser(@PathVariable Integer id, @RequestBody UserTable userRecord) {
        service.updateUser(id, userRecord);
    }

    @DeleteMapping(value = "/deluser/{id}")
    public void deleteById(@PathVariable Integer id) {
        service.deleteById(id);
    }

}
