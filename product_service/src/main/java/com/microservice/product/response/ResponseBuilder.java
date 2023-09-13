package com.microservice.product.response;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ResponseBuilder {

	protected ResponseEntity<ResponseVO> buildResponse(ResponseVO responseVO) {
		ResponseVO vo = ResponseVO.builder().statusCode(HttpStatus.OK.toString()).time(LocalDateTime.now()).build();
		return new ResponseEntity<ResponseVO>(vo, HttpStatus.OK);
	}

	protected ResponseEntity<ResponseVO> buildSuccessResponse(String message) {
		ResponseVO vo = ResponseVO.builder().statusCode(HttpStatus.OK.toString()).time(LocalDateTime.now())
				.responseType(ResponseType.SUCCESS).Message(message).build();
		return new ResponseEntity<ResponseVO>(vo, HttpStatus.OK);
	}

	protected ResponseEntity<ResponseVO> buildSuccessResponse(Object object, String message) {
		ResponseVO vo = ResponseVO.builder().statusCode(HttpStatus.OK.toString()).time(LocalDateTime.now())
				.responseType(ResponseType.SUCCESS).Message(message).build();
		vo.setPayload(object);
		return new ResponseEntity<ResponseVO>(vo, HttpStatus.OK);
	}

	protected ResponseEntity<ResponseVO> buildErrorResponse(String message) {
		ResponseVO vo = ResponseVO.builder().statusCode(HttpStatus.NOT_FOUND.toString()).time(LocalDateTime.now())
				.responseType(ResponseType.FAIL).Message(message).build();
		return new ResponseEntity<ResponseVO>(vo, HttpStatus.OK);
	}

	protected ResponseEntity<ResponseVO> buildSuccessResponse(List<?> list, String message) {
		ResponseVO vo = ResponseVO.builder().statusCode(HttpStatus.OK.toString()).time(LocalDateTime.now())
				.responseType(ResponseType.SUCCESS).Message(message).build();
		vo.setPayloadList(list);
		return new ResponseEntity<ResponseVO>(vo, HttpStatus.OK);
	}
	
	protected ResponseEntity<ResponseVO> buildErrorResponse(ResponseVO responseVO) {
		ResponseVO vo = ResponseVO.builder().statusCode(HttpStatus.NOT_FOUND.toString()).time(LocalDateTime.now())
				.responseType(ResponseType.FAIL).Message(responseVO.getMessage()).payload(responseVO.getPayload()).build();
		return new ResponseEntity<ResponseVO>(vo, HttpStatus.OK);
	}
	
	protected ResponseEntity<ResponseVO> buildSuccessResponse(ResponseVO responseVO) {
		ResponseVO vo = ResponseVO.builder().statusCode(HttpStatus.OK.toString()).time(LocalDateTime.now())
				.responseType(ResponseType.SUCCESS).Message(responseVO.getMessage()).payload(responseVO.getPayload()).build();
		return new ResponseEntity<ResponseVO>(vo, HttpStatus.OK);
	}

}
