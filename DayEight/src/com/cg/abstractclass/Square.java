package com.cg.abstractclass;


//concrete class
public class Square extends Shape{

	float side;

	@Override
	void calcArea() {
/* Whenever we want to access parent class in child
  ...use super.variable
 
 
 */
		 super.area=side*side; // area of parent class
//		 area = side; //area of this class
		
	}
	
	
}
