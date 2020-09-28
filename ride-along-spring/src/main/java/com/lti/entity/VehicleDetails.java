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
@Table(name = "vehicle_det")
@SequenceGenerator(name = "vseq" ,sequenceName = "veh_seq",initialValue =  101)
public class VehicleDetails {
	
	@Id
	@GeneratedValue(generator = "vseq", strategy = GenerationType.SEQUENCE)
	private int vid;
	
	@Column(length = 15)
	private String carMake;
	@Column(length = 15)
	private String carModel;
	
	private double exPrice;
	
	@OneToOne
	@JoinColumn(name = "uid")
	private UserDetails v;

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

	public UserDetails getV() {
		return v;
	}

	public void setV(UserDetails v) {
		this.v = v;
	}
	
	
	
	
	
	

}
