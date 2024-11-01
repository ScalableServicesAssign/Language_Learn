package com.bitswilp.langLearn.api.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value=LanguageNotFoundException.class)
	public ResponseEntity<ErrorDetails> languageIdNotFoundException() {
		
		ErrorDetails error = new ErrorDetails(400, "No id found", new Date());
		
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.BAD_REQUEST);
	}
}
