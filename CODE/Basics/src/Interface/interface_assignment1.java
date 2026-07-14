package Interface;


interface Animal{
	void makesound();
}


class Cat implements Animal{
	public void makesound() {
		System.out.println("Cat Meow");
	}
	
}

class Dog implements Animal{
	public void makesound() {
		System.out.println("Dog Bark");
	}
}


public class interface_assignment1 {
	public static void main(String args[]) {
		Dog d = new Dog();
		Cat c = new Cat();
		d.makesound();
		c.makesound();
	}

}
