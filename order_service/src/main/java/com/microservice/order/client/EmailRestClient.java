package com.microservice.order.client;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.order.model.OrderDetails;

@Service
public class EmailRestClient {

	@Value("${spring.rest.client}")
	private String restClient;

	private static final Logger LOGGER = LogManager.getLogger(EmailRestClient.class);
	

	RestTemplate restTemplate = new RestTemplate();

	public String sendOrderedEmail(OrderDetails orderDetails) {
		LOGGER.info("Start of sendOrderedEmail API");
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<OrderDetails> entity = new HttpEntity<OrderDetails>(orderDetails, headers);
		String url = restClient + "/email";
		String response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class).getBody();
		LOGGER.info("end of sendOrderedEmail API");
		return response;
	}

}
