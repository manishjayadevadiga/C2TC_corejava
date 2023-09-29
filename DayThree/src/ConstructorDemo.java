
public class ConstructorDemo {

	public static void main(String[] args) {
		
		//constructor is same as class name
				//customer is user defined class...object c is non-primitive data type.
				Customer c = new Customer(); // object creation..here  c is object and customer is class name
				Customer c1 = new Customer(1,"Maneesh","Mangalore");
				
				
				//value initialization
////				c.customerId=1;
				c.setCustomerId(1);
//				
//				
////				c.customerName="Manish";
				c.setCustomerName("Manish");
//				
////				c.customerCity="Udupi";
				c.setCustomerCity("Udupi");
				
				//printing
				//System.out.println(c.getCustomerId() + " " + c.getCustomerName() + " " + c.getCustomerCity());
		System.out.println(c1);
		System.out.println(c);
	}
	// output:Customer [customerId=0, customerName=null, customerCity=null]....default values because of instance variable.
}
