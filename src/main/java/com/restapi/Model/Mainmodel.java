package com.restapi.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mainmodel {
	@Id
	private int ProductNo;
	private String type;
	private String ProductName;
	private String Specifications;
	private String Description;
	public int getProductNo() {
		return ProductNo;
	}
	public void setProductNo(int productNo) {
		ProductNo = productNo;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getSpecifications() {
		return Specifications;
	}
	public void setSpecifications(String specifications) {
		Specifications = specifications;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Mainmodel(int productNo, String productName, String specifications, String description) {
		super();
		ProductNo = productNo;
		ProductName = productName;
		Specifications = specifications;
		Description = description;
	}
	public Mainmodel() {
		super();
	}
	

}
