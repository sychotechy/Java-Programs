class Factorial{
	int calculate(int num){
		if(num==1){
			return 1;
		}
		else{
			return num*calculate(num-1);
		}
	}
}
public class FactorialMain{
	public static void main(String[] args){
		Factorial obj = new Factorial();
		int result = obj.calculate(6);
		System.out.println("Factorial : "+result);
	}
}
