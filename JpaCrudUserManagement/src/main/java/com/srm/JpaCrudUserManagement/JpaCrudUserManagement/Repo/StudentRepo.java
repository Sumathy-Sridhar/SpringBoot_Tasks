package com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Repo;

import com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Entity.Student;
import com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Entity.StudentPk;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, StudentPk> {

}
