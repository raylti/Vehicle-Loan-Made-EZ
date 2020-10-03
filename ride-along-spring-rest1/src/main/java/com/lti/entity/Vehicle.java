/**
 * Saves vehicle details.
 * @author: Abhinav
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
@Table(name = "veh_det")
@SequenceGenerator(name = "vseq" ,sequenceName = "veh_seq",initialValue =  101,allocationSize = 1)
@NamedQuery(name = "max_id1", query = "SELECT MAX(userId) FROM User")
public class Vehicle {
	
	@Id
	@GeneratedValue(generator = "vseq", strategy = GenerationType.SEQUENCE)
	private int vehicleId;
	
	@Column(length = 25)
	private String vehicleMake;
	@Column(length = 25)
	private String vehicleModel;
	
	private double exShowroomPrice;
	
	@OneToOne
	@JoinColumn(name = "userId")
	private User user;

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	
	public String getVehicleMake() {
		return vehicleMake;
	}

	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public double getExShowroomPrice() {
		return exShowroomPrice;
	}

	public void setExShowroomPrice(double exShowroomPrice) {
		this.exShowroomPrice = exShowroomPrice;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
