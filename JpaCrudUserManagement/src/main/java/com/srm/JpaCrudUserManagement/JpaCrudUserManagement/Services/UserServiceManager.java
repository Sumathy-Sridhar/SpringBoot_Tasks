package com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Services;

import java.util.List;

import com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Entity.UserManagement;
import com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface UserServiceManager {

    public List<UserManagement> getAllUsers();

    public void addUser(UserManagement userRecord);

    public void deleteById(int id);

    public void updateUser(int id, UserManagement userRecord);

}
