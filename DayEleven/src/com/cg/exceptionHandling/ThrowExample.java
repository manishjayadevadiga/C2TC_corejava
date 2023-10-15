package com.cg.exceptionHandling;

public class ThrowExample {

	
	
	
	public static void validate(int age) {
		
		if(age<21 || age>27) {
			//throw arithmetic exception
			throw new ArithmeticException("Not eligible");
//Exception in thread "main" java.lang.ArithmeticException: Not eligible
		}
		else
		{
			System.out.println("Eligible to attend military");
		}
		
		
	}
	public static void main(String[] args) {
		//keep method inside try block
		try {
			validate(23);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
