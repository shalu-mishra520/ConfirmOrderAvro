package com.example.rainyday.ConfirmOrder.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.rainyday.ConfirmOrder.utility.ConfirmationOrderId;

@Component
public class OrderDetails {
	
    private Address address;
	
    
	private OrderPlaced orderplaced;
	
	private String confirmationId;
	
	
	
	public String getConfirmationId() {
		return confirmationId;
	}

	public void setConfirmationId(String confirmationId) {
		this.confirmationId = confirmationId;
	}

	private List<ProductDetails> productDetails;
	
		
	public List<ProductDetails> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(List<ProductDetails> productDetails) {
		this.productDetails = productDetails;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public OrderPlaced getOrderplaced() {
		return orderplaced;
	}

	public void setOrderplaced(OrderPlaced orderplaced) {
		this.orderplaced = orderplaced;
	}

}
