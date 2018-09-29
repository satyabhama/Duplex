package com.bml.vo;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Consignment")
public class LoginDetailsVO {

	@Id
	private BigInteger  id;

	private String conID;
	private String deliveryDate;
	private String pickupDate;
	public LoginDetailsVO(String conID, String deliveryDate, String pickupDate) {
		// TODO Auto-generated constructor stub
		
		 this.conID = conID;
		    this.deliveryDate = deliveryDate;
		    this.pickupDate = pickupDate;
	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getConID() {
		return conID;
	}
	public void setConID(String conID) {
		this.conID = conID;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getPickupDate() {
		return pickupDate;
	}
	public void setPickupDate(String pickupDate) {
		this.pickupDate = pickupDate;
	}


	
}
