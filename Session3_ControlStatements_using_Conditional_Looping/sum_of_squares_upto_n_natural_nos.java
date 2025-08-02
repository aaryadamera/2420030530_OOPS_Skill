package labDay1_myproject;
import java.util.Scanner;
public class sum_of_squares_upto_n_natural_nos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print sum of squares of it's natural numbers");
		int n = sc.nextInt();
		int sum=0;
		for (int i=1;i<n;i++) {
			sum+=i*i;
		}
		System.out.printf("The sum of the squares upto %d natural numbers are: %d", n, sum);

	}

}
