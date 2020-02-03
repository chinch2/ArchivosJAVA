import java.io.*;
public class EmployeeNameSalary {
	// this instance variable is visible for any child class
	public String name;
	
	// salary variable is visible in Employee class only
	private double salary;
	
	// The name variable is assigned in the constructor
	public EmployeeNameSalary (String empName) {
		name = empName;
	}
	
	// The salary variable is assigned a value
	public void setSalary(double empSal) {
		salary = empSal;
	}
	
	// This method prints the employee details.
	public void printEmp() {
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}
	
	public static void main(String args[]) {
		EmployeeNameSalary empOne = new EmployeeNameSalary("Ransika");
		empOne.setSalary(1000);
		empOne.printEmp();
	}
}