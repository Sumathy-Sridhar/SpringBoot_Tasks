package com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Repo;

import com.srm.JpaCrudUserManagement.JpaCrudUserManagement.Entity.CardManagement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<CardManagement, Integer> {

}
