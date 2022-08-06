package com.onlinevegetableshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The Class User is the Entity representing User table in database
 * 
 * @author Team4
 *
 */
@Entity
@Table(name="user_details")
public class User {
	
	@Id
	@Column(name="user_Id")
	private int id;
	@Column(name="user_Name")
	private String name;
	@Column(name="user_Password")
	private String password;
	
	
	/**
	 * User default constructor
	 */
	public User() {
		super();
		
	}

	/**
	 * User constructor with fields as parameters
	 * 
	 * @param Id        the Id of user
	 * @param name      the name of user
	 * @param password   the password of user
	 */
	public User(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	/**
	 * gets the Id of user
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * setters for the Id of user 
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * gets the name user
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * setters for the user name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * gets the user password
	 * 
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * setters for the user password
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
		

}
