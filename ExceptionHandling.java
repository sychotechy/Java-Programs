import java.util.*;
public class ExceptionHandling{
	public static void main(String[] args) throws ArithmeticException{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = scan.nextInt();
		try{
			int result = number/0;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		finally{
			System.out.println("Works if exception is handled or not.");
		}
	}
}
