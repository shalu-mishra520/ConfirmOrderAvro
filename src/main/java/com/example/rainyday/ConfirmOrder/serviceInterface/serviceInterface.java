package com.example.rainyday.ConfirmOrder.serviceInterface;


import org.springframework.stereotype.Component;

import com.example.rainyday.ConfirmOrder.model.OrderDetails;
import com.example.rainyday.ConfirmOrder.model.OrderPlaced;


@Component
public interface serviceInterface {
	
	public OrderDetails setOrderDetails(OrderPlaced orderid); 

}
