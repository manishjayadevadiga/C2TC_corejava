package com.cg.packageone;

public class TestTwo {

	public static void main(String[] args) {
		
		//1.accessing T1 within package and in different class(T2)--> is not visible because of private
				//object creation
				
						TestOne t1 = new TestOne();
						System.out.println(t1.id);
						t1.display();
						
		// 2. we can get output if accessibility of T1 is default
		//3.making protected in T1 the output is obtained				
		// 4.making public in T1 we can get output


	}

}
