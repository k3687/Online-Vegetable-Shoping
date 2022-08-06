package com.onlinevegetableshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Registrationform is the Entity representing Registrationform table in database
 * 
 * @author Team4
 *
 */
@Entity
@Table(name="registration")
public class Registrationform {
	@Id
	@Column(name="registration_id")
	private int id;

	
	/**
	 * Registration default constructor
	 */
	public Registrationform() {
		super();
		
	}
	
	/**
	 * Registrationform constructor with fields as parameters
	 * 
	 * @param registration_id      the registration_id
	 *
	 */
	public Registrationform(int id) {
		super();
		this.id = id;
	}



	/**
	 * gets the  Id
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * setters for the  Id
	 * 
	 * @param Id
	 */
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Registrationform [id=" + id + "]";
	}
	

	
	


}
