package com.cg.overloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		
		//accessing static method outside declaration class.
		//By using class name.(Classname.method)
		
		Point p=new Point(); //1st constructor will be called
//		Point p1=new Point(3.0,5.0,8.0); // error because float and double conflict
		Point p2=new Point (3.0f,5.0f,8.0f);  //4th constructor will be called
		
		
	System.out.println(	MethodOverloading.addition(10,20)); //method-1 will run
		MethodOverloading.addition(25.0f,50.0f); //method-2 will run
		MethodOverloading.addition(25.0,50.0);   //no method will work-Data type not provided
		
		
		
	}

}
