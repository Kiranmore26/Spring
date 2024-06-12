package com.practice.Enum;

public class ResponseHandler 
{
	private Boolean status;

	private String message;

	public ResponseHandler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseHandler(Boolean status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
}
