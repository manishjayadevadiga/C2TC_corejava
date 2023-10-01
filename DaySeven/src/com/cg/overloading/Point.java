//POLYMORPHISM 28-09-2023 Thursday

/* 	POLYMORPHISM :Eg - same key can be used to unlock different locks.
			:Single unit performing multiple tasks.

	TYPES:
	1) Compile time (Overloading)
	2) Runtime      (Over-riding)


Instead of writing addition of different data-types again and again..
...we do "Overloading" --multiple method in single class

Overloading can be applied on:
		1)Method
		2)Constructor
*/



package com.cg.overloading;

public class Point {

	
	//creating instance variable
	private float x;
	private float y;
	private float z;
	
//1.generate non-parameterized constructor(with fields .. uncheck all fields)
	//Constructor 1
	public Point() {
		super();
	}
	
	//generate parameterized constructor(with fields)
	//Constructor 2 ---> Overloaded Constructor
	public Point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	//Constructor 3 --> Overloaded
	public Point(float x) {
		super();
		this.x = x;
	}

/*	
	//Constructor 4
	public Point(float y) {   //-> not overloaded because 3,4 have same no.of arguments and same data-type
		super();
		this.y = y;
	}
*/
	
	//Constructor 4  -> Overloaded
	public Point(float x, float y, float z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	
	
	//generate to-string
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}



	

	
	

	
}
