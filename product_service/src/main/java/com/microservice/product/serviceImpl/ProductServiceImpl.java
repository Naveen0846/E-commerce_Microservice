package com.microservice.product.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.microservice.product.controller.ProductController;
import com.microservice.product.model.Product;
import com.microservice.product.repository.ProductRepository;
import com.microservice.product.request.ProductRequest;
import com.microservice.product.response.ResponseVO;
import com.microservice.product.service.ProductService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

	private static final Logger LOGGER = LogManager.getLogger(ProductController.class);

	private final ProductRepository productRepository;

	public boolean createProduct(ProductRequest productRequest) {
		LOGGER.info("Start of createProduct ");
		boolean productSaved = false;
		Product product = Product.builder().name(productRequest.getName()).description(productRequest.getDescription())
				.price(productRequest.getPrice()).build();

		productRepository.save(product);
		productSaved = true;
		LOGGER.info("end of createProduct ");
		return productSaved;
	}

	public List<Product> getAllProducts() {
		LOGGER.info("Start of getAllProducts ");
		List<Product> findAll = productRepository.findAll();
		if (findAll.size() > 0) {
			LOGGER.info("Product list exists ");
			return productRepository.findAll();
		}
		LOGGER.info("Product list is empty ");
		return null;
	}

	@Override
	public ResponseVO isProductExists(String name) {
		LOGGER.info("start of isProductExists");
		ResponseVO response = new ResponseVO();
		Product product = productRepository.findByName(name);
		if (product != null) {
			response.setMessage("PRODUCT AVAILABLE");
			response.setPayload(product);
			response.setStatusCode(HttpStatus.OK.toString());
			response.setTime(LocalDateTime.now());
			LOGGER.info("Product Available");
			return response;
		}
		LOGGER.info("Product not available ");
		response.setMessage("PRODUCT NOT AVAILABLE");
		response.setPayload(null);
		response.setStatusCode(HttpStatus.NOT_FOUND.toString());
		response.setTime(LocalDateTime.now());
		return response;
	}

}
