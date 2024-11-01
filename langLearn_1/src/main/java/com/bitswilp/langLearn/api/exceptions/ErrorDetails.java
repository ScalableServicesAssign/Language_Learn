package com.bitswilp.langLearn.api.exceptions;

import java.util.Date;

public class ErrorDetails {
	
	private Integer errorCpdes;
	private String errorDesc;
	private Date date;
	public Integer getErrorCpdes() {
		return errorCpdes;
	}
	public void setErrorCpdes(Integer errorCpdes) {
		this.errorCpdes = errorCpdes;
	}
	public String getErrorDesc() {
		return errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public ErrorDetails(Integer errorCpdes, String errorDesc, Date date) {
		super();
		this.errorCpdes = errorCpdes;
		this.errorDesc = errorDesc;
		this.date = date;
	}
	
	

}
