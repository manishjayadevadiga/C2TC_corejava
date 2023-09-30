package com.cg.statickeyword;

public class StaticMethodDemo {

//	public static void main(String[] args) {  //16.remove and paste in student
		
//9.go to student

		
//13.
		
//		Student s1=new Student(1,"Manish"); //16.remove and paste in student
//		System.out.println(s1);             //16.remove and paste in student
		
		
/* 13..continue...Running the code, we get output as,
 	Student [id=1, name=Manish, college=SMVITM]..even after modification.
 */

//14.
//		System.out.println("---After Modification---");//16.remove and paste in student
		
		/* there are 3 ways to call static method:
		  1.directly with name of your method.
		  2.calling / invoking with class-name.
		  
		  3.Exception: also call with object reference (NOT RECOMMENDED)
		 */
		
	//	s1.modify(); //3rd method --> not need (EXCEPTION) //comment after 16

		
		
/*15.
	We do 2nd way of accessing is:
	whenever static method declaration is in one class...
	... and invocation is in other class
	
	Here static method is inside Student..
	..invoking in static method demo..
	
	here we can use method 2
	..Invoking with class name
*/
//		Student.modify(); //2nd method					//comment after 16
//		System.out.println(s1);                         //comment after 16
		
		//run the code
/* output:
Student [id=1, name=Manish, college=SMVITM]
---After Modification---
Student [id=1, name=Manish, college=Shri Madhwa Vadiraja Institute of Technology and Management]

 */
		
		
/* we do 1st method when:
		place of declaration and invocation are same
*/	
		
		
	}
 // }    ------> comment bracket after 16

