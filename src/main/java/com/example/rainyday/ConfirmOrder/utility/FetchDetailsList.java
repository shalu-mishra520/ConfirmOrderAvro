package com.example.rainyday.ConfirmOrder.utility;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.rainyday.ConfirmOrder.model.Address;
import com.example.rainyday.ConfirmOrder.model.ProductDetails;


@Component
public class FetchDetailsList {
	
	@Autowired
	ProductList prodStock;
	
	public Map<Integer,List<ProductDetails>> fetchProductDetails(Integer orderId) {
		
		Map<Integer,List<ProductDetails>> productMap=null;
				if(orderId!=null){
					productMap=prodStock.getlistofproduct();
					if(productMap!=null && productMap.containsKey(orderId)) {
						
						return productMap;
						
					}
					/*
					 * for (Entry<Integer, List<ProductDetails>> entry : productMap.entrySet()){
					 * 
					 * System.out.println("Order id: "+entry.getKey() + ":"
					 * +" Product List: "+entry.getValue());
					 * 
					 * if(entry.getKey().equals(orderId)){
					 * 
					 * }
					 * 
					 * }
					 */
				}
				return productMap;
				
			}
	
public Map<Integer,List<Address>> fetchCustomerDetails(Integer orderId) {
		
		Map<Integer,List<Address>> customerMap=null;
				if(orderId!=null){
					customerMap=prodStock.getlistofCustomer();
					if(customerMap!=null && customerMap.containsKey(orderId)) {
						
						return customerMap;
						
					}
				  }
				return customerMap;
				
			}

	
}
