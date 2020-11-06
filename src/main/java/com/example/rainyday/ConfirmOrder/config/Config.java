package com.example.rainyday.ConfirmOrder.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.config.TopicBuilder;


	
	@Configuration
	@Profile("local")
	public class Config {
		
		  @Bean 
		  public NewTopic libraryEvents() {
			  return TopicBuilder.name("order-details").partitions(3).replicas(3).build(); 
		  }
	}


