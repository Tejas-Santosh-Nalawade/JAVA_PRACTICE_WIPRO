package Hello;

public class Parent {

    public Parent() {
        System.out.println("Hello Parent");
    }
    
    void show_parent() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent{
    Child() {
    	super();
        System.out.println("Hello Child");
    }
    
    void show_child() {
        System.out.println("This is child class");
    }
    
    public static void main(String[] args) {
        Child c = new Child();
        c.show_parent();
        c.show_child();
    }
}
