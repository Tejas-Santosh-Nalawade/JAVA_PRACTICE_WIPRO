package Hello;

public class item {
		int itemid = 0;
		String name;
		int price;
	
	public item() {
		
	}
	public item(String name, int price) {
		this.itemid++;
		this.name = name;
		this.price = price;
	}
	
	public void total_price() {
		if(this.price > 1000) { 
			int total_price = this.price - (int)(0.25 * this.price);
			System.out.println("Total Price: " + total_price);
		}
		else {
			System.out.println("Total Price: " + this.price);
		}
	}
	
	public static void main(String[] args) {
		item i1= new item("Laptop" , 150000);
		item i2 = new item ("Mobile" , 75000);
		
		item i3 = i2;
		i1.total_price();
		i2.total_price();
		i3.total_price();
	}
}