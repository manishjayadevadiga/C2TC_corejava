// STATIC KEYWORD 27-09-2023 Wednesday


/*
NEED OF STATIC KEYWORD:

1.If it is static there will be a close connection with class 
than the object.

USES:(can be used on)
1.Variable 
2.Method
3.Class
4.Block which is static

*/


package com.cg.statickeyword;

public class StaticVariableDemo {

	public static void main(String[] args) {
		
		
//6.After step 5..remove college name from below 2 students		
	//	Student s1=new Student(1,"Manish","SMVITM");
		
		Student s1=new Student(1,"Manish");
		System.out.println(s1);
//4.Now lets do for 2nd student
		Student s2=new Student(2,"Virat");
		System.out.println(s2);
		
/* 6..Now run code..
 		we can see SMVITM is assigned for both students.
  */		
	
		
//7.Lets create 3rd student..and run code
		Student s3=new Student(3,"Ronaldo");
		System.out.println(s3);
		
/*7...output
  
  Student [id=3, name=Ronaldo, college=SMVITM]
  Here college name is  automatically assigned
   because of the use of :static"
 */

//8. Create new class StaticMethodDemo	
		
		
	/*4..output of 2nd student	
		
		Student [id=2, name=Virat, college=SMVITM] 
		
		Now what is happening internally is, we have noticed both are from similar college
		
		Now instead of storing "SMVITM" again and again,
		let us (in Student) make private String college as "static"
		
		
		
		*/
		
		
		
		
		
//1....Here if you want to get output..you must use "To-string"..goto Student
		
/*3.....continue... After running the code ..we will get the below output		
		Student [id=1, name=Manish, college=SMVITM]
*/
		
		
		
	}

}
