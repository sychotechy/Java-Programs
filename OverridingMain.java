class Area{
	void area(){
	}
}
class Rectangle extends Area{
	void area(int length, int breadth){
		System.out.println("Area of rectangle : "+(length*breadth));
	}
}
class Triangle extends Rectangle{	
	void area(int base,int height){
		super.area(base, height);
		System.out.println("Area of triangle : "+(0.5*base*height));
	}
}
public class OverridingMain{
	public static void main(String[] args){
		Triangle obj = new Triangle();
		obj.area(5,6);
	}
}
