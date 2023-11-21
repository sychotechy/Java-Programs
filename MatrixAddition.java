import java.util.*;
public class MatrixAddition{
	public static void main(String[] args){
		int matrixOne[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int matrixTwo[][] = {{10,20,30},{40,50,60},{70,80,90}};
		int resultMatrix[][] = new int[3][3];
		System.out.println("**** Matrix One ****");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(matrixOne[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("**** Matrix Two ****");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(matrixTwo[i][j] + "\t");
			}
			System.out.println("");
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				resultMatrix[i][j] = matrixOne[i][j] + matrixTwo[i][j];
			}
		}
		System.out.println("**** Sum ****");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(resultMatrix[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
