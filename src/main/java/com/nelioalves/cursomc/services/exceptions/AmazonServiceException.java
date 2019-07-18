package com.nelioalves.cursomc.services.exceptions;

public class AmazonServiceException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public AmazonServiceException(String msg) {
		super(msg);
	}

	public AmazonServiceException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
