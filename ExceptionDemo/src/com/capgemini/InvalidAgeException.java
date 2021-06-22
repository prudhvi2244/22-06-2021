package com.capgemini;

public class InvalidAgeException extends RuntimeException{
	
	public InvalidAgeException() {
		
	}
	
	public InvalidAgeException(String msg) {
		System.out.println(msg);
	}

}
