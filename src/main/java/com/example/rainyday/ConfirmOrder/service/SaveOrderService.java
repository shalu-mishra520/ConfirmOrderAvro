package com.example.rainyday.ConfirmOrder.service;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.rainyday.ConfirmOrder.model.Address;
import com.example.rainyday.ConfirmOrder.model.OrderDetails;
import com.example.rainyday.ConfirmOrder.model.OrderPlaced;
import com.example.rainyday.ConfirmOrder.model.ProductDetails;
import com.example.rainyday.ConfirmOrder.serviceInterface.serviceInterface;
import com.example.rainyday.ConfirmOrder.utility.ConfirmationOrderId;
import com.example.rainyday.ConfirmOrder.utility.FetchDetailsList;


@Component
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
		Logger log=LoggerFactory.getLogger(SaveOrderService.class);
		
		List<ProductDetails> productlist=null;
		Map<Integer,Address> addressMap=null;
	    
		
		if(orderId!=null) {
			productlist=fetchlist.fetchProductDetails(orderId.getOrderId());
			
			for(ProductDetails arg:productlist) {
				log.info("after fetching the list:"+arg.getProductid());
			}
			
			address=fetchlist.fetchCustomerDetails(orderId.getOrderId());
			orderPlaced.setOrderId(orderId.getOrderId());
			orderDetails.setOrderplaced(orderPlaced);
			orderDetails.setProductDetails(productlist);
			orderDetails.setAddress(address);
			orderDetails.setConfirmationId(confirmationOrderId.setUniqueID());
			
			
		}
		return orderDetails;

      }

}
