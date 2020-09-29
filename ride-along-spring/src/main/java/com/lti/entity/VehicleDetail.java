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
@Table(name = "veh_det")
@SequenceGenerator(name = "vseq" ,sequenceName = "veh_seq",initialValue =  101,allocationSize = 1)
@NamedQuery(name = "max_id1", query = "SELECT MAX(user_id) FROM UserDetail")
public class VehicleDetail {
	
	@Id
	@GeneratedValue(generator = "vseq", strategy = GenerationType.SEQUENCE)
	private int vId;
	
	@Column(length = 15)
	private String carMake;
	@Column(length = 15)
	private String carModel;
	
	private double exPrice;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private UserDetail user;

	public int getvId() {
		return vId;
	}

	public void setvId(int vId) {
		this.vId = vId;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public double getExPrice() {
		return exPrice;
	}

	public void setExPrice(double exPrice) {
		this.exPrice = exPrice;
	}

	public UserDetail getUser() {
		return user;
	}

	public void setUser(UserDetail user) {
		this.user = user;
	}
}
