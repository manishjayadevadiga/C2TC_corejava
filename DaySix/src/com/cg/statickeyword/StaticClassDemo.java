package com.cg.statickeyword;

/* 17..continue
 * create class Outer and inside it create class Inner
 */

class Outer{ //we can also have inner classes in Java
	//variable
	
//18.make static
	//int data=10;
	static int data=10;
	
	
	//18...continue..make static class inner
	static class Inner{
		//method
		void msg() {
			System.out.println(data);
		}
		
	}
}



public class StaticClassDemo {

	public static void main(String[] args) {
		
//17..continue
	//invoking method..but first object creation
		
		//objects of Outer
		Outer o =new Outer();
		o.data=20;
		//o.msg();
		
		//creating object of Inner
		
		//we need to add class name Outer...(accessing inside class )
		Outer.Inner i=new Outer.Inner();  
		i.msg();
		
		Outer.Inner i1=new Outer.Inner();  
		i1.msg();

/* NOTE:
 
 		 1)inside a static class you cannot access non-static variable
 		 ...so we made (18).
 		 2)Cannot create object for INNER class with regular syntax.
 		 ..because it is not permitted.
 		 so we make it to be static class.
 		 

 */
		
	}

}
