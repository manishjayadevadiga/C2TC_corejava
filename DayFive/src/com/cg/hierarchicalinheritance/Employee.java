package com.cg.hierarchicalinheritance;

public class Employee extends Person {
	
	private int empId;
	private float salary;

	//4.generate the same
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	//to-string
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", getAge()=" + getAge() + ", getGender()="
				+ getGender() + "]";
	}

}
