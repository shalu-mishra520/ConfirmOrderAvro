package com.example.rainyday.ConfirmOrder.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rainyday.ConfirmOrder.model.Address;
import com.example.rainyday.ConfirmOrder.model.OrderDetails;
import com.example.rainyday.ConfirmOrder.model.OrderPlaced;
import com.example.rainyday.ConfirmOrder.model.ProductDetails;
import com.example.rainyday.ConfirmOrder.serviceInterface.serviceInterface;
import com.example.rainyday.ConfirmOrder.utility.ConfirmationOrderId;
import com.example.rainyday.ConfirmOrder.utility.FetchDetailsList;
import com.example.rainyday.ConfirmOrder.utility.ProductList;


@Service
public class SaveOrderService implements serviceInterface{

	@Autowired
	FetchDetailsList fetchlist;
	
	@Autowired
	Address address;
   
	@Autowired
	OrderDetails orderDetails;
	
	@Autowired
	OrderPlaced orderPlaced;
	
	@Autowired
	ProductDetails productDetails;
	
	@Autowired 
	ConfirmationOrderId confirmationOrderId;

	@Override
	public OrderDetails setOrderDetails(OrderPlaced orderId) {

		//search for that orderid
		//set values
		//iterate the values
		
		Map<Integer,List<ProductDetails>> productMap=null;
		Map<Integer,List<Address>> addressMap=null;
		
		if(orderId!=null) {
			productMap=fetchlist.fetchProductDetails(orderId.getOrderId());
			addressMap=fetchlist.fetchCustomerDetails(orderId.getOrderId());
			
			for (Entry<Integer, List<ProductDetails>> entry : productMap.entrySet()){
			     System.out.println("Order id: "+entry.getKey() + ":" +" Product : "+entry.getValue().get(0).getProductid());
			     System.out.println("Order id: "+entry.getKey() + ":" +" Product : "+entry.getValue().get(0).getProductname());
			     System.out.println("Order id: "+entry.getKey() + ":" +" Product : "+entry.getValue().get(0).getCompanyname());
			     System.out.println("Order id: "+entry.getKey() + ":" +" Product : "+entry.getValue().get(0).getEstimatedprice());
			     orderPlaced.setOrderId(orderId.getOrderId());
			     productDetails.setProductid(entry.getValue().get(0).getProductid());
			     productDetails.setProductname(entry.getValue().get(0).getProductname());
			     productDetails.setCompanyname(entry.getValue().get(0).getCompanyname());
			     productDetails.setEstimatedprice(entry.getValue().get(0).getEstimatedprice());
			   }
			
			for (Entry<Integer, List<Address>> entry : addressMap.entrySet()){

				System.out.println("Order id: "+entry.getKey() + ":" +" Customer List: "+entry.getValue().get(0));
				
				address.setStreetname(entry.getValue().get(0).getStreetname());
				address.setCity(entry.getValue().get(0).getCity());
				address.setCountry(entry.getValue().get(0).getCountry());
				address.setPostalcode(entry.getValue().get(0).getPostalcode());
			}
			


			orderDetails.setOrderplaced(orderPlaced);
			orderDetails.setProductDetails(productDetails);
			orderDetails.setAddress(address);
			orderDetails.setConfirmationId(confirmationOrderId.setUniqueID());
			
			
		}
		return orderDetails;

      }

}
