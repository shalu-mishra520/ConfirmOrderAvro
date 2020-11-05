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
		 
         ProductDetails[] productListA= {
        		 new ProductDetails(1,"Amul Butter","Amul",58),
        		 new ProductDetails(2,"Basmti Rice","Rozana",72),
        		 new ProductDetails(3,"Amul Butter","Amul",58)
         }	;	
         
         ProductDetails[] productListB= {
        		 new ProductDetails(4,"Kisaan Ketchup","Ketchup",90),
        		 new ProductDetails(5,"Hakka Noodles","Chigs",70),
        		 new ProductDetails(6,"Lays","American Lays",8)
         }	;	
         ProductDetails[] productListC= {
        		 new ProductDetails(7,"Cadbuary","Dairy Milk",60),
        		 new ProductDetails(8,"Pizza Toppings","ABBC",78),
        		 new ProductDetails(9,"Moong Dal","Raazs",51)
         }	;	
		
         List<ProductDetails> listA= new ArrayList<ProductDetails>();
         listA.addAll(Arrays.asList(productListA));
         
         List<ProductDetails> listB= new ArrayList<ProductDetails>();
         listB.addAll(Arrays.asList(productListB));
         
         List<ProductDetails> listC= new ArrayList<ProductDetails>();
         listC.addAll(Arrays.asList(productListC));
         
         Map<Integer,List<ProductDetails>> stockItems= new HashMap<Integer, List<ProductDetails>>();
        
         stockItems.put(1,listA);
         stockItems.put(2,listB);
         stockItems.put(3,listC);
         return stockItems;
		 
		}
	
	
	public Map<Integer,List<Address>> getlistofCustomer() {
		 
		Address[] customerA= {
        		 new Address("Gk Road 23","New Delhi","India",11009),
        		 new Address("B Road 93","New Delhi","India",11009),
        		 new Address("BN Road 20","Haryana","India",11209)
         }	;	
         
		Address[] customerB= {
       		 new Address("lal Bagh 03","Punjab","India",11089),
       		 new Address("HP 89","UP","India",11090),
       		 new Address("NM Road","Haryana","India",11209)
        }	;	
		Address[] customerC= {
       		 new Address("Gk Road 23","New Delhi","Chandigarh",11009),
       		 new Address("surah road","Mumbai","India",11009),
       		 new Address("YT Hayayt","Gujrat","India",11090)
        }	;	
        
         List<Address> listA= new ArrayList<Address>();
         listA.addAll(Arrays.asList(customerA));
         
         List<Address> listB= new ArrayList<Address>();
         listB.addAll(Arrays.asList(customerB));
         
         List<Address> listC= new ArrayList<Address>();
         listC.addAll(Arrays.asList(customerC));
         
         Map<Integer,List<Address>> customerDetailList= new HashMap<Integer, List<Address>>();
        
         customerDetailList.put(1,listA);
         customerDetailList.put(2,listB);
         customerDetailList.put(3,listC);
         
         

		 
		 return customerDetailList;
		 
		}
	
	


}
 