
/**
 * Saves User's personal details.
 * @author: Abhinav
 * @Version:1.0
 * 
 */
package com.lti.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@SequenceGenerator(name = "useq" ,sequenceName = "users_seq",initialValue = 101,allocationSize = 1)
public class User {
	
	@Id
	@GeneratedValue(generator = "useq",strategy = GenerationType.SEQUENCE)
	private int userId;
	
	@Column(length = 20)
	private String name;
	
	private int age;
	
	@Column(length = 10)
	private String gender;
	
	@Column(length = 20)
	private String email;
	
	@Column(length = 20)
	private String password;
	
	@Column(length = 30)
	private String address;
	
	
	@Column(length = 15)
	private String state;
	
	@Column(length = 15)
	private String city;
	
	@Column(length = 10)
	private String pincode;
	@Column(length = 15)
	private String mobileNo;
	
	@OneToOne(mappedBy = "user", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	private Employment emp;
	
	@OneToOne(mappedBy = "user", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	private Vehicle veh;
	
	@OneToOne(mappedBy = "user", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	private Loan loan;
	
	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public Vehicle getVeh() {
		return veh;
	}

	public void setVeh(Vehicle veh) {
		this.veh = veh;
	}

	
	public int getuserId() {
		return userId;
	}

	public void setuserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Employment getEmp() {
		return emp;
	}

	public void setEmp(Employment emp) {
		this.emp = emp;
	}
}
