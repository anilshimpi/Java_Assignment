package com.yash.SpringIOCTask4;

public class ConstructorMessage {
	
	private String message=null;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ConstructorMessage(String message) {
		super();
		this.message = message;
	}
	
	

}
