class FirstClass{
	FirstClass(){
		System.out.println("Class first");
	}
}
class SecondClass extends FirstClass{
	SecondClass(){
		System.out.println("Class second");
	}
}
class ThirdClass extends SecondClass{
	ThirdClass(){
		super();
		System.out.println("Class third");
	}
}
public class ConstructorTest{
	public static void main(String[] args){
		ThirdClass tc = new ThirdClass();
	}
}
