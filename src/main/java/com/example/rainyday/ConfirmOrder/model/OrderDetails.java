package com.example.rainyday.ConfirmOrder.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.rainyday.ConfirmOrder.utility.ConfirmationOrderId;

@Component
public class OrderDetails {
	
	@Autowired
	private ConfirmationOrderId confirmationorderid;
	
	private String confirmationId;
	
		
	public String getConfirmationId() {
		return confirmationorderid.setUniqueID();
	}

	public void setConfirmationId(String confirmationId) {
		this.confirmationId = confirmationId;
	}

	private Address address;
	
	private OrderPlaced orderplaced;

	
	
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
