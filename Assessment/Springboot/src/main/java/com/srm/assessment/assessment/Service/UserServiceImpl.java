package com.srm.assessment.assessment.Service;

import java.util.ArrayList;
import java.util.List;

import com.srm.assessment.assessment.Entity.UserTable;
import com.srm.assessment.assessment.Repo.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<UserTable> getAllUsers() {

        List<UserTable> userRecords = new ArrayList<>();
        userRepo.findAll().forEach(userRecords::add);
        return userRecords;

    }

    @Override
    public void addUser(UserTable userRecord) {

        userRepo.save(userRecord);
    }

    @Override
    public void deleteById(int id) {
        userRepo.deleteById(id);

    }

    @Override
    public void updateUser(int id, UserTable userRecord) {
        userRepo.save(userRecord);
    }

}
