//one try..multiple catch
public class ExampleTwo {

	public static void main(String[] args) {
		try {
		
		int arr[]=new int[5];
		arr[7]=100/2;
		}
		
		
		//using pipe operator
		//cannot use parent exception in pipe
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println(e);
		}
		
		/*//child exception
		catch(ArithmeticException e ) {
			System.out.println(e);
		}
		//child exception
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		//always use parent exception at end
		catch(Exception e) {
			System.out.println(e);
		}*/
	}

}
