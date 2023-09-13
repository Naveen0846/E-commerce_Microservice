package com.microservice.order.response;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.microservice.order.utils.OrderStatusType;

import lombok.Data;

@Data
public class OrderStatusResponse {

	private OrderStatusType orderStatus;

	private long amount;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private LocalDate startDate;

}
