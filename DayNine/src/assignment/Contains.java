package assignment;

public class Contains {

	public static void main(String[] args) {
		/*
		 * String name = "what do you know about me";
		 * 
		 * System.out.println(name.contains("do you know")); //true
		 * 
		 * System.out.println(name.contains("about")); //true
		 * 
		 * System.out.println(name.contains("hello")); //false
		 */
		
		
		/*
		 * String str = "Hello T#E#C#H#N#O#S#E#R#V#E@2.0 readers";
		 * 
		 * boolean isContains = str.contains("T#E#C#H#N#O#S#E#R#V#E");
		 * 
		 * System.out.println(isContains); //true
		 * 
		 * System.out.println(str.contains("TECHNOSERVE")); //false
		 */	
		
		String str = "To learn Java visit abc.in";

		if(str.contains("abc.in.com"))

		{

		System.out.println("This string contains abc.in");

		}

		else {

		System.out.println("Result not found");
		}
	
	}

}
