package com.microservice.product.service;

import java.util.List;

import com.microservice.product.model.Product;
import com.microservice.product.request.ProductRequest;
import com.microservice.product.response.ResponseVO;

public interface ProductService {

	public boolean createProduct(ProductRequest productRequest);

	public List<Product> getAllProducts();

	public ResponseVO isProductExists(String name);

}
