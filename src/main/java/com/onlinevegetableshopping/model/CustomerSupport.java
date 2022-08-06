package com.onlinevegetableshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class CustomerSupport is the Entity representing CustomerSupport table in database
 * 
 * @author Team4
 *
 */
@Entity
@Table(name="customersupport")
public class CustomerSupport {
	
	@Id
	@Column(name="customerid")
	private int customerId;

	
	/**
	 * CustomerSupport default constructor
	 */
	public CustomerSupport() {
		super();
		
	}

	
	/**
	 * CustomerSupport constructor with fields as parameters
	 * 
	 * @param customerId      the customer Id
	
	 */
	public CustomerSupport(int customerId) {
		super();
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "CustomerSupport [customerId=" + customerId + "]";
	}
	
	 
	
	

}
