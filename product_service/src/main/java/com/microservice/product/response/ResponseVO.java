package com.microservice.product.response;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@JsonInclude(value = Include.NON_NULL)
public class ResponseVO {


	private String statusCode;

	@Builder.Default
	private ResponseType responseType = ResponseType.SUCCESS;

	private String Message;

	private List<?> payloadList;

	private Object payload;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss a")
	private LocalDateTime time;

}
