package com.cg.genericsexample;

public class GenericMethod {
	public <E> void displayArrayElement(E[] elements) { //E->elements
		
		
		for(E element:elements)
			System.out.println(element);
		
	}

}
