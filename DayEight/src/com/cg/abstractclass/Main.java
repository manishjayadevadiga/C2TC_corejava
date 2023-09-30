package com.cg.abstractclass;

public class Main {

	public static void main(String[] args) {
		
		//create objects
		Notes n=new Demo(); //we cannot create object for abstract class
		//above is class which extends abstract (Demo) and give a reference of abstract (Notes) 
		
		//or create object of referenced abstract class
		//Demo d = new Demo();
		n.display();
		n.show();
		
		

	}

}
