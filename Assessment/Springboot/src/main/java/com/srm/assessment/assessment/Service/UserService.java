package com.srm.assessment.assessment.Service;

import java.util.List;

import com.srm.assessment.assessment.Entity.UserTable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface UserService {

    public List<UserTable> getAllUsers();

    public void addUser(UserTable userRecord);

    public void deleteById(int id);

    public void updateUser(int id, UserTable userRecord);

}
