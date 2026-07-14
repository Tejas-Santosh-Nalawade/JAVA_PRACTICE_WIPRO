package Hello;

import java.util.Scanner;

public class input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Check first number
        if (num1 > 0) {
            if (num1 % 2 == 0) {
                System.out.println("First number is even and positive.");
            } else {
                System.out.println("First number is odd and positive.");
            }
        } else if (num1 == 0) {
            System.out.println("First number is zero.");
        } else {
            if (num1 % 2 == 0) {
                System.out.println("First number is even and negative.");
            } else {
                System.out.println("First number is odd and negative.");
            }
        }

        // Check second number
        if (num2 > 0) {
            if (num2 % 2 == 0) {
                System.out.println("Second number is even and positive.");
            } else {
                System.out.println("Second number is odd and positive.");
            }
        } else if (num2 == 0) {
            System.out.println("Second number is zero.");
        } else {
            if (num2 % 2 == 0) {
                System.out.println("Second number is even and negative.");
            } else {
                System.out.println("Second number is odd and negative.");
            }
        }

        // Compare absolute values
        if (Math.abs(num1) > Math.abs(num2)) {
            System.out.println("First number has the higher absolute value.");
        } else if (Math.abs(num1) < Math.abs(num2)) {
            System.out.println("Second number has the higher absolute value.");
        } else {
            System.out.println("Both numbers have equal absolute values.");
        }

        // Absolute difference
        int absoluteDifference = Math.abs(num1 - num2);
        System.out.println("Absolute difference = " + absoluteDifference);

        sc.close();
    }
}