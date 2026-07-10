package Inheritance;

	class Animal{
		void display() {
			System.out.println("This is Animal");	
		}
	}
	class Dog extends Animal{
		@Override
		void display() {
			System.out.println("Dog Barks");
		}
	}
	
	
	class Cat extends Animal{
		void display() {
			System.out.println("Cat Meows");
		}
	}
	
public class Overrriding {
	public static void main(String[] args) {
		Animal a;
		a = new Dog();
		a.display();
		a = new Cat();
		a.display();
	}

}
