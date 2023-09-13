package com.microservice.notification.controller;

import javax.mail.MessagingException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservice.notification.model.EmailDetails;
import com.microservice.notification.serviceImpl.EmailServiceImpl;

@RestController
@RequestMapping(value = "/email")
public class EmailController {

	private static final Logger LOGGER = LogManager.getLogger(EmailController.class);

	static final String SUCCESS = "SUCCESS";
	static final String FAILED = "FAILED";

	@Autowired
	EmailServiceImpl emailServiceImpl;

	@PostMapping
	public ResponseEntity<String> sendOrderEmail(@RequestBody EmailDetails details) throws MessagingException {
		LOGGER.info("Start of sendOrderEmail API");
		boolean orderRegistration = emailServiceImpl.orderRegistration(details);
		if (orderRegistration) {
			return new ResponseEntity<>(SUCCESS, HttpStatus.CREATED);
		} else {
			LOGGER.info("end of sendOrderEmail API");
			return new ResponseEntity<>(FAILED, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
