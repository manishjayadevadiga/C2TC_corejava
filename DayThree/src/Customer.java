
public class Customer {
	// customer class is the owner of the below details

		//ACCESS SPECIFIERS IN JAVA
//		public 
//		private
//		protected
//		default
		
		
		//instance variable -- (types--local,instance,static)
			//variables created inside class does not have public static void main is instance variable.
			private int customerId;
			private String customerName;
			private String customerCity;
			
			
			//user defined no argument/no parameterized constructor
			public Customer() {
			}
			
			
			//user defined  argument and parameterized constructor
			public Customer(int id, String name,String city) {
				
				//below is local variables
				customerId=id;
				customerName=name;
				customerCity=city;
					
			}
			
			
			//Default constructor
			//when user defined constructor is not created
			
			
			
			
			public int getCustomerId() {
				return customerId;
			}
			public void setCustomerId(int customerId) {
				this.customerId = customerId;
			}
			public String getCustomerName() {
				return customerName;
			}
			public void setCustomerName(String customerName) {
				this.customerName = customerName;
			}
			public String getCustomerCity() {
				return customerCity;
			}
			public void setCustomerCity(String customerCity) {
				this.customerCity = customerCity;
			}
			@Override
			public String toString() {
				return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
						+ customerCity + "]";
			}
}
