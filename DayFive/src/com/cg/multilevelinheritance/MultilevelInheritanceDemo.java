package com.cg.multilevelinheritance;

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		
		
		//city connects both class...so make objects for city
		// so that we can access both country and state
		
	//object creation
		City c=new City();
		c.setCountryName("India");
		
		System.out.println(c);

	}

}
