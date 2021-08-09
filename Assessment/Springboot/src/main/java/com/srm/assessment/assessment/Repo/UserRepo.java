package com.srm.assessment.assessment.Repo;

import org.springframework.stereotype.Repository;

import java.util.List;

import com.srm.assessment.assessment.Entity.UserTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface UserRepo extends JpaRepository<UserTable, Integer> {

    @Query("SELECT u FROM UserTable u WHERE u.id= 1")
    List<UserTable> findAll();
}
