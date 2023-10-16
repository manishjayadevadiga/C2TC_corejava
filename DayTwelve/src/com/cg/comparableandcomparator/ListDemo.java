package com.cg.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
	
/*		
	List<Student> studentList=new ArrayList();
	studentList.add(new Student(11,"Manish",7.8f));
	studentList.add(new Student(21,"Anurag",8.5f));
	studentList.add(new Student(13,"Vibha",6.8f));
	studentList.add(new Student(41,"Ridha",7.2f));
	
	System.out.println("---Before Sorting---");
	System.out.println(studentList);

	Collections.sort(studentList); 
	
	System.out.println("---After Sorting---");
	System.out.println(studentList);	
	*/

		
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Manish","Udupi"));
		personList.add(new Person("Anurag","Mumbai"));
		personList.add(new Person("Vibha","Delhi"));
		personList.add(new Person("Ridha","Kolkata"));
		
		System.out.println("---Before Sorting---");
		System.out.println(personList);
		
		Collections.sort(personList,new SortByName());
		
		System.out.println("---After Sorting---");
		System.out.println(personList);
		
		
}
}