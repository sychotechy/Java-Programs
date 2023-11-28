import java.util.*;
import java.io.*;
class NumberGen extends Thread{
	public void run(){
		try{
			Random rand = new Random();
			for(int i=1;i<=10;i++){
				Thread.sleep(1000);
				int randomNum = rand.nextInt(10);
				if(randomNum%2==0){
					new Cube(randomNum).start();
				}
				else{
					new Square(randomNum).start();
				}
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
class Square extends Thread{
	int randomNum;
	Square(int randomNum){
		this.randomNum = randomNum;
	}
	public void run(){
		System.out.println("Square : "+(randomNum*randomNum));
	}
}
class Cube extends Thread{
	int randomNum;
	Cube(int randomNum){
		this.randomNum = randomNum;
	}
	public void run(){
		System.out.println("Cube : "+(randomNum*randomNum*randomNum));
	}
}		
public class MultiThreadMain{
	public static void main(String[] args){
		NumberGen obj = new NumberGen();
		obj.start();
	}
}
