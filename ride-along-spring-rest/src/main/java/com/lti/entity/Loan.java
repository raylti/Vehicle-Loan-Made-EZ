/**
 * Saves Loan details.
 * @author: Yugandhara
 * @Version:1.0
  
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
@Table(name = "loan_det")
@SequenceGenerator(name = "loseq" ,sequenceName = "loan_seq",initialValue = 101,allocationSize = 1)
@NamedQuery(name = "loan_status", query = "FROM Loan WHERE loanStatus =:crl")
@NamedQuery(name = "max_id", query = "SELECT MAX(userId) FROM User")
public class Loan {
	
	@Id
	@GeneratedValue(generator = "loseq", strategy = GenerationType.SEQUENCE)
	private int loanId;
	
	private double loanAmount;
	private double interestRate;
	private int tenure;
	
	@Column(length = 10)
	private String loanStatus;
	
	@OneToOne
	@JoinColumn(name = "userId")
	private User user;

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

	public int getloanId() {
		return loanId;
	}

	public void setloanId(int loanId) {
		this.loanId = loanId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
}
