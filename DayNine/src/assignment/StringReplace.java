package assignment;

public class StringReplace {

	public static void main(String[] args) {
		/*
		 * StringBuffer sb=new StringBuffer( "Hello " ) ; sb.replace(1,3,"Java");
		 * System.out.println(sb);//prints HJavalo
		 */
		
		
		/*
		 * String s1 = "Negative thoughts";
		 * 
		 * String replaceString = s1.replace('e','a'); //replaces e with a
		 * 
		 * System.out.println(replaceString);//Nagativa thoughts
		 */
		
		String s1 = "Negative thoughts";

		String replaceString = s1.replace("Negative","Positive");//replaces negative with positive

		System.out.println(replaceString);//Positive thoughts
	
	}

}
