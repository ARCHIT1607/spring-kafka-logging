package com.producer.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.producer.entity.Friend;
import com.producer.service.RequestService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class RequestController {

	@Autowired
	private RequestService service;

	@GetMapping("/sayHello")
	public ResponseEntity<?> hello(HttpServletRequest request) {
		String method = request.getMethod();
		String host = request.getHeader("host");
		String uri = request.getRequestURI();
		String queryString = request.getQueryString();
		String contentType = request.getContentType();
		HashMap<String, Object> messsage = new HashMap<>();
		messsage.put("sayHello", "Hello from this side");
		messsage.put("host", host);
		messsage.put("method", method);
		messsage.put("uri", uri);
		messsage.put("queryString", queryString);
		messsage.put("contentType", contentType);
		service.sayHello(messsage);
		return new ResponseEntity<>("sayHello sent", HttpStatusCode.valueOf(200));
	}

	@PostMapping("/addFriends")
	public ResponseEntity<?> addFriends(@RequestBody Friend friend) {
		HashMap<String, Object> messsage = new HashMap<>();
		String friend_data = friend.toString();
		messsage.put("friend_data", friend_data);
		service.addFriend(messsage);
		return new ResponseEntity<>("added friend successfully", HttpStatusCode.valueOf(200));
	}

}
