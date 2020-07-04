package com.practice.spring.springsleuthserverapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);
	
	@GetMapping(value = "/server2")
	public String showMessage() {
		logger.info("Executing in WelcomeController in method showMessage()");

		String response = "Finally am there!";

		logger.info("Executing in WelcomeController in method showMessage()");

		return response;
	}

}
