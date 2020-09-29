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
@NamedQuery(name = "max_id2", query = "SELECT MAX(user_id) FROM UserDetails")
public class EmploymentDetails {

	@Id
	@GeneratedValue(generator = "empseq", strategy = GenerationType.SEQUENCE)
	private int eid;
	
	@Column(length = 20)
	private String employmentType;
	private double annualSal;
	private double existingEmi;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private UserDetails e;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
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

	public UserDetails getE() {
		return e;
	}

	public void setE(UserDetails e) {
		this.e = e;
	}
}
