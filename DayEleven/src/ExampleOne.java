
public class ExampleOne {

	public static void print(int[] arr) {
		
			System.out.println(arr[3]); //ArrayIndexOutOfBoundsException
//above line is throwing exception, so below line will not print		
		
		System.out.println("Fourth element successfully displayed");
	}
	
	public static void main(String[] args) {
		
		//array elements
		System.out.println("First element");
		System.out.println("Second element");
		int[] myIntArray=new int[] {1,2,3};
		
//always place method inside try block		
		try{
			print(myIntArray);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Third element");

	}

}
