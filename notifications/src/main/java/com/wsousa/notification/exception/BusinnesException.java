package com.wsousa.notification.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class BusinnesException extends RuntimeException {

	public BusinnesException(String message) {
		super(message);
	}
}
