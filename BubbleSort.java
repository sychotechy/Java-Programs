public class BubbleSort{
	public static void main(String[] args){
		int[] numberArray = {5,3,8,1,4,9,2};
		System.out.print("Array : ");
		for(int i=0;i<numberArray.length;i++){
			System.out.print(numberArray[i]+"\t");
		}
		System.out.println("");
		for(int i=0;i<numberArray.length-1;i++){
			for(int j=0;j<numberArray.length-i-1;j++){
				if(numberArray[j]>numberArray[j+1]){
					int temp = numberArray[j];
					numberArray[j]=numberArray[j+1];
					numberArray[j+1]=temp;
				}
			}
		}
		System.out.print("Sorted Array : ");
		for(int i=0;i<numberArray.length;i++){
			System.out.print(numberArray[i]+"\t");
		}
		System.out.println("");
	}
}
