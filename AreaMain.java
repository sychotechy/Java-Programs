class AreaCalculator{
	int area(int length, int breadth){
		return length*breadth;
	}
	double area(int radius){
		return 3.14*radius*radius;
	}
	double area(double base, double height){
		return 0.5*base*height;
	}
}
public class AreaMain{
	public static void main(String[] args){
		AreaCalculator calc = new AreaCalculator();
		int rectangle = calc.area(10,5);
		double circle = calc.area(5);
		double triangle = calc.area(5.0,8.0);
		System.out.println("Area of rectangle : "+rectangle);
		System.out.println("Area of triangle : "+triangle);
		System.out.println("Area of circle : "+circle);
	}
}
