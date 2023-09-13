package com.microservice.order.service;

import java.util.List;

import com.microservice.order.model.OrderDetails;
import com.microservice.order.request.OrderVo;

public interface OrderService {

	public boolean placeOrder(OrderVo orderVo);

	public List<OrderDetails> fetchOrders();
	
	public OrderDetails findOrderById(Integer orId);
	
	public boolean findOrderStatus(Integer orId);

	OrderDetails mapVoToOrder(OrderVo orderVo);
}
