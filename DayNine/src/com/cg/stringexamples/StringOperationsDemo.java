package com.cg.stringexamples;

public class StringOperationsDemo {

	public static void main(String[] args) {
		String s1=new String("    Indian    ");
		System.out.println(s1);
		
/*		
		//upper-case
	String s2 = s1.toUpperCase();
	System.out.println(s2);
		
	//find length
	System.out.println(s1.length());
	
	//SUBSTRING
	System.out.println(s1.substring(3));
	
	
*/	
	
		
		System.out.println(s1.trim());
		System.out.println(s1.strip());
		
		System.out.println(s1.isEmpty());
		
		char c[]= {'I','n','d','i','a'}; //sequence of characters
		String s2=new String(c);
		System.out.println(s2);
	}

}
