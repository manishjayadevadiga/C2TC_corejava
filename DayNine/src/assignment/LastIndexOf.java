package assignment;

public class LastIndexOf {

	public static void main(String[] args) {
		
		/*
		 * The java string lastIndexOf() method returns last index of the given
		 * character value or substring. If it is not found, it returns -1. The index
		 * counter starts from zero.
		 * 
		 * int lastIndexOf(int ch) - returns last index position for the given char
		 * value
		 * 
		 * int lastIndexOf(int ch, int fromIndex) - returns last index position for the
		 * given char value and from index
		 * 
		 * int lastIndexOf(String substring) - returns last index position for the given
		 * substring
		 * 
		 * int lastIndexOf(String substring, int fromIndex) - returns last index
		 * position for the given substring and from index String s1 =
		 * "this is the world";
		 */
		String s1 = "this is the world";
		int index1 = s1.lastIndexOf('s');

		System.out.println(index1);
	}

}
