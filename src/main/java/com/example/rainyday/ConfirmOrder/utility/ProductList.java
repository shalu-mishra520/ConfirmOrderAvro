package com.example.rainyday.ConfirmOrder.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.rainyday.ConfirmOrder.model.Address;
import com.example.rainyday.ConfirmOrder.model.ProductDetails;

@Component
public class ProductList {
	
	
	public Map<Integer,List<ProductDetails>> getlistofproduct() {
		
		ProductDetails prodA1=new ProductDetails();
		/*
		 * ProductDetails prodB1=new ProductDetails(); ProductDetails prodC1=new
		 * ProductDetails();
		 */
		prodA1.setProductid(1);
		prodA1.setProductname("Amul Butter");
		prodA1.setCompanyname("Amul");
		prodA1.setEstimatedprice(58);
		
		/*
		 * prodB1.setProductid(2); prodB1.setProductname("Basmti Rice");
		 * prodB1.setCompanyname("Rozana"); prodB1.setEstimatedprice(72);
		 * 
		 * prodC1.setProductid(3); prodC1.setProductname("Amul Milk");
		 * prodC1.setCompanyname("Amul"); prodC1.setEstimatedprice(98);
		 */
		ProductDetails prodA2=new ProductDetails();
		/*
		 * ProductDetails prodB2=new ProductDetails(); ProductDetails prodC2=new
		 * ProductDetails();
		 */
		prodA2.setProductid(4);
		prodA2.setProductname("Kisaan Ketchup");
		prodA2.setCompanyname("Kissan");
		prodA2.setEstimatedprice(90);
		
		/*
		 * prodB2.setProductid(5); prodB2.setProductname("Hakka Noodles");
		 * prodB2.setCompanyname("Hakka"); prodB2.setEstimatedprice(72);
		 * 
		 * prodC2.setProductid(6); prodC2.setProductname("Cadbuary");
		 * prodC2.setCompanyname("Amul"); prodC2.setEstimatedprice(45);
		 * 
		 */
		
		ArrayList<ProductDetails> productA=new ArrayList<ProductDetails>();
		ArrayList<ProductDetails> productB=new ArrayList<ProductDetails>();
		
		productA.add(prodA1);
		productB.add(prodA2);
		
		 
        Map<Integer,List<ProductDetails>> stockItems= new HashMap<Integer, List<ProductDetails>>();
        
         stockItems.put(1,productA);
         stockItems.put(2,productB);
         
         return stockItems;
		 
		}
	
	
	public Map<Integer,Address> getlistofCustomer() {
		 
		Address customerA= new Address("Gk Road 23","New Delhi","India",11009);	
         
		Address customerB= new Address("lal Bagh 03","Punjab","India",11089);	
		Address customerC= new Address("Gk Road 23","New Delhi","Chandigarh",11009);	
        
         
         
         Map<Integer,Address> customerDetailList= new HashMap<Integer,Address>();
        
         customerDetailList.put(1,customerA);
         customerDetailList.put(2,customerB);
         customerDetailList.put(3,customerC);
          return customerDetailList;
		 
		}
	
	


}
 