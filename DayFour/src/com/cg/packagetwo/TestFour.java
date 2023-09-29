package com.cg.packagetwo;

import com.cg.packageone.TestOne;

public class TestFour {

	public static void main(String[] args) {
		
		//object creation
		TestOne t1 = new TestOne();
		System.out.println(t1.id);
		t1.display();
		
//as per table we can access T1 only within class
//4.making public in T1 we can get output
	}

}
