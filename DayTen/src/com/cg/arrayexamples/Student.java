package com.cg.arrayexamples;

public class Student {

	//private
	private int rollno;
	private String name;
		
	
	
	//access using getters and setters / constructors
	
	

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//constructors
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
}
