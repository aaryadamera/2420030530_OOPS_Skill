package labDay1_myproject;
import java.util.Scanner;

public class sum_of_digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find sum of it's digits: ");
		int n = sc.nextInt();
		int sum=0;
		while (n!=0) {
			sum += n%10;
			n/=10;
		}
		System.out.printf("Sum of the digits is %d", sum);
	}
}
