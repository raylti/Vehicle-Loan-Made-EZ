package com.lti.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "loan_det")
@SequenceGenerator(name = "loseq" ,sequenceName = "loan_seq",allocationSize = 1,initialValue = 101)

public class LoanDetails {
	
	@Id
	@GeneratedValue(generator = "loseq",strategy = GenerationType.TABLE)
	 
	
	 private double loanAmount;
	private double interestRate;
	private int tenure;
	
	@OneToOne
	@JoinColumn(name = "uid")
	private UserDetails l;

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

	public UserDetails getL() {
		return l;
	}

	public void setL(UserDetails l) {
		this.l = l;
	}
	
	


}
