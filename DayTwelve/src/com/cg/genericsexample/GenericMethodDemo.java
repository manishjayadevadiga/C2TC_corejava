package com.cg.genericsexample;

public class GenericMethodDemo {

	public static void main(String[] args) {
		
		Integer[] intarray= {10,20,30,40};
		String[] stringarray= {"Hello","welcome","to","the","session"};
		Person p1[]=new Person[]{new Person("Manish",22),new Person("Avinash",21)};
		
		GenericMethod gm=new GenericMethod();
		
		
		
		gm.displayArrayElement(intarray);
		gm.displayArrayElement(stringarray); 
		gm.displayArrayElement(p1);

	}

}
