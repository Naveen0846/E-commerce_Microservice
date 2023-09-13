package com.microservice.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.order.model.OrderDetails;

public interface OrderDAO extends JpaRepository<OrderDetails, Integer> {

}
