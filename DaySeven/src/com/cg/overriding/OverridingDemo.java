/*We achieve OVERLOADING inside a single class.
 
 OVERRIDING make use of  concept of Inheritance
 
 

In OVERRIDING:
we have 
1)same no.of arguments , same method name  , same return type ,same access modifiers..
  ..same no.of arguments
  --> only difference is the implementation / body of method / definition of method 

*/



package com.cg.overriding;

public class OverridingDemo {

	public static void main(String[] args) {
		
		RBI r =new RBI();
	System.out.println(r.rateofinterest());	
		
		SBI s=new SBI();
		System.out.println(s.rateofinterest());	
	}

}
