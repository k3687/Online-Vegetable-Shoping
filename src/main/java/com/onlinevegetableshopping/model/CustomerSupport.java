package com.onlinevegetableshopping.model;

import java.util.Set;

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
 * The Class CustomerSupport is the Entity representing CustomerSupport table in database
 * 
 * @author Konasagar, Vijaykumar
 *
 */
@Entity
@Table(name="customersupport")
public class CustomerSupport {
	
	@Id
	@Column(name="customer_Id")
	private int customerId;
	@Column(name="solve_Complaint")
	private String solveComplaint;
	
	
	
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(targetEntity = RaiseComplaint.class)
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "complaint_id")
	private RaiseComplaint raiseComplaints;

	
	/**
	 * CustomerSupport default constructor
	 */
	public CustomerSupport() {
		super();
		
	}


	
	
	public CustomerSupport(int customerId, String solveComplaint, RaiseComplaint raiseComplaints) {
		super();
		this.customerId = customerId;
		this.solveComplaint = solveComplaint;
		this.raiseComplaints = raiseComplaints;
	}




	@Override
	public String toString() {
		return "CustomerSupport [customerId=" + customerId + ", solveComplaint=" + solveComplaint + ", raiseComplaints="
				+ raiseComplaints + "]";
	}




	
	 
	
	

}
