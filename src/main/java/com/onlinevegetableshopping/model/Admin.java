package com.onlinevegetableshopping.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * The Class Admin is the Entity representing Admin table in database
 * 
 * @author Inamdar Akhil
 *
 */

@Entity
@Table(name="admin")
public class Admin {
	@Id
	@Column(name="admin_id")
	private int adminId;
	@Column(name="admin_name")
	private String adminName;
	@Column(name="admin_password")
	private String adminPassword;
	
	
	/**
	 * Admin default constructor
	 */
	public Admin() {
		
	}
	
	
	/**
	 * Admin constructor with fields as parameters
	 * 
	 * @param adminId      the admin Id
	 * @param adminName      the  name of admin
	 * @param adminPassword   the password of admin
	 * @param vegetable   the add vegetables by admin
	 */



	public Admin(int adminId, String adminName, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
	}

	/**
	 * gets the Admin Id
	 * 
	 * @return
	 */
	public int getAdminId() {
		return adminId;
	}

	/**
	 * setters for the admin Id
	 * 
	 * @param adminId
	 */
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	/**
	 * gets the admin name
	 * 
	 * @return
	 */

	public String getAdminName() {
		return adminName;
	}

	/**
	 * setters for the admin name
	 * 
	 * @param adminName
	 */
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
	/**
	 * gets the admin password
	 * 
	 * @return
	 */

	public String getAdminPassword() {
		return adminPassword;
	}
	
	/**
	 * setters for the admin password
	 * 
	 * @param adminPassword
	 */

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}


	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword + "]";
	}


}
