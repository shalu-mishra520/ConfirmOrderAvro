package com.example.rainyday.ConfirmOrder.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class ConfirmationOrderId {
	
	
Logger logger = LoggerFactory.getLogger(ConfirmationOrderId.class);

	
	public String setUniqueID(){ 
		DateFormat dateFormat = new SimpleDateFormat("yyddmm");
		Date date = new Date();
		String dt=String.valueOf(dateFormat.format(date)); 
		Calendar cal = Calendar.getInstance(); 
		SimpleDateFormat time = new SimpleDateFormat("HHmm"); 
		String tm= String.valueOf(time.format(new Date()));
		String id= dt+tm; 
		logger.info(id);
		return id;
	 
	 }

}
