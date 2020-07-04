package com.practice.spring.springsleuthserverapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WelcomeController {
	private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(value = "/server")
	public String showMessage() {
		logger.info("Executing in WelcomeController in method showMessage()");

		String response = restTemplate.getForObject("http://localhost:8093/server1", String.class);

		logger.info("Executing in WelcomeController in method showMessage()");

		return response;
	}

}
