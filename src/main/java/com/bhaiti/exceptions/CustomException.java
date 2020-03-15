package com.bhaiti.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Sorry for the inconvenience. The system will be restored shortly")
public class CustomException extends Exception {

	String message = "Sorry for the inconvenience. The system will be restored shortly";

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public CustomException() {
			super();
		}

	public CustomException(String message) {
			super(message);
			this.message=message;
			this.logger.error(message);
		}

	public CustomException(Throwable cause) {
		
			super(cause);
			cause.printStackTrace();
			this.logger.error(cause.getMessage());
		}

	public CustomException(String message, Throwable cause) {
			super(message, cause);
			this.message=message;
			cause.printStackTrace();
			this.logger.error(this.message);
		}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}