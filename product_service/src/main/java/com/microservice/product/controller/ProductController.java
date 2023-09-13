package com.microservice.product.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.microservice.product.model.Product;
import com.microservice.product.request.ProductRequest;
import com.microservice.product.response.ResponseBuilder;
import com.microservice.product.response.ResponseMessage;
import com.microservice.product.response.ResponseVO;
import com.microservice.product.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController extends ResponseBuilder {

	private static final Logger LOGGER = LogManager.getLogger(ProductController.class);

	private final ProductService productService;

	@PostMapping
	public ResponseEntity<ResponseVO> saveProduct(@RequestBody ProductRequest productRequest) {
		LOGGER.info("Start of saveProduct API");
		if (!productService.createProduct(productRequest)) {
			LOGGER.info("placeOrder saveProduct FAILED");
			return buildErrorResponse(ResponseMessage.PRODUCT_SAVE_FAILED);
		}
		return buildSuccessResponse(ResponseMessage.PRODUCT_SAVE_SUCCESS);
	}

	@GetMapping
	public ResponseEntity<ResponseVO> getProductList() {
		LOGGER.info("Start of getProductList API ");
		List<Product> allProducts = productService.getAllProducts();
		if (allProducts.size() == 0) {
			LOGGER.info("getProductList API failed");
			return buildErrorResponse(ResponseMessage.PRODUCT_DETAILS_FETCHED_FAILED);
		}
		LOGGER.info("end of getProductList API ");
		return buildSuccessResponse(allProducts, ResponseMessage.PRODUCT_DETAILS_AVAILABLE);
	}

	@PostMapping(value = "/productExists")
	public ResponseEntity<ResponseVO> productExists(@RequestParam(value = "name") String name) {
		LOGGER.info("Start of productExists API ");
		 ResponseVO productExists = productService.isProductExists(name);
		if (productExists.getStatusCode().equalsIgnoreCase("404 NOT_FOUND")) {
			LOGGER.info("productExists API failed");
			return buildErrorResponse(productExists);
		}
		LOGGER.info("end of productExists API ");
		return buildSuccessResponse(productExists);
	}

}
