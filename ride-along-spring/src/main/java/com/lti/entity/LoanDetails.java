package com.lti.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "loan_det")
@SequenceGenerator(name = "loseq" ,sequenceName = "loan_seq",initialValue = 101,allocationSize = 1)

public class LoanDetails {
	
	@Id
	@GeneratedValue(generator = "loseq", strategy = GenerationType.SEQUENCE)
	private int lid;
	
	 private double loanAmount;
	private double interestRate;
	private int tenure;
	
	@OneToOne
	@JoinColumn(name = "user_id")
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
