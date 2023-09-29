//sINGLE INHERITANCE          25-09-2023

//parent(super class / base class) - > child (derived / sub-classes)

package com.cg.singleinheritance;

public class Citizen {
	
	private String name;
	private String aadharno;
	private String address;
	private long phno;
	
	//1.generate getters and setters to all
	//source -> generate getters and setters -> select all -> generate
	
	//2.now generate constructors
	//source -> get constructor using fields -> remove all selections -> generate
	
	public Citizen() {
		super();
	}
	
    //3.now argument constructor
	//source -> get constructor using fields -> select all -> generate
	
	public Citizen(String name, String aadharno, String address, long phno) {
		super();
		this.name = name;
		this.aadharno = aadharno;
		this.address = address;
		this.phno = phno;
	}
	
	
	
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAadharno() {
		return aadharno;
	}
	
	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public long getPhno() {
		return phno;
	}
	
	public void setPhno(long phno) {
		this.phno = phno;
	}

		
	
	//7..continue..generate "to-string"
	
	//13..continued..now irrespective of creating to-string in parent, to-string in child
	//we need to make sure we have inherited part in to-string of child
	
	//14.go to student
	
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharno=" + aadharno + ", address=" + address + ", phno=" + phno + "]";
	}
	
//now internally we are not able to get connected
	//8.go to single inheritance
	
	

}
