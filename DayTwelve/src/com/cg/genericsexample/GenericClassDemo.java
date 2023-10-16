package com.cg.genericsexample;

import java.util.ArrayList;
import java.util.List;

public class GenericClassDemo {

	public static void main(String[] args) {
		List<Integer> obj=new ArrayList<Integer>();
		
		GenericClass<Integer> gc=new GenericClass<Integer>();
		gc.data=10;
		
		GenericClass<String> gc1=new GenericClass<>();
		gc1.data="Hello";
		
		
		
	}

}
