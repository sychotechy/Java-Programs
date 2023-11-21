import java.util.*;
public class GarbageCollectorTwo{
	public static void main(String[] args){
		Runtime r = Runtime.getRuntime();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter array size : ");
		int arraySize = scan.nextInt();
		
		System.out.println("Total memory : "+r.totalMemory());
		System.out.println("Free memory : "+r.freeMemory());
		
		int[] numberArray = new int[arraySize];
		
		System.out.println("Total memory : "+r.totalMemory());
		System.out.println("Free memory : "+r.freeMemory());
		
		System.out.print("Enter 5 elements to array : ");
		for(int i=0;i<5;i++){
			numberArray[i] = scan.nextInt();
		}
		
		System.gc();
		
		System.out.println("Total memory : "+r.totalMemory());
		System.out.println("Free memory : "+r.freeMemory());
		
	}
}
