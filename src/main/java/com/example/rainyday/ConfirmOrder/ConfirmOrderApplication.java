package com.example.rainyday.ConfirmOrder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.rainyday.ConfirmOrder.controller.OrderConfirmation;
import com.example.rainyday.ConfirmOrder.utility.ConfirmationOrderId;

@SpringBootApplication
public class ConfirmOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfirmOrderApplication.class, args);
		
		
}
}
