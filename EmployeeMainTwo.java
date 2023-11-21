class Employee{
	double salary = 10000;
	void display(){
		System.out.println("Name of the class is Employee.");
	}
	void calcSalary(){
		System.out.println("Salary of employee is "+salary);
	}
}

class Engineer extends Employee{
	void display(){
		super.display();
		System.out.println("Name of the class is Engineer.");
	}
	void calcSalary(){
		super.calcSalary();
		System.out.println("Salary of employee is 20000");
		
	}
}

public class EmployeeMainTwo{
	public static void main(String[] args){
		Engineer engineerOne = new Engineer();
		engineerOne.display();
		engineerOne.calcSalary();
	}
}
