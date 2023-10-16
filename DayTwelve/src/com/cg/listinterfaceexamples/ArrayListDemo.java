package com.cg.listinterfaceexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		List list=new ArrayList();
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		list.add(10);
		list.add("hi");
		list.add("Manish");
		list.add(true);
		list.add(10);
		list.add("Manish");
		System.out.println(list );
		
		list.add(2,"Tiger");
		System.out.println(list + " Added");
		/*
		 Here 10 is not elements its index number..so outofbound exception
		  list.remove(10);
		   System.out.println(list +"Removed only first occurrence");
		 */
		
		 list.remove("Manish");
		 System.out.println(list +"Removed only first occurrence");
		 
		 
		 
		 System.out.println(list.get(5));
		 System.out.println(list.indexOf(10));
		 System.out.println(list.indexOf("Manish"));
		 System.out.println(list.lastIndexOf(10));
		 
		 System.out.println(list.remove(0));
		 System.out.println(list);
		 
//		 Collections.sort(list);//java.lang.ClassCastException
// we need same data to sort
		 
		 List<Integer> list1=new ArrayList();
		 list1.add(20);
		 list1.add(40);
		 list1.add(10);
		 list1.add(30);
		 list1.add(30);
		 System.out.println(list1 + "  Before sorting");
		 Collections.sort(list1); //ascending order
		 System.out.println(list1 + "  After sorting");
		 
		 List<String> list2=new ArrayList();
		 list2.add("Manish");
		 list2.add("Anurag");
		 list2.add("Sam");
		 list2.add("Viraj");
		 list2.add("Pranav");
		 System.out.println(list2 + "  Before sorting");
		 Collections.sort(list2); //alphabetical order
		 System.out.println(list2 + "  After sorting");
	}

}
