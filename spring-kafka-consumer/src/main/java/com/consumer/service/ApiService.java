package com.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consumer.ApIRepository;
import com.consumer.entity.ApiCall;

@Service
public class ApiService {
	
	@Autowired
	private ApIRepository repo;
	
	public void saveData(String Message) {
		ApiCall call =new ApiCall();
		call.setApiStruct(Message);
		repo.save(call);
		System.out.println("added successfully");
	}

}
