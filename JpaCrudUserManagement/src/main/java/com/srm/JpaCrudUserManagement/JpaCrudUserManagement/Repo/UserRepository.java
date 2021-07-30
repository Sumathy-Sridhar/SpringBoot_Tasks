package com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Repo;

import com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Entity.UserManagement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserManagement, Integer> {

}
