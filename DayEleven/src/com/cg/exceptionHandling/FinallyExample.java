package com.cg.exceptionHandling;

public class FinallyExample {

	public static void main(String[] args) {
		
		try {
		int data=30/3; //exception
		System.out.println(data);
		}
		catch(Exception e) {
			System.out.println(e);//java.lang.ArithmeticException:
		}
		
		//finally-if we want certain things to be run irrespective of exception happening
		finally {
			System.out.println("In finally Block");
		}
	}

}
