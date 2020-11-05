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
		
		List<ProductDetails> productlist=null;
		Map<Integer,Address> addressMap=null;
	    
		
		if(orderId!=null) {
			productlist=fetchlist.fetchProductDetails(orderId.getOrderId());
			
			for(ProductDetails arg:productlist) {
				System.out.println("after fetching the list:"+arg.getProductid());
			}
			
			addressMap=fetchlist.fetchCustomerDetails(orderId.getOrderId());
			for (Entry<Integer,Address> entry : addressMap.entrySet()){
				System.out.println("Order id: "+entry.getKey() + ":" +" Customer List: "+entry.getValue().getStreetname());
				address.setStreetname(entry.getValue().getStreetname());
				address.setCity(entry.getValue().getCity());
				address.setCountry(entry.getValue().getCountry());
				address.setPostalcode(entry.getValue().getPostalcode());
			}
			

			orderPlaced.setOrderId(orderId.getOrderId());
			orderDetails.setOrderplaced(orderPlaced);
			orderDetails.setProductDetails(productlist);
			orderDetails.setAddress(address);
			orderDetails.setConfirmationId(confirmationOrderId.setUniqueID());
			
			
		}
		return orderDetails;

      }

}
