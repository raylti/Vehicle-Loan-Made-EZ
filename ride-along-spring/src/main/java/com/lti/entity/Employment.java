/**
 * Saves employment details.
 * @author: Yugandhara
 * @Version:1.0
 * 
 */
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
@NamedQuery(name = "max_id2", query = "SELECT MAX(userId) FROM User")
public class Employment {

	@Id
	@GeneratedValue(generator = "empseq", strategy = GenerationType.SEQUENCE)
	private int employmentId;
	
	@Column(length = 20)
	private String employmentType;
	private double annualIncome;
	private double existingEmi;
	
	@OneToOne
	@JoinColumn(name = "userId")
	private User user;

	public int getemploymentId() {
		return employmentId;
	}

	public void setemploymentId(int employmentId) {
		this.employmentId = employmentId;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public double getExistingEmi() {
		return existingEmi;
	}

	public void setExistingEmi(double existingEmi) {
		this.existingEmi = existingEmi;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
