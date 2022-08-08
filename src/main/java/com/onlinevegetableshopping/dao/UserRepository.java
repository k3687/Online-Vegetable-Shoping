package com.onlinevegetableshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinevegetableshopping.model.FeedBack;
import com.onlinevegetableshopping.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	Object save(FeedBack feedback);

}
