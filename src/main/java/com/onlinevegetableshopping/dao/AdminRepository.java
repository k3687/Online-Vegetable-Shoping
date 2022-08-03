package com.onlinevegetableshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online_vegetable_shopping.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
