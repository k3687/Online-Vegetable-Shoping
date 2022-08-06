package com.onlinevegetableshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinevegetableshopping.model.Cart;
import com.onlinevegetableshopping.model.Vegetable;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

}
