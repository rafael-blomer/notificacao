package com.example.notificacao.infrastructure.exceptions;

public class EmailException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public EmailException(String msg) {
		super(msg);
	}
	
	public EmailException(String msg, Throwable thowable) {
		super(msg, thowable);
	}

}
