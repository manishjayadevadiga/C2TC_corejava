package com.cg.stringexamples;

public class StringBufferExample {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer();
		System.out.println(s.capacity()); // default capacity=16
		
		StringBuffer sb=new StringBuffer(100);//capacity passing
		System.out.println(sb.capacity());
		/*
		 * //CAPACITY StringBuffer sb=new StringBuffer("Hello"); //
		 * System.out.println(sb.length()); System.out.println(sb.capacity());
		 * 
		 * sb.append("How are you?"); System.out.println(sb);
		 * System.out.println(sb.capacity());
		 * 
		 * //here HelloHow are you? is 17 and within limit so answer=21
		 * 
		 * // sb.append("I am fine"); // System.out.println(sb); //
		 * System.out.println(sb.length()); //26 // System.out.println(sb.capacity());
		 * 
		 * here HelloHow are you?I am fine => is more than 21 (26) so it doubles and
		 * adds 2 --> (21*2)+2 =44
		 * 
		 * sb.append("I am fine... Tell me something about yourself");
		 * System.out.println(sb); System.out.println(sb.length());
		 * System.out.println(sb.capacity());
		 * 
		 * //only one out of limit capacity will be doubled. //after that it will count
		 * manually
		 * 
		 * 
		 * 
		 * ENSURE CAPACITY: now in below line it checks whether the capacity is at-least
		 * 70
		 * 
		 * but its 62 , so -> (62*2)+2 = 126
		 * 
		 * if more than 70, then its 70 only
		 * 
		 * // sb.ensureCapacity(70); // System.out.println(sb.capacity()); //
		 * sb.ensureCapacity(20); System.out.println(sb.capacity());
		 */
	}

}
