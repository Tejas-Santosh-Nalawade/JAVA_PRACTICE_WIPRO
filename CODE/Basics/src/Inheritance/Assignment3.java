package Inheritance;


class Shape{
	void area() {
		System.out.println("Area of differnt Shapes");
	}
}

class Circle extends Shape{
	private double radius;
	Circle (double radius){
		this.radius = radius;
	}
	@Override
	void area() {
		double result = Math.PI * radius * radius;
		System.out.println("Area of the Circle: " + result);
	}
}

class Rectangle extends Shape{
	private double length;
	private double breath;
	Rectangle(double length, double breath){
		this.length = length;
		this.breath = breath;
	}
	@Override
	void area() {
		double result = length * breath;
		System.out.println("Area of the Rectangle: " + result);
	}
}

class Triangle extends Shape{
	private double height;
	private double base;
	Triangle(double height, double base){
		this.height = height;
		this.base = base;
	}
	@Override
	void area() {
		double result = 0.5 * base * height;
		System.out.println("Area of the Triangle: " + result);
		
	}
}

public class Assignment3 {
	public static void main(String[] args) {
		Shape s1 = new Shape();
		Shape s2 = new Circle(25);
		Shape s3 = new Rectangle(21,25);
		Shape s4= new Triangle(21,12);
		s1.area();
		s2.area();
		s3.area();
		s4.area();
		
		
	}

}
