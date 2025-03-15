package com.finairo.omni.vo;

import org.springframework.http.HttpStatus;

public class responseVO {
	
	
	private String message = "";
	private HttpStatus code;
	private String token = "";
	
	
	public responseVO(String message, String token,HttpStatus ok) {
		super();
		this.message = message;
		this.code = ok;
		this.token = token;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

	public HttpStatus getCode() {
		return code;
	}

	public void setCode(HttpStatus code) {
		this.code = code;
	}

	
	
	
}
