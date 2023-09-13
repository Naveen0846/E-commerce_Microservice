package com.microservice.notification.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
@Table(name = "email_details")
public class EmailDetails {

	@Id
	private Integer emId;

	private String displayName;

	private long quantity;

	private String orderName;

	private String email;

	private OrderStatusType orderStatus;

	private boolean inStock;

	private long amount;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private String orderedDate;

}
