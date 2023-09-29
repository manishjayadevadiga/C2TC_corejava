
public class Student {
	//ENCAPSULATION is binding data members  and method in a single unit...here unit is class student

	
		
		//variable -  data member
	int id;
	String name;


	//method - method
	void display()
	{
		System.out.println(id + " " + name);
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}


	public void setName(String name) {
		this.name = name;
	}
	}


	//hello this is manish

