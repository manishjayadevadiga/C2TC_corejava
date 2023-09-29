//MULTIPLE INHERITANCE 25-09-2023

package com.cg.multipleinheritance;

class Dad{
	void snoring() {
		System.out.println("I have habit of snoring");
	}
}

class Mom{
	void snoring() {
		System.out.println("I have habit of snoring");
	}
}


//class You extends Dad,Mom{
	
	//*** because of AMBIQUITY this type of inheritance is not allowed in java
//}



public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		
	//	You y=new You();
		//now it is confused which snoring to chose..either from Mom or Dad
		

	}

}


//** we cannot achieve this through CLASSES ..it is done only using INTERFACE
