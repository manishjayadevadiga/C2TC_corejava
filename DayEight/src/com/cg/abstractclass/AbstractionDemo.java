package com.cg.abstractclass;

public class AbstractionDemo {

	public static void main(String[] args) {
		
//create object for Square / Rectangle
		Square s =new Square();
		
		//direct initialization
		s.side=5;
		
/* whenever we are placing any method inside printing...
   ..then that method must have return type of any primitive type.
   
 */
		//System.out.println(s.calcArea());

		//now altering above
		s.calcArea();

//to overcome above error we call show method.
		s.show(); //this shows output
	}

}
