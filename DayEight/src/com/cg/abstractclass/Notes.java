//ABSTRACTION and abstract keyword   29-09-2023 Friday

package com.cg.abstractclass;

public abstract class Notes {

	
//(1)now let us see if constructor can be done in abstract classes
// Yes, we can also have constructors
	public Notes() {
	
}
	
	
	//non-abstract method
	void display() {
		System.out.println("Display Method"); 
	}
	
	//if you want to hide ..give semicolon and give keyword abstract
	//abstraction hides implementation
	//abstract method
	abstract void show(); 
	
	
	
/*Abstract Classes
	1.abstract keyword
		if we want to make a class abstract...
		use keyword "abstract"
	if no keyword....its non-abstract class
	
	2.Can have Variable + Methods + Constructors
	
	Method = combination of abstract and non-abstract method
		
		
NOTE: whenever you want to create an abstract method in a class..make class as abstract also

	3.If abstract method is present in a class,it is mandate to make the class as abstract
	hence, make Notes as abstract class.
	
	4.cannot instantiate abstract class
	 
	 
*/	
	
	
}
