package Hello;

public class Add {
	int a;
	int b;

	public Add() {
		a = 0;
		b = 0;
	}
	public Add(int add1, int add2) {
		this.a =add1;
		this.b=add2;
	}
		
	Add (Add a) {
		this.a = a.a;
		this.b = a.b;
	}
	
	public static void main(String[] args) {
		
		Add value = new Add();
		Add value1 = new Add(25, 36 );
		Add value2 = new Add(value1);
		System.out.println("Default Constructor is called");
		System.out.println("a = "+ value.a);
		System.out.println("b = "+ value.b);
		value.a = 1;
		value.b= 2;
		System.out.println("Parameterized Constructer is called");
		System.out.println("a = "+ value1.a);
		System.out.println("b = "+ value1.b);
		System.out.println("Copy Constructor is called");
		System.out.println("a = "+ value2.a);
		System.out.println("b = "+ value2.b);

	}

}
