package com.bitswilp.langLearn.api.exceptions;

public class LanguageNotFoundException extends RuntimeException{
	
	private String message;
	
	public LanguageNotFoundException() {}
	
	public LanguageNotFoundException(String message) {
		super(message);
		
		this.message = message;
	}

}
