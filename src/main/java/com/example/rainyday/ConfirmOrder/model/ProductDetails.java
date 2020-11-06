package com.example.rainyday.ConfirmOrder.model;

import org.springframework.stereotype.Component;

@Component
public class ProductDetails {

	
	private int productid;
	private String productname;
	private String companyname;
	private float estimatedprice;
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
	public float getEstimatedprice() {
		return estimatedprice;
	}
	public void setEstimatedprice(float estimatedprice) {
		this.estimatedprice = estimatedprice;
	}
	@Override
	public String toString() {
		return "ProductDetails [productid=" + productid + ", productname=" + productname + ", companyname="
				+ companyname + ", estimatedprice=" + estimatedprice + "]";
	}
	
	
	
	
}
