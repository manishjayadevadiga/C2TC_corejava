package com.cg.packagetwo;

import com.cg.packageone.TestOne; // this line will be added after we get the error and importing

public class TestThree extends TestOne{ //the class in which method is initialized is parent

	
	// now if you get error while writing TestOne in above line:click it and import the suggestions
	public static void main(String[] args) {
	
		//creating object of child class 
		TestThree t3 = new TestThree();
		System.out.println(t3.id);
		t3.display();
		
		//1.we get error because of private accessibility in T1
		//3.making protected in T1 the output is obtained
		//4.making public in T1 we can get output
		
	}

}
