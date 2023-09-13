package com.microservice.order.serviceImpl;

import java.time.LocalDate;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microservice.order.model.OrderDetails;
import com.microservice.order.repository.OrderDAO;
import com.microservice.order.request.OrderVo;
import com.microservice.order.response.OrderStatusResponse;
import com.microservice.order.service.OrderService;
import com.microservice.order.utils.OrderStatusType;

@Service
public class OrderServiceImpl implements OrderService {

	private static final Logger LOGGER = LogManager.getLogger(OrderServiceImpl.class);

	@Autowired
	private OrderDAO orderDAO;

	@Override
	public boolean placeOrder(OrderVo orderVo) {
		LOGGER.info("Start of placeOrder");
		boolean orderPlaced;
		OrderDetails details = new OrderDetails();
		details.setInStock(true);
		details.setOrderName(orderVo.getOrderName());
		details.setEmail(orderVo.getEmail());
		details.setAmount(orderVo.getAmount());
		details.setOrderStatus(OrderStatusType.PLACED);
		details.setQuantity(orderVo.getQuantity());
		details.setOrderedDate(LocalDate.now());
		details.setDisplayName(orderVo.getDisplayName());
		orderDAO.save(details);
		orderPlaced = true;
		LOGGER.info("end of placeOrder");
		return orderPlaced;
	}

	@Override
	public List<OrderDetails> fetchOrders() {
		LOGGER.info("Start of fetchOrders");
		List<OrderDetails> findAll = orderDAO.findAll();
		LOGGER.info("end of fetchOrders");
		return findAll;
	}

	@Override
	public OrderDetails findOrderById(Integer orId) {
		LOGGER.info("end of fetchOrders");
		OrderDetails findById = orderDAO.findById(orId).get();
		if (findById != null) {
			LOGGER.info("Orders fetched successfully ");
			return findById;
		} else {
			LOGGER.info("Orders fetching failed");
			return null;
		}
	}

	@Override
	public boolean findOrderStatus(Integer orId) {
		LOGGER.info("start of findOrderStatus");
		OrderStatusResponse response = new OrderStatusResponse();
		boolean oderStatus = true;
		OrderDetails orderDetails = orderDAO.findById(orId).get();
		LOGGER.info("inside of fetchOrders");
		if (orderDetails != null) {
			response.setAmount(orderDetails.getAmount());
			response.setOrderStatus(orderDetails.getOrderStatus());
			response.setStartDate(null);
		} else {
			oderStatus = false;
		}
		LOGGER.info("end of fetchOrders");
		return oderStatus;
	}

	@Override
	public OrderDetails mapVoToOrder(OrderVo orderVo) {
		LOGGER.info("start of mapVoToOrder" + orderVo.getEmail());
		OrderDetails details = new OrderDetails();
		details.setInStock(true);
		details.setOrderName(orderVo.getOrderName());
		details.setEmail(orderVo.getEmail());
		details.setAmount(orderVo.getAmount());
		details.setOrderStatus(OrderStatusType.PLACED);
		details.setQuantity(orderVo.getQuantity());
		details.setOrderedDate(LocalDate.now());
		details.setDisplayName(orderVo.getDisplayName());
		LOGGER.info("end of mapVoToOrder");
		return details;
	}

}
