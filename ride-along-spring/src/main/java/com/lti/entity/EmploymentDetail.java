package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "emp_det")
@SequenceGenerator(name = "empseq" ,sequenceName = "empl_seq",initialValue = 101,allocationSize = 1)
@NamedQuery(name = "max_id2", query = "SELECT MAX(user_id) FROM UserDetail")
public class EmploymentDetail {

	@Id
	@GeneratedValue(generator = "empseq", strategy = GenerationType.SEQUENCE)
	private int eId;
	
	@Column(length = 20)
	private String employmentType;
	private double annualSal;
	private double existingEmi;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private UserDetail user;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public double getAnnualSal() {
		return annualSal;
	}

	public void setAnnualSal(double annualSal) {
		this.annualSal = annualSal;
	}

	public double getExistingEmi() {
		return existingEmi;
	}

	public void setExistingEmi(double existingEmi) {
		this.existingEmi = existingEmi;
	}

	public UserDetail getUser() {
		return user;
	}

	public void setUser(UserDetail user) {
		this.user = user;
	}
}
