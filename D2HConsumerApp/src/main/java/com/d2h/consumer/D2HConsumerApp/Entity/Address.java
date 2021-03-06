package com.d2h.consumer.D2HConsumerApp.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	@Id
	@GeneratedValue
	private int ID;
	private String place;
	private String district;
	private String state;
	private Long pinCode;
	
	protected Address() {
		
	}
	public Address(String place, String district, String state, Long pinCode) {
		super();
		this.place = place;
		this.district = district;
		this.state = state;
		this.pinCode = pinCode;
	}
	public int getID() {
		return ID;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getPinCode() {
		return pinCode;
	}
	public void setPinCode(Long pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [id=" + ID +",place=" + place + ", district=" + district + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	

}
