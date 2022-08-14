package com.onlinevegetableshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class RaiseComplaint is the Entity representing raisecompliant table in database
 * 
 * @author Konasagar, Vijaykumar



 *
 */
@Entity
@Table(name="raisecomplaint")
public class RaiseComplaint {
	
	@Id
	@Column(name="complaint_id")
	private int complaintId;
	@Column(name="complaint_description")
	private String description;
	


	
	/**
	 * RaiseComplaint default constructor
	 */
	public RaiseComplaint() {
		super();
		
	}

	/**
	 * RaiseComplaint constructor with fields as parameters
	 * 
	 * @param complaintId      the complaint Id
	 * @param description      the  description of complaint
	 * @param users            the complaint of users
	 */

	public RaiseComplaint(int compliantId, String description) {
		super();
		this.complaintId = compliantId;
		this.description = description;
	}


	/**
	 * gets the complaint Id
	 * 
	 * @return
	 */
	public int getCompliantId() {
		return complaintId;
	}

	/**
	 * setters for the complaint Id
	 * 
	 * @param complaintId
	 */
	public void setCompliantId(int compliantId) {
		this.complaintId = compliantId;
	}

	/**
	 * gets the Description of complaint
	 * 
	 * @return
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * setters for the description
	 * 
	 * @param description
	 */

	public void setDescription(String description) {
		this.description = description;
	}

	

	@Override
	public String toString() {
		return "RaiseCompliant [compliantId=" + complaintId + ", description=" + description +  "]";
	}
	
	
	

	
}
