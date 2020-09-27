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
@Table(name = "users_det")
@SequenceGenerator(name = "useq" ,sequenceName = "users_seq",allocationSize = 1,initialValue = 101)
public class UserDetails {
	
	@Id
	@GeneratedValue(generator = "useq",strategy = GenerationType.TABLE)
	
	private int uid;
	
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
	
	
	private int pincode;
	private int mobileNo;
	
	@OneToOne(mappedBy = "e", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	private EmploymentDetails emp;
	
	@OneToOne(mappedBy = "v", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	private VehicleDetails veh;
	
	@OneToOne(mappedBy = "l", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	private LoanDetails loan;
	

	
	public LoanDetails getLoan() {
		return loan;
	}

	public void setLoan(LoanDetails loan) {
		this.loan = loan;
	}

	public VehicleDetails getVeh() {
		return veh;
	}

	public void setVeh(VehicleDetails veh) {
		this.veh = veh;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public EmploymentDetails getEmp() {
		return emp;
	}

	public void setEmp(EmploymentDetails emp) {
		this.emp = emp;
	}
	
	
	
	
	
	
	
	
	
	

}
