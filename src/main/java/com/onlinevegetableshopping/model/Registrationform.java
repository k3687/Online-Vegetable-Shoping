package com.onlinevegetableshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Registration form is the Entity representing Registrationform table in database
 * 
 * @author Inamdar Akhil
 *
 */
@Entity
@Table(name="registration")
public class Registrationform {
	@Id
	@Column(name="registration_id")
	private int id;
	@Column(name="user_Name")
	private String name;
	@Column(name="user_Password")
	private String password;
	@Column(name="user_Address")
	private String address;
	@Column(name="user_City")
	private String city;
	@Column(name="user_State")
	private String state;
	
	

	
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
	public Registrationform(int id, String name, String password, String address, String city, String state) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.address = address;
		this.city = city;
		this.state = state;
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
	
	/**
	 * gets the  userName
	 * 
	 * @return
	 */

	public String getName() {
		return name;
	}

	/**
	 * setters for the  name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * gets the Password
	 * 
	 * @return
	 */

	public String getPassword() {
		return password;
	}
	
	/**
	 * setters for the  password
	 * 
	 * @param password
	 */

	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * gets the  address
	 * 
	 * @return
	 */

	public String getAddress() {
		return address;
	}

	/**
	 * setters for the  address
	 * 
	 * @param address
	 */

	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * gets the  city
	 * 
	 * @return
	 */
	public String getCity() {
		return city;
	}

	/**
	 * setters for the  city
	 * 
	 * @param city
	 */
	
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * gets the  state
	 * 
	 * @return
	 */

	public String getState() {
		return state;
	}

	/**
	 * setters for the  state
	 * 
	 * @param state
	 */
	
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Registrationform [id=" + id + ", name=" + name + ", password=" + password + ", address=" + address
				+ ", city=" + city + ", state=" + state + "]";
	}
	
	
	
	
	

	
	

	
	


}
