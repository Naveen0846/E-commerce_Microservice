package com.microservice.order.request;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.microservice.order.utils.OrderStatusType;

import lombok.Data;

@Data
public class OrderVo {

	private Integer orId;
	
	private String displayName;

	private long quantity;
	
	private String orderName;

	private String email;

	private OrderStatusType orderStatus;

	private boolean inStock;

	private long amount;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private LocalDate startDate;
}
