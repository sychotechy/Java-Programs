import java.util.*;
public class CharFrequency{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = 0;
		System.out.print("Enter a string : ");
		String inputStr = scan.nextLine();
		System.out.print("Enter a character : ");
		char charToCheck = scan.next().charAt(0);
		for(int i=0;i<inputStr.length();i++){
			if(inputStr.charAt(i) == charToCheck){
				count++;
			}
		}
		System.out.println("Frequency of character : "+count);
	}
}
