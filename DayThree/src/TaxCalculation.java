
public class TaxCalculation {
	public void calculateTax(Person p) {
		 if(p.getAge() > 65 || p.getGender().equalsIgnoreCase("Female")) {
			 
			 p.setTax(0);
			 System.out.println("Tax is not applicable");
		 }
		 else {
			 if(p.getIncome()<=160000) {
				 p.setTax(0);
			 }
			 else if(p.getIncome()> 160000 && p.getIncome()<=500000) {
				 p.setTax((p.getIncome()-160000)*10/100);  //10% tax is paid
			 }
			 else if (p.getIncome()>500000 && p.getIncome()<800000) {
				 p.setTax((p.getIncome()-500000)*20/100 + 34000); //20% for remaining/amount amount
			 }
			 else {
				 p.setTax((p.getIncome()-800000)*30/100 + 94000); //30% tax for extra amount
			 }
		 }
	 }
}
