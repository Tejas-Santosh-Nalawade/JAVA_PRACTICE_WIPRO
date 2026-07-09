package Hello;

public class student {
	int roll;
	String name;
	int marks ;
	
	student() {
		this.roll = 0;
		this.marks = 0;
		this.name = " ";
	}
	
	student(int roll, int marks, String name){
		this.roll = roll;
		this.marks = marks;
		this.name = name;
	}
	
	public void display(){
		System.out.println("Roll No: " + this.roll);
		System.out.println("Marks :" + this.marks);
		System.out.println("Name: " + this.name);
	}

	public static void main(String[] args) {
		student s1 = new student();
		student s2 = new student(1, 98 , "Tejas");
		// Default constructor
		s1.display();
		// Parameterized constructor
		s2.display();
		
	}

}