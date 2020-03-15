package com.bhaiti.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.CONFLICT )
//reason = "Record already exist [Duplicate Entry]" 
public class PTPConstraintVoilationException extends org.springframework.dao.DataIntegrityViolationException {
	
	String message = "Record already exist";

	public PTPConstraintVoilationException(String message) {
		super(message);
		this.message = message;
	}

	public PTPConstraintVoilationException(String message, Throwable cause) {
		super(message, cause);
		this.message = message;
		
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}