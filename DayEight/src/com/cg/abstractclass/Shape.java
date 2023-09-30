package com.cg.abstractclass;
//shape is parent class

//we can also add abstract class by ticking abstract box during class creation

//abstract class
public abstract class Shape {

	float area;
	
	abstract void calcArea();
	
	void show() {
		System.out.println(" Area of shape: " + area);
	}
}
