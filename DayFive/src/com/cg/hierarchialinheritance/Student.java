package com.cg.hierarchialinheritance;

public class Student extends Person{

	
	private int rollno;
	private String studentName;
	
	
	
	//generate getters and setters and to-string
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	
	//to-string
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studentName=" + studentName + ", getAge()=" + getAge()
				+ ", getGender()=" + getGender() + "]";
	}
	
	
}