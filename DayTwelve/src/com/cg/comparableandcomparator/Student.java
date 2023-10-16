package com.cg.comparableandcomparator;

public class Student implements Comparable<Student>{

	
	private int rollno;
	private String name;
	private float cgpa;
	
	
	//getters and setters
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
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	
	
	
	//non-argument constructor
	public Student() {
		super();
	}
	
	
	//argument constructor
	public Student(int rollno, String name, float cgpa) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	
	//to-string
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", cgpa=" + cgpa + "]";
	}
	
	
	
	//comparable -> only single object
	@Override
	public int compareTo(Student o) {
		
	
		return this.name.compareTo(o.name);
	}
	
	
}
