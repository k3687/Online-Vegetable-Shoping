package com.onlinevegetableshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinevegetableshopping.model.Registrationform;

@Repository
public interface RegistrationRepository extends JpaRepository<Registrationform, Integer> {

}
