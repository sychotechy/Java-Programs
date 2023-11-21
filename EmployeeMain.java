/* class Employee{
	String name;
	int age;
	long phoneNumber;
	String address;
	double salary;
	void printSalary(){
		System.out.println("Salary : "+salary);
	}
}
class Officer extends Employee{
	String specializaion;
}
class Manager extends Employee{
	String department;
}
public class EmployeeMain{
	public static void main(String[] args){
		Officer officerOne = new Officer();
		Manager managerOne = new Manager();
		officerOne.name = "Rahul";
		officerOne.age = 27;
		officerOne.phoneNumber = 1234567890;
		officerOne.address = "Ontario, Canada";
		officerOne.salary = 20000;
		System.out.println("**** Officer Data ****");
		System.out.println("Name : "+officerOne.name+"\nAge : "+officerOne.age+"\nPhone number : "+officerOne.phoneNumber+"\nAddress : "+officerOne.address);
		officerOne.printSalary();
	}
}

*/

class Employee{
	String name;
	int age;
	long phoneNumber;
	String address;
	double salary;
	void printSalary(){
		System.out.println("Salary : "+salary);
	}
}
class Officer extends Employee{
	String specialization;
	Officer(String name,int age,long phoneNumber,String address,double salary,String specialization){
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
		this.specialization = specialization;
	}
}
class Manager extends Employee{
	String department;
	Manager(String name,int age,long phoneNumber,String address,double salary,String department){
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
		this.department = department;
	}
}
public class EmployeeMain{
	public static void main(String[] args){
		Officer officerOne = new Officer("Rahul",27,1234567890,"Ontario, Canada",20000,"Software Engineer");
		Manager managerOne = new Manager("Alex",25,1234567890,"Washington, US",40000,"QA");
		
		System.out.println("**** Officer Data ****");
		System.out.println("Name : "+officerOne.name+"\nAge : "+officerOne.age+"\nPhone number : "+officerOne.phoneNumber+"\nAddress : "+officerOne.address+"\nSpecialization : "+officerOne.specialization);
		officerOne.printSalary();
		
		System.out.println("**** Manager Data ****");
		System.out.println("Name : "+managerOne.name+"\nAge : "+managerOne.age+"\nPhone number : "+managerOne.phoneNumber+"\nAddress : "+managerOne.address+"\nDepartment : "+managerOne.department);
		managerOne.printSalary();
	}
}
