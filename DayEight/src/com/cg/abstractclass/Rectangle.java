package com.cg.abstractclass;


//concrete class
public class Rectangle extends Shape {

	
	float length , breadth;

	@Override
	void calcArea() {
		super.area=length*breadth;
		
	}
	
	
	
}
