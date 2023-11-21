import java.util.*;
public class StringPalindrome{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String inputStr = scan.nextLine();
		String reverseStr = "";
		for(int i=inputStr.length()-1;i>=0;i--){
			reverseStr += inputStr.charAt(i);
		}
		if(inputStr.equalsIgnoreCase(reverseStr)){
			System.out.println("String is palindrome");
		}
		else{
			System.out.println("String is not palindrome");
		}
	}
}
