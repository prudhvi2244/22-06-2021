package com.capgemini;

public class ExceptionDemo1 {

	public static void main(String[] args) {
	
		System.out.println("Welcome To Exception Handling .................");
		
		int firstNumber=10;
		int secondNumber=2;
		int result=0;
		String s1=null;
		
		try {
			result=firstNumber/secondNumber;
			System.out.println(s1.toUpperCase());
			System.out.println("Result :"+result);
		} 
		
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		catch(NullPointerException npe)
		{
			System.out.println(npe);
		}
		
		catch (Throwable e) {
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("finally block executed");
		}
		
		
		System.out.println("End of main() method");
		
		

	}

}
