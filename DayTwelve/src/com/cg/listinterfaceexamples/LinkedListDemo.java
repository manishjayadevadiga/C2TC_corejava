package com.cg.listinterfaceexamples;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.cg.genericsexample.Person;

import java.util.Iterator;
//import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll =new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(40);
		ll.add(2,60);
		ll.add(30);
		System.out.println(ll);
		
		ll.addFirst(200);
		System.out.println(ll + " Add First");
		
		ll.addLast(400);
		System.out.println(ll + " Add Last");

		System.out.println(ll.getFirst() + " Get first element");
		System.out.println(ll.getLast()+ " Get last element");
		
		System.out.println(ll.removeFirst()+ " Remove first element");
		System.out.println(ll);
		System.out.println(ll.removeLast()+ " Remove last element");
		System.out.println(ll);
		
		LinkedList<Integer> llOne =new LinkedList<>();
		llOne.add(90);
		llOne.add(70);
		llOne.add(45);
		llOne.add(780);
		System.out.println(llOne + "LL One");
		
		ll.addAll(llOne); //adding to LL
		System.out.println(ll + "LL + LLOne");
		
		System.out.println("Adding to index");
		ll.addAll(2,llOne); 
		System.out.println(ll + "LL + LLOne indexing");
		
		
		  //List Iterator 
		System.out.println(); 
		System.out.println("List Iterator");
		  ListIterator<Integer> li = ll.listIterator(); 
		  while(li.hasNext()) {
		  System.out.println(li.next());
		  }
			
			//Iterator
			System.out.println();
			System.out.println("Iterator");
			Iterator <Integer>  i =  ll.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
		}
		 
			System.out.println("Sorting LL");
		 Collections.sort(ll);
		 System.out.println(ll);
		 
		 
		 
		 //user defined input
		 LinkedList<Person> llperson =new LinkedList<>();
		 llperson.add(new Person("Manish",22));
		 llperson.add(new Person("Abhilash",24));
		 llperson.add(new Person("Viraj",23));
		 llperson.add(new Person("Anurag",23));
		 llperson.add(new Person("Virat",24));
		 
		 System.out.println(llperson);
//		 Collections.sort(llperson); //java.lang.Error: Unresolved compilation problem: 
		 
		 
	}

	}

