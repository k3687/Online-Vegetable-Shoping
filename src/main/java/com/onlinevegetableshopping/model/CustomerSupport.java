package com.onlinevegetableshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customersupport")
public class CustomerSupport {
	
	@Id
	@Column(name="customerid")
	private int customerId;

	public CustomerSupport() {
		super();
		
	}

	public CustomerSupport(int customerId) {
		super();
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "CustomerSupport [customerId=" + customerId + "]";
	}
	
	 
	
	

}
