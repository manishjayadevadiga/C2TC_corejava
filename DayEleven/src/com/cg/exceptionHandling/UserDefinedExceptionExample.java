package com.cg.exceptionHandling;

import java.util.Scanner;


class InvalidBloodDonateException extends Exception{
	//constructor
	public InvalidBloodDonateException(String s ) {
		super(s);
	}
}
public class UserDefinedExceptionExample {

	
	public static void validate(int age, int weight) throws InvalidBloodDonateException {
		
		if(age<18 || weight <55) {
		
			throw  new InvalidBloodDonateException("Not eligible to donate blood");
		}
		else {
			System.out.println("You are eligible to donate blood");
		}
		
	}
	
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("Enter weight");
		int weight=sc.nextInt();
		
		try {
			validate(age,weight);
		} 
		catch (Exception e) {
			System.out.println("User defined exception occured : " + e);
		}
	}

}
