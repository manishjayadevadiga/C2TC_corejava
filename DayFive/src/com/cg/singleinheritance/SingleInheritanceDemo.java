package com.cg.singleinheritance;

public class SingleInheritanceDemo {

public static void main(String[] args) {
		
		//create objects for student
		//Student s1=new Student();
		
		//9.now lets pass arguments through constructors
		//Student s1=new Student(8,"SMVITM"); //we will be allowed to give only rollno ,collegeName as it is in Student class
		
		
		//16.altering above line as per the suggestions(adding all arguments)
		Student s1=new Student("Manish","0000 0000 0000","Udupi",9876543210l,8,"SMVITM");
		
		
		
		
		//10.to make 9 possible..
		//while generating the constructor(generate from "superclass")....goto Student class
		
		
		//initializing values using setter
		//8.continued...comment below lines
		
		
//		s1.setName("Manish");
//		s1.setAadharno("0000 0000 0000");
//		s1.setAddress("Udupi");
//		s1.setPhno(9876543210l);
//		s1.setRollno(8);
//		s1.setCollegeName("SMVITM");
		
		
		//we don't get output by using only System.out.println(s1);
		//System.out.println(s1);
		// this is the output -> com.cg.singleinheritance.Student@372f7a8d
		
//		System.out.println(s1.getName());
//		System.out.println(s1.getAadharno());
//		System.out.println(s1.getAddress());
//		System.out.println(s1.getPhno());
//		System.out.println(s1.getRollno());
//		System.out.println(s1.getCollegeName());
		
		
//for the above lines we get only a list of answers which is not recognizable to which category it belongs
//		Manish
//		0000 0000 0000
//		Udupi
//		9876543210
//		8
//		SMVITM
		
		
// 4. to solve this error we use " TO STRING "
//    ** whenever we are in need of getting  inputs in collective manner ..make use of to-string method	in respective class	
		
		
		System.out.println(s1); //here s1 is student type variable
		//4.now go to student class and generate "to-string method"
		
		//now run the program..below line will be the output
		//Student [rollno=8, collegeName=SMVITM, getName()=Manish, getAadharno()=0000 0000 0000, getAddress()=Udupi, getPhno()=9876543210, getClass()=class com.cg.singleinheritance.Student]
		

//6. now we don't need "TO STRING" method
//		..go to student class 
		
		
// *******************************
		
		//17.now RUN the code..below is output
// -> Student [rollno=8, collegeName=SMVITM, getName()=Manish, getAadharno()=0000 0000 0000, getAddress()=Udupi, getPhno()=9876543210]
		
//18.here comes the concept of SINGLE INHERITANCE (because we used super-class...
		//so it automatically extracted values from citizen class) 
		
		
	}

}


