package com.microservice.order.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.microservice.order.utils.OrderStatusType;

import lombok.Data;

@Entity
@Table(name = "orders")
@Data
public class OrderDetails {

	@Id
	@Column(name = "PRODUCT_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orId;
	
	@Column(name = "DISPLAY_NAME")
	private String displayName;

	@Column(name = "QUANTITY")
	private long quantity;

	@Column(name = "ORDER_NAME")
	private String orderName;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "STATUS")
	private OrderStatusType orderStatus;

	@Column(name = "stock")
	private boolean inStock;

	@Column(name = "TOTAL_AMOUNT")
	private long amount;

	@Column(name = "ordered_date")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private LocalDate orderedDate;

}
