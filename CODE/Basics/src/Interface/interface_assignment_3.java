package Interface;

import java.util.Scanner;

interface Order {
    void placeOrder();
    void cancelOrder();
}

class GroceryOrder implements Order {
    String item;
    int quantity;

    GroceryOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    @Override
    public void placeOrder() {
        System.out.println("Grocery Order Placed");
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
    }

    @Override
    public void cancelOrder() {
        System.out.println("Grocery Order Cancelled");
    }
}

class ClothingOrder implements Order {
    String item;
    String size;

    ClothingOrder(String item, String size) {
        this.item = item;
        this.size = size;
    }

    @Override
    public void placeOrder() {
        System.out.println("Clothing Order Placed");
        System.out.println("Item: " + item);
        System.out.println("Size: " + size);
    }

    @Override
    public void cancelOrder() {
        System.out.println("Clothing Order Cancelled");
    }
}

public class interface_assignment_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Grocery Order");
        System.out.println("2. Clothing Order");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        Order order;

        if (choice == 1) {
            System.out.print("Enter Grocery Item: ");
            String item = sc.nextLine();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            order = new GroceryOrder(item, quantity);
        } else if (choice == 2) {
            System.out.print("Enter Clothing Item: ");
            String item = sc.nextLine();

            System.out.print("Enter Size: ");
            String size = sc.nextLine();

            order = new ClothingOrder(item, size);
        } else {
            System.out.println("Invalid Choice");
            sc.close();
            return;
        }

        System.out.println("\n1. Place Order");
        System.out.println("2. Cancel Order");
        System.out.print("Enter your choice: ");
        int action = sc.nextInt();

        if (action == 1) {
            order.placeOrder();
        } else if (action == 2) {
            order.cancelOrder();
        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}