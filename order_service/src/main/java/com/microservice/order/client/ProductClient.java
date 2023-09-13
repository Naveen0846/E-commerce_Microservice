package com.microservice.order.client;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.order.model.OrderDetails;
import com.microservice.order.response.ResponseVO;

@Service
public class ProductClient {

	private final String productClient ="http://localhost:9092/";
	private static final Logger LOGGER = LogManager.getLogger(EmailRestClient.class);
	RestTemplate restTemplate = new RestTemplate();
	
	public ResponseVO checkproductExists(OrderDetails orderDetails) {
		LOGGER.info("Start of sendOrderedEmail API");
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(orderDetails.getOrderName(), headers);
		String url = productClient + "product/productExists?name=" + orderDetails.getOrderName();
		 ResponseVO response = restTemplate.exchange(url, HttpMethod.POST, entity, ResponseVO.class).getBody();
		LOGGER.info("end of sendOrderedEmail API");
		return response;
	}
}
