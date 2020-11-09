package com.example.rainyday.ConfirmOrder.model;

import org.springframework.stereotype.Component;

@Component
public class ProductDetails {

	
	private int productid;
	private String productname;
	private String companyname;
	private float currentPrice;
	
	
	public float getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(float currentPrice) {
		this.currentPrice = currentPrice;
	}
	public ProductDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProductid() {
		return productid;
	}
	
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	
	
	
	
}
