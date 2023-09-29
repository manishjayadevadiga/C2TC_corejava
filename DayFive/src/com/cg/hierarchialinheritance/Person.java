package com.cg.hierarchialinheritance;

public class Person {

	private int age;
	private String gender;
	
	
	//1.generate getters and setters
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	//2.generate to-string
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", gender=" + gender + "]";
	}
	
	
	
		
}
