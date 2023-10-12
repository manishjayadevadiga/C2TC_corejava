package assignment;

public class PlusOperator {

	public static void main(String[] args) {
		
		
		/*
		 * Number of arguments the concat() method and + operator takes:
		 * 
		 * concat() method takes only one argument of string and concatenate it with
		 * other string.
		 * 
		 * + operator takes any number of arguments and concatenates all the strings.
		 * 
		 */
		
		String s = "Are", t = "you", u = "ready";

		System.out.println(s + t + u);

		System.out.println(s.concat(t));

	}

}
