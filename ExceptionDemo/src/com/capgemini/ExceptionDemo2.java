package com.capgemini;

public class ExceptionDemo2 {

	public static void f1() throws Exception {
		Class.forName("java.lang.String1");
	}

	public static void main(String[] args)throws Exception {

		System.out.println("Before Exception");
		ExceptionDemo2.f1();
		System.out.println("After Exception");
	}

}
