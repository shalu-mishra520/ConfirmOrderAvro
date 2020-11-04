package com.example.rainyday.ConfirmOrder.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class OrderPlaced {
	
	private Long orderId;
	
	public OrderPlaced() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<ProductDetails> getlistofproduct(){
	 List<ProductDetails> arraylist = new ArrayList<ProductDetails>();
	 
	 ProductDetails productDetails1=new ProductDetails(1, "coffee", "cello", 150f); 
	 ProductDetails productDetails2=new ProductDetails(2, "tea", "tata", 100f); 
	 ProductDetails productDetails3=new ProductDetails(3, "rice", "fortune", 150f); 
	 ProductDetails productDetails4=new ProductDetails(4, "biscuit", "goodday", 20f); 
	 ProductDetails productDetails5=new ProductDetails(5, "coldrink", "cocacola", 50f); 
	 
	 arraylist.add(productDetails1);
	 arraylist.add(productDetails2);
	 arraylist.add(productDetails3);
	 arraylist.add(productDetails4);
	 arraylist.add(productDetails5);

	 
	 return arraylist;
	 
	}
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	 

}
