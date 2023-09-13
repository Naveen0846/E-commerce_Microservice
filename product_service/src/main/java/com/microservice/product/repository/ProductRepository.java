package com.microservice.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservice.product.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

	Product findByName(String name);
}
