package com.cg.overloading;

/*
overloading can be :
1.difference of Data-type , same in no.of arguments
2.same in Data-type , different in no.of arguments
3.Different Data-type and different no.of arguments
4.difference in return type --> not concept of overloading
*/

public class MethodOverloading {

	
	//create a method to make addition
	//Method-1 - Two arguments of integer Data-type with integer return type.
	public static int addition(int a, int b) {
		return a+b;
	}
	
	//Method-2 - Two arguments of float Data-type with integer return type.
		public static float addition(float a, float b) {
			return a+b;
		}
		
		//Method-3 - Two arguments of double Data-type with integer return type.
				public static double addition(double a, double b) {
					return a+b;
				}
		
		//Method-4 - 3 arguments of double Data-type with integer return type.
		//method 1 and 4 are unique.
				
		//method 4 is different in no.of arguments
				public static int addition(int a, int b, int c) {
					return a+b;
				}		
		
		//Method-5 - Name similar , No.of arguments ,different data-type (method 4 and 5)
				public static double addition(float a, float b , float c) {   //overloaded 
					return a+b;
				}
				
		//Method-6
//				public static double addition(float a, float b ) {   //change in return type (2,6)
//					return a+b;
//				}
				
				
}
