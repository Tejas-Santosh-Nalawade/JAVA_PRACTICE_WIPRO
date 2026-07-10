package Inheritance;
import java.time.LocalDate;

class Product2{
	protected String id;
	protected String name;
	protected double price;
	
	Product2(String id, String name, double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	double calculateDiscount() {
		return price;
	}
	
	void display() {
		System.out.println("----------------------");
		System.out.println("Product Details and Prices");
		System.out.println("Product ID : " + id);
		System.out.println("Name       : " + name);
		System.out.println("Price      : " + price);
	}
}

class Electronics extends Product2{
	private int warranty;
	Electronics(String id, String name, double price, int warranty){
		super(id, name, price);
		this.warranty = warranty;
	}
	
	@Override
	double calculateDiscount() {
	    return price * 0.90;
	}
	
	@Override
	void display() {
	    super.display();
	    System.out.println("Warranty : " + warranty);
	    System.out.println("Final Price : " + calculateDiscount());
	}
}


class Clothing extends Product2{
	private String size;
	
	Clothing(String id, String name, double price, String size){
		super(id, name, price);
		this.size = size;
	}
	
	@Override
	void display() {
        super.display();
        System.out.println("Size        : " + size);
        System.out.println("Final Price : " + calculateDiscount());
    }
	
	@Override
	double calculateDiscount() {
	    return price * 0.80;
	}
}

class Grocery extends Product2{
	private LocalDate expirydate;
	
	Grocery(String id, String name, double price, LocalDate expirydate){
		super(id, name, price);
		this.expirydate = expirydate;
	}
	
	 @Override
	    void display() {
	        super.display();
	        System.out.println("Expiry Date : " + expirydate);
	        System.out.println("Final Price : " + calculateDiscount());
	    }
	
	@Override
	double calculateDiscount() {
	    return price * 0.95;
	}
	
	
	
}

public class Assignment4 {
	public static void main(String[] args) {
		Electronics e = new Electronics("E101","Laptop",70000,2);
        Clothing c = new Clothing("C201","T-Shirt",1500,"Large");
        Grocery g = new Grocery("G301","Milk",60, LocalDate.of(2026, 4, 3));
        e.display();
        c.display();
        g.display();

	}

}
