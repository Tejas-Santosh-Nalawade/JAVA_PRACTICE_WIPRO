package Interface;


interface Shape{
	double getArea();
}

class Circle implements Shape{
	private double radius;
	Circle(){
		
	}
	Circle (double radius){
		this.radius = radius;
	}
	public double getArea() {
		double result = Math.PI * radius * radius;
		return result;
	}
}
class Rectangle implements Shape{
	private double length;
	private double breath;
	Rectangle(){
		
	}
	Rectangle(double length, double breath){
		this.length = length;
		this.breath = breath;
	}
	public double getArea() {
		double result = length * breath;
		return result;
	}
}

class Triangle implements Shape{
	private double height;
	private double base;
	Triangle(){
		
	}
	Triangle(double height, double base){
		this.height = height;
		this.base = base;
	}
	public double getArea() {
		double result = 0.5 * base * height;
		return result;
		
	}
}

public class shape_assignment2 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(25.0,30.2);
		Triangle t = new Triangle(35.0,36.7);
		Circle c = new Circle(25);
		
		System.out.println(r.getArea());
		System.out.println(t.getArea());
		System.out.println(c.getArea());
	}

}
