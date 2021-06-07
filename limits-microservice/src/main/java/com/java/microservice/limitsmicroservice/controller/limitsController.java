package com.java.microservice.limitsmicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.microservice.limitsmicroservice.bean.limits;
import com.java.microservice.limitsmicroservice.configuration.Configuration;

@RestController
public class limitsController {
	
	@Autowired
	private Configuration config;
	
	@GetMapping("/limits")
	public limits getLimits() {
		
		return new limits(config.getMinimum(), config.getMaximum());
		
		//return new limits(1, 999);
		
	}

}
