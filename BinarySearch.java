import java.util.*;
public class BinarySearch{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int limit = scan.nextInt();
		int numberArray[] = new int[limit];
		System.out.print("Enter "+limit+" elements : ");
		for(int i=0;i<limit;i++){
			numberArray[i] = scan.nextInt();
		}
		System.out.print("Enter number to search : ");
		int searchElement = scan.nextInt();
		int first=0,last=numberArray.length-1,mid;
		mid = (first+last)/2;
		while(first<=last){
			if(numberArray[mid]<searchElement){
				first=mid+1;
			}
			else if(numberArray[mid]==searchElement){
				System.out.println("Element is found at position : " + (mid+1));
				break;
			}
			else{
				last = mid-1;
			}
			mid = (first+last)/2;
		}
		if(first>last){
			System.out.println("Element is not found.");
		}
	}
}	
