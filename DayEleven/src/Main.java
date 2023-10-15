
public class Main {

	public static void main(String[] args) {
		int x=10;
		int y=0;     //     / by zero exception
		
		System.out.println("Handled Exception Example");
	//	int z=x/y;
		//System.out.println(z); //runtime error

		
		
//handling
		
		//try -> accepts lines which may/may not throw exception
		try {
			int z=x/y;
			System.out.println(z);
		}
		
		
		
		//catch -> exception will be caught and handled
		catch(Exception e){
			System.out.println(e); //->printing the exception
			
		}
	}

}

/*
 * notes 
 * compile time -checked 
 * runtime -unchecked
 */