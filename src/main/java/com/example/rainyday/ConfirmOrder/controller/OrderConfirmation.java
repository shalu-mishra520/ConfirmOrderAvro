package com.example.rainyday.ConfirmOrder.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rainyday.ConfirmOrder.model.OrderDetails;


@RestController
public class OrderConfirmation {
	
	@Autowired
	OrderDetails orderdetails;
	
	@PostMapping("/order")
	public ResponseEntity<String> getOrderid( @RequestBody String orderid) {
		
		Logger logger = LoggerFactory.getLogger(getClass());
		logger.info(orderid);
		String confirmationid= orderdetails.getConfirmationId();
		
		return ResponseEntity.status(HttpStatus.OK).body("Your order is successfully placed withconfirmationid" +confirmationid);
		
	}
	
	
	
	
}
