import java.util.*;
public class Fibonacci{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num1=0,num2=1,sum=0,limit;
		System.out.println("Enter the limit : ");
		limit = scan.nextInt();
		System.out.print(num1 + "\t" + num2);
		for(int i=2;i<limit;i++){
			sum=num1+num2;
			System.out.print("\t "+sum + "\t");
			num1=num2;
			num2=sum;
		}
	}
}
