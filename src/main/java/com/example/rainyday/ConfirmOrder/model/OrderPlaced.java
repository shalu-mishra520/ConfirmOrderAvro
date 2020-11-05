package com.example.rainyday.ConfirmOrder.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class OrderPlaced {
	
	private Integer orderId;
	
	public OrderPlaced() {
		super();
		// TODO Auto-generated constructor stub
	}
		public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	 

}
