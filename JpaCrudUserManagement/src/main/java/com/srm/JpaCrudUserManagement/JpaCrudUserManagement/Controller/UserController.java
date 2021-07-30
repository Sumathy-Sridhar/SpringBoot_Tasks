package com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Controller;

import java.util.List;
import com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Entity.UserManagement;
import com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Services.UserServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
public class UserController extends BaseController {

    @Autowired
    private UserServiceManager service;

    @GetMapping(value = "/userlist", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserManagement> getAllUser() {
        return service.getAllUsers();
    }

    @PostMapping(value = "/adduser", produces = MediaType.APPLICATION_JSON_VALUE)
    public void addUser(@RequestBody UserManagement userRecord) {
        service.addUser(userRecord);
    }

    @PutMapping(value = "/updateuser/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void updateUser(@PathVariable Integer id, @RequestBody UserManagement userRecord) {
        service.updateUser(id, userRecord);
    }

    @DeleteMapping(value = "/deluser/{id}")
    public void deleteById(@PathVariable Integer id) {
        service.deleteById(id);
    }

}
