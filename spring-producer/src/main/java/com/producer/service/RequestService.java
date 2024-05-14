package com.producer.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.producer.config.AppConstants;

@Service
public class RequestService {
	
	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
	
	
	public boolean sayHello(Map<String, Object> message) {
		String mapAsString = message.toString();
		this.kafkaTemplate.send(AppConstants.TOPIC_NAME,mapAsString);
		return true;
	}
	
public boolean addFriend(HashMap<String, Object> message) {
	String mapAsString = message.toString();
		this.kafkaTemplate.send(AppConstants.TOPIC_NAME,mapAsString);
		return true;
	}

}
