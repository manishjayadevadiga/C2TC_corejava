package com.cg.arrayexamples;

import java.util.Arrays;

public class ArrayOfObjects {

	public static void main(String[] args) {
		
		
//		int arr[]; //primitive
//		Student a[]; //user defined class / non-primitive

		//user-defined class objects
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		Student a[]=new Student[5]; //array of objects
		a[0]=new Student(1,"Manish");
		a[1]=new Student(2,"Anish");
		a[2]=new Student(2,"Varun");
		a[3]=new Student(2,"Akash");
		a[4]=new Student(2,"Sam");
		
	}

}
