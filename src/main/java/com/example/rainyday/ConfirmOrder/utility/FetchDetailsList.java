package com.example.rainyday.ConfirmOrder.utility;

import java.util.ArrayList;
import java.util.HashMap;
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
	

	@Autowired
	ProductDetails productDetails;
	
	
	public List<ProductDetails> fetchProductDetails(Integer orderId) {
		
		Map<Integer,List<ProductDetails>> productMap=null;
		Map<Integer,List<ProductDetails>> productFetch=new HashMap<Integer, List<ProductDetails>>();
		List<ProductDetails> productlist=new ArrayList<ProductDetails>();
		System.out.println("start of validating orderid");
				if(orderId!=null){
					productMap=prodStock.getlistofproduct();
					System.out.println(productMap);
					if(productMap!=null) {
						
						for (Entry<Integer, List<ProductDetails>> entry : productMap.entrySet()){
							{ 
							 
							 if(entry.getKey().equals(orderId)){
								 System.out.println("Order id: "+entry.getKey() );
								 
								 productFetch.put(entry.getKey(),entry.getValue());
								 for(ProductDetails list: entry.getValue()) {
									 System.out.println("product id:"+list.getProductid());
							    	 productDetails.setProductid(list.getProductid());
								     productDetails.setProductname(list.getProductname());
								     productDetails.setCompanyname(list.getCompanyname());
								     productDetails.setEstimatedprice(list.getEstimatedprice());
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
	
public Map<Integer,Address> fetchCustomerDetails(Integer orderId) {
		
		Map<Integer,Address> customerMap=null;
				if(orderId!=null){
					customerMap=prodStock.getlistofCustomer();
					if(customerMap!=null && customerMap.containsKey(orderId)) {
						
						return customerMap;
						
					}
				  }
				return customerMap;
				
			}

	
}
