package com.restapi.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ordertable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ProductNo;
	private String type;
	private String ProductName;
	private String DateAndTime;
	public int getProductNo() {
		return ProductNo;
	}
	public void setProductNo(int productNo) {
		ProductNo = productNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getDateAndTime() {
		return DateAndTime;
	}
	public void setDateAndTime(String dateAndTime) {
		DateAndTime = dateAndTime;
	}
	public Ordertable() {
		super();
	}
	public Ordertable(String type, String productName, String dateAndTime) {
		super();
		this.type = type;
		ProductName = productName;
		DateAndTime = dateAndTime;
	}
}
