package Hello;
import java.util.*;
import java.util.Scanner;

public class input{ 
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		if(num1 > 0) {
			if(num1 % 2 == 0) {
				System.out.println("Number is even and real positve");
			}
			else {
				System.out.println("Number is odd and positve");
			}
		}
		else if(num1 ==0) {
			System.out.println("First number is whole no");
		}
		if(num2 > 0) {
			if(num2 % 2 == 0) {
				System.out.println("Number is even and positve");
			}
			else {
				System.out.println("Number is odd and positive");
			}
		}
		else if(num2 ==0) {
			System.out.println("Number 2 is whole number");
		}
		if(Math.abs(num1) > Math.abs(num2)) {
			System.out.println("First number have the higher absolute value then the second one");
		}
		else if(Math.abs(num1) < Math.abs(num2)) {
			System.out.println("Second number have the highest absolute value then first one");
		}
		else {
			System.out.println("Both have equal Absolute value");
		}
		int absolute = Math.abs(num1 - num2);
		System.out.println(absolute);
	}
}