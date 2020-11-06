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
		ProductDetails productDetails=null;
		
		Map<Integer,List<ProductDetails>> productMap=null;
		
		List<ProductDetails> productlist=new ArrayList<ProductDetails>();
		log.info("start of validating orderid");
				if(orderId!=null){
					productMap=prodStock.getlistofproduct();
					
					if(productMap!=null) {
						
						for (Entry<Integer, List<ProductDetails>> entry : productMap.entrySet()){
							{ 
							 
							 if(entry.getKey().equals(orderId)){
								 log.info("Order id: "+entry.getKey() );
								 
								 
								 
								 for(ProductDetails prod: entry.getValue()) {
									 productDetails=new ProductDetails();
									 log.info("product id:"+prod.getProductid());
							    	 productDetails.setProductid(prod.getProductid());
								     productDetails.setProductname(prod.getProductname());
								     productDetails.setCompanyname(prod.getCompanyname());
								     productDetails.setEstimatedprice(prod.getEstimatedprice());
								     log.info("product details val:"+productDetails.getProductid());
								     productlist.add(productDetails);
								  }
							    
								 return productlist;
							  }
							 }
							}
						
						}else {
							System.out.println("inside the fetchproductDetails");
						}
					}
				return productlist;
				
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

	

