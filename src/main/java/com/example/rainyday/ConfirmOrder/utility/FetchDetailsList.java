package com.example.rainyday.ConfirmOrder.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.rainyday.ConfirmOrder.model.Address;
import com.example.rainyday.ConfirmOrder.model.ProductDetails;


@Component
public class FetchDetailsList {
	
	@Autowired
	ProductList prodStock;
	

	
	Logger log=LoggerFactory.getLogger(FetchDetailsList.class);
	
	
	public List<ProductDetails> fetchProductDetails(Integer orderId) {
		
		
		Map<Integer,List<ProductDetails>> productMap=null;
		
		
		log.info("start of validating orderid");
				if(orderId!=null){
					productMap=prodStock.getlistofproduct();
					
					if(productMap!=null) {
						
						if(productMap.containsKey(orderId)) {
							return productMap.get(orderId);
						}
					}
				}
				return productMap.get(orderId);
	     }
	
public Address fetchCustomerDetails(Integer orderId) {
		
		Map<Integer,Address> customerMap=null;
				if(orderId!=null)
					customerMap=prodStock.getlistofCustomer();
					if(customerMap!=null && customerMap.containsKey(orderId)) {
						
						return customerMap.get(orderId);
						
					}
					return null;
				  }
			
				
			}

	

