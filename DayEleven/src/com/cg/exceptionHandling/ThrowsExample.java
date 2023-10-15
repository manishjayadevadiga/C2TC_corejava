package com.cg.exceptionHandling;

import java.io.IOException;

public class ThrowsExample {
public static void validate(int age) throws IOException {
		
		if(age<21 || age>27) {
			//throw arithmetic exception
			throw new IOException("Not eligible");
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
			validate(16);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
