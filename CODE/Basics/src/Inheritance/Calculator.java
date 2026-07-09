package Inheritance;

public class Calculator {
	
	int add(int a, int b) {
		return a + b;
	}
	
	double add(double a, double b) {
		return a + b;
	}
	
	int add(int a, int b, int c) {
		return a+ b + c;
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("Method Oveloading");
		System.out.println(c.add(10, 20));
		System.out.println(c.add(13.5,26.8));
		System.out.println(c.add(2, 5,6));
	}

}
