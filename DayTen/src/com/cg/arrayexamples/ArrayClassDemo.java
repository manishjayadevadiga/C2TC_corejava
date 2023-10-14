package com.cg.arrayexamples;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		
		
		int intArr[] = {10,20,15,22,35,18,14};
		//int i=5;
		System.out.println(intArr[3]);
		System.out.println(intArr); //gives address of array
		System.out.println(Arrays.toString(intArr)); //all elements printed
		
		//ascending order
	//	Arrays.sort(intArr);
	//	System.out.println(Arrays.toString(intArr));
		
		//searching
	//	int key=22;
//	System.out.println(Arrays.binarySearch(intArr, key));
		
		
		//equals
		int intArr1[]= {10, 15,22};
		System.out.println(Arrays.toString(intArr1));
		System.out.println(Arrays.equals(intArr, intArr1));
		
		//copy
		int intArr2[]=Arrays.copyOf(intArr1, 10);
		System.out.println(Arrays.toString(intArr2));
		
//[10, 15, 22, 0, 0, 0, 0, 0, 0, 0]-->0 because default value of int is 0.
	
	
		//fill
		Arrays.fill(intArr2, 22);
		System.out.println(Arrays.toString(intArr2));
		//[22, 22, 22, 22, 22, 22, 22, 22, 22, 22]
		
		
	}

}
