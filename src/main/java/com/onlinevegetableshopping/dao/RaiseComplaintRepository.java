package com.onlinevegetableshopping.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinevegetableshopping.model.RaiseComplaint;

@Repository
public interface RaiseComplaintRepository extends JpaRepository<RaiseComplaint, Integer>{

}
