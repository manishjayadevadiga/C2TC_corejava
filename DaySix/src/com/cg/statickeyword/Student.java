package com.cg.statickeyword;

public class Student {

	//we can make only specific variables to be static
	private int id;
	private String name;
//	private String college;
	
//4..continue..	Altering to static for repeated initialization
	
	private static String college = "SMVITM"; 
	
	/*because we don't need constructor to receive
	inputs again and again */
	
//20. create static block

//23.comment static block
    //	static {
	//		System.out.println("I am a static block");
	//	}
		
	
	
	//1.generate constructor using fields
	
	//5.remove String college ..after making it static in above line.
//	public Student(int id, String name, String college) {
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
		//5..continue...remove below line too
		//this.college = college;
	}

	
	
//10.
	//now instead of SMVITM, we want to give full name
	//Here void modify is a "NON-STATIC METHOD"..because no-static keyword.
	
	public static void modify() {
		
/* 12.making above line static method..
      we can see we get below 2 lines error.
      .because of non-static variables
      
      Now we remove these 2 lines
 
 */
//		id=1;
//		name="Manish";
		college = "Shri Madhwa Vadiraja Institute of Technology and Management";
	}
/* 11.Static Method has some restrictions,
 
       1)it does not allow non-static variables to be accessed.
       
       
 	
 	
 	
 */
	
	/*1. not preferred getters and setters
	..because we have preferred initializing with"constructor with fields"
	*/
	
	
	//2.generate "To-string"
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
	}
	
	//3.run StaticVariableDemo

	//16..continue
	public static void main(String[] args) {
//comment after 20		Student s1=new Student(1,"Manish");
//comment after 20		System.out.println(s1);
//comment after 20		System.out.println("---After Modification---");//16.remove and paste in student
//method 1 ..you can just call modify alone(because inside same class:Student)
//comment after 20		modify();
//comment after 20System.out.println(s1);
		
		//run Student..now instead of in StaticMethodDemo,we get o/p here.
		
/* now if we want to access modify in StaticMethodDemo(use method 2)
		, we must use class name before.
*/

//17.Create new class StaticClassDemo		

		
		
/*		
//19.		 
		 NOW METHOD -4
		 We know main block(public static void main) runs first...
		 ..if and only if if program does not have static block...
		 
		 if it has static block,then it will run first
		 
*/	
		
//21. 
		System.out.println("I am a main method");
		
/*22. So by the  output we can clarify METHOD-4
  
  o/p:
    I am a static block
	I am a main method
 
 */

//23.continue...call modify()
		modify(); //now on commenting static block..main runs first
	}
}
