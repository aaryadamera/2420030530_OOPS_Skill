package labDay1_myproject;

import java.util.Scanner;

public class greatest_shortest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter third number: ");
		int num3 = sc.nextInt();
		if (num1>num2 && num1>num3) {
			System.out.printf("Greatest is: &d",num1);
		}
		else if (num2>num3 && num2>num1) {
			System.out.printf("Greatest is: %d",num2);
		}
		else {
			System.out.printf("Greatest is: %d",num3);
		}
			}

}
