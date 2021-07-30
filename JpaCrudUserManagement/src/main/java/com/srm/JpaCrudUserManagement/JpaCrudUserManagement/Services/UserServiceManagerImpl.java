package com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Services;

import java.util.ArrayList;
import java.util.List;
import com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Entity.UserManagement;
import com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceManagerImpl implements UserServiceManager {

    @Autowired
    private UserRepository userRepo;

    @Override
    public List<UserManagement> getAllUsers() {

        List<UserManagement> userRecords = new ArrayList<>();
        userRepo.findAll().forEach(userRecords::add);
        return userRecords;

    }

    @Override
    public void addUser(UserManagement userRecord) {

        userRepo.save(userRecord);
    }

    @Override
    public void deleteById(int id) {
        userRepo.deleteById(id);

    }

    @Override
    public void updateUser(int id, UserManagement userRecord) {
        userRepo.save(userRecord);
    }

}
