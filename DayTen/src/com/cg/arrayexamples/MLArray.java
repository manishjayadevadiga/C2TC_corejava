package com.cg.arrayexamples;

public class MLArray {

	
	public static void printArray(int c[][]) {
		for(int i=0;i<c.length;i++) {  //c.length - > counts rows
			for(int j=0;j<c[i].length;j++) {   //counts column
				
				System.out.print(c[i][j] + " "); //print because should not go new line
		}
			//new line after row
			System.out.println();
	}
		
}
}
