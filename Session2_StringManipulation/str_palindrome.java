package labDay1_myproject;
import java.util.*;
public class str_palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		if(str.contentEquals(sb)) {
			System.out.println("This s a palindrome!");
		}
		else {
			System.out.println("This is not a palindrome!");
		}

	}

}
