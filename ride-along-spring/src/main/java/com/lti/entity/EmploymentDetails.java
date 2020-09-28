package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "emp_det")
@SequenceGenerator(name = "eseq", sequenceName = "emp_seq", initialValue = 101,allocationSize = 1)
public class EmploymentDetails {
	
	@Id
	@GeneratedValue(generator = "eseq", strategy = GenerationType.SEQUENCE)
	private int eid;

	@Column(length = 20)
	private String employmentType;
	private double annualSal;
	private double existingEmi;

	@OneToOne
	@JoinColumn(name = "uid")
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
