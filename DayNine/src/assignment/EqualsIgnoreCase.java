package assignment;

public class EqualsIgnoreCase {

	public static void main(String[] args) {
		/*
		 * The String equalsIgnoreCase() method compares the two given strings on the
		 * basis of content of the string irrespective of case of the string.
		 * 
		 * It is like equals() method but doesn't check case.
		 */
		
		String s1 = "The walking Dead";

		String s2 = "The walking Dead";

		String s3 = "THE WALKING DEAD";

		String s4 = "The WEST WEEDS";

		System.out.println(s1.equalsIgnoreCase(s2));  //true

		System.out.println(s1.equalsIgnoreCase(s3));  //true

		System.out.println(s1.equalsIgnoreCase(s4));  //false
	}

}
