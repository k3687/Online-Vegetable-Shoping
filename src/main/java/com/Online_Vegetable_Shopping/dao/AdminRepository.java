package com.Online_Vegetable_Shopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Online_Vegetable_Shopping.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
