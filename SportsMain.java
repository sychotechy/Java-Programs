import java.util.*;
interface Sports{
	final float sportwt = 6.0F;
	abstract void putwt();
}
class Student{
	Scanner scan = new Scanner(System.in);
	int rollNumber;
	void getNumber(){
		System.out.print("Enter rollno : ");
		rollNumber = scan.nextInt();
	}
	void putNumber(){
		System.out.println("Roll no : "+rollNumber);
	}
}
class Test extends Student{
	double term1;
	double term2;
	void getMarks(){
		System.out.print("Enter term1 marks : ");
		term1 = scan.nextDouble();
		System.out.print("Enter term2 marks : ");
		term2 = scan.nextDouble();
	}
	void putMarks(){
		System.out.println("Term 1 : "+term1+"\nTerm2 : "+term2);
	}
}
class Result extends Test implements Sports{
	public void putwt(){
		System.out.println("Sports weightage : "+sportwt);
	}
	void display(){
		getNumber();
		putNumber();
		System.out.println("Marks obtained");
		getMarks();
		putwt();
		double total = term1+term2+sportwt;
		System.out.println("Total score : "+total);
	}
}
public class SportsMain{
	public static void main(String[] args){
		Result res = new Result();
		res.display();
	}
}
