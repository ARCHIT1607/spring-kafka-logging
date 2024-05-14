package com.consumer.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.consumer.service.ApiService;

@Configuration
public class kafkaConfig {
	
	@Autowired
	private ApiService service;

	@KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC, groupId = AppConstants.GROUP_ID)
    public void updatedLocation(String value) {
        System.out.println(value);
        service.saveData(value);
        
    }
	
}
