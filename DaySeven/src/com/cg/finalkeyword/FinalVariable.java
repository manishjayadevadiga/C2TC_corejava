//Final keyword is used when we don't want to do actions / add restrictions

package com.cg.finalkeyword;

public class FinalVariable {

//cannot leave final field empty.
	
	final int value=50;
	public static void main(String[] args) {
		
		//object for final
		FinalVariable f=new FinalVariable();
//		f.value=60;  // same as value --> because we cannot alter final
		System.out.println(f.value);

	}

}
