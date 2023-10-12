package com.cg.wrapperclass;

public class WrapperClassDemo {

/*
 1.AUTO BOXING:
 		create primitive variable and store in wrapper.
 
  2.UNBOXING:
  		
  
 */
	
//AUTO BOXING  -> primitive to wrapper
		int i=10; //primitive type creation
		
		//wrapper - object creation
//		Integer j = new Integer();  --> older version
		Integer k =i; //wrapper type
		
//UNBOXING  -> wrapper to primitive
		Integer x=20;
		int y=x; //primitive newer version
//		int z=x.intValue();  //older version
		
		
		//type casting
		
		float a=12.23f;
		Integer b=(int)a; //casting float to integer type
		
		float c=12.23f;
		int d=(int)c;  //issue is of size
		
		//wrapper takes care of size
	}


