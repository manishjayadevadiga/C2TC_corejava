//ACCESS MODIFIERS 21-09-2023 Thursday

//Access modifiers in java specify the scope of a class , constructor , variable , method or data-member

//4 types of access modifiers in default: public , private , protected , default
// if no keyword is used then it is always DEFAULT

// Tabular Column(Understanding all Access Modifiers):
//*********************************************************************************************************
//                  |          package 1           |||                          package 2

//                                 |different class |                                   | (child class)
// Access Modifiers | within class | within package | outside package by sub-class only | outside package
//                        T1               T2                        T3                        T4
// ------------------------------------------------------------------------------------------------
// private          |      Y       |        N       |                 N                 |       N
// -------------------------------------------------------------------------------------------------
// default          |      Y       |        Y       |                 N                 |       N
// -------------------------------------------------------------------------------------------------
// protected	    |      Y       |        Y       |                 Y                 |       N
// -------------------------------------------------------------------------------------------------
// public           |      Y       |        Y       |                 Y                 |       Y
// --------------------------------------------------------------------------------------------------

//**********************************************************************************************************


//lets write in T1 and access in T2,T3 AND T4

package com.cg.packageone;

//in the below line we cannot give private , protected to class

public class TestOne {
	
	//default is applied below because no keyword is used
		//1.now lets make it private
		//2.making default again
		//3.making protected
		//4.making public
	 public int id=5;
	 public void display() {
		System.out.println("Access Modifiers");
	}
	 
	public static void main(String[] args) {
		
		//object creation
				TestOne t1 = new TestOne();
				System.out.println(t1.id);
				t1.display();
				
	}

}
