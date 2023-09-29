import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		// scanner is predefined class..create its object. 
				Scanner sc = new Scanner(System.in);  // in is input class
				
				System.out.println("Enter your name:");
				//next helps to receive input...if integer nextInt, float..nextFloat..nextDouble
				//for string..next() / nextLine()
				// we use next(0 if input is one-word only (EX: gender)
				//nextLine() is used when input is more than one words
				
				String name = sc.nextLine();
				
				System.out.println("Enter your gender:");
				String gender = sc.next();
				
				System.out.println("Enter your age:");
				int age = sc.nextInt();
				
				System.out.println("Enter your income:");
				int income = sc.nextInt();
				
				sc.close();
				
				//create objects
				Person p = new Person();
				p.setName(name);
				p.setGender(gender);
				p.setAge(age);
				p.setIncome(income);
				
				System.out.println("Before tax calculation");
				System.out.println(p.getTax());
				
				TaxCalculation tc = new TaxCalculation();
				tc.calculateTax(p);
				
				System.out.println("After tax calculation");
				System.out.println(p.getTax());
				
				

			}
	}
//Below is the user input and expected output

//Enter your name:
//Manish
//Enter your gender:
//Male
//Enter your age:
//21
//Enter your income:
//760000


//Before tax calculation
//0
//After tax calculation
//86000
