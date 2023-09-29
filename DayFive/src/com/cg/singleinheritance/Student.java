//student is child class of citizen

package com.cg.singleinheritance;

public class Student extends Citizen { //use extends to derive from parent

	private int rollno;
	private String collegeName;
	
	//1.generate getters and setters to all
	//source -> generate getters and setters -> select all -> generate
	
	//2.generate constructor..do the previous 2 steps of citizen..one no-select , two - select all
	
	//no selection
//	public Student() {
//		super();
//	}
	
	//select all
	
	//10.continued ...comment below lines(because generate from field)..go below
	
	//fields
	
//	public Student(int rollno, String collegeName) {
//		super();
//		this.rollno = rollno;
//		this.collegeName = collegeName;
//	}
//	
	
//11.....altered field..cut paste "this. " to (12)
//	public Student() {
//		super();
//		
//	}

	//10..continued..generate from super class
	
	//source -> get constructor using "SUPER CLASS" -> select all -> generate
	
	//it is creating the constructor of student with parameters of super-class
	// now add this-> int rollno, String collegeName
	
//*** below is the right way to create constructor in inheritance
	public Student(String name, String aadharno, String address, long phno,int rollno, String collegeName) {
		super(name, aadharno, address, phno);
		
		
		//12.add this from fields
		this.rollno = rollno;
		this.collegeName = collegeName;
	}
	
	//13..now go to Citizen
	//*******
	
	public int getRollno() {
		return rollno;
	}
	

	

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
//5. below is generated "to-string"
	//source->to-string -> select which you want and generate
//	@Override
//	public String toString() {
//		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", getName()=" + getName()
//				+ ", getAadharno()=" + getAadharno() + ", getAddress()=" + getAddress() + ", getPhno()=" + getPhno()
//				+ ", getClass()=" + getClass() + "]";
//	}
//	
//	

	
	
	
//	6..continue..we remove to-string like we done above(commented here)	
	
//	now do--> to-string and select only "rollno and CollegeName"
	
	//generate to-string
	
	//14..continued..
	//comment below lines
	
//	@Override
//	public String toString() {
//		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + "]";
//	}
	
	//15.source->to-string->
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAadharno()=" + getAadharno() + ", getAddress()=" + getAddress() + ", getPhno()=" + getPhno()
				+ "]";
	}

	//16.go to single-inheritance and solve error
	
	
	
//now even though s1 have parent info it is only giving child info..-> output below
//Student [rollno=8, collegeName=SMVITM]
	
	
//7. to solve this..
	// goto parent-1 
	
}
