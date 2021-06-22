package com.capgemini;

import java.util.Scanner;

public class MatrimonialApp {

	public static void main(String[] args) {

		System.out.println("Welcome To Indian Matrimonial:");
		System.out.println("Enjoy everything before marriage only  ..... :)");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your age :");
		int age=sc.nextInt();

		if(age<18)
		{
			throw new InvalidAgeException("Dont worry ,first settle and marry ....");
		}
		else
		{
			System.out.println("Search Your Life Partner.....");
		}
		
	}

}
