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
@Table(name = "loan_det")
@SequenceGenerator(name = "loseq" ,sequenceName = "loan_seq",initialValue = 101,allocationSize = 1)
@NamedQuery(name = "loan_status", query = "FROM LoanDetail WHERE loanStatus =:crl")
@NamedQuery(name = "max_id", query = "SELECT MAX(user_id) FROM UserDetail")
public class LoanDetail {
	
	@Id
	@GeneratedValue(generator = "loseq", strategy = GenerationType.SEQUENCE)
	private int lId;
	
	private double loanAmount;
	private double interestRate;
	private int tenure;
	
	@Column(length = 10)
	private String loanStatus;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private UserDetail user;

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public UserDetail getUser() {
		return user;
	}

	public void setUser(UserDetail user) {
		this.user = user;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
}
