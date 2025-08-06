package labDay1_myproject;
import java.time.*;

import java.util.Scanner;

public class Age_of_person_localDateClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LocalDate d = LocalDate.now();
		System.out.println("Enter the year");
		int year = sc.nextInt();
		System.out.println("Enter the month");
		int month = sc.nextInt();
		System.out.println("Enter the date");
		int date = sc.nextInt();
		
		LocalDate d1 = LocalDate.of(year, month, date);
		Period period = Period.between(d,d1);
		System.out.println("The age of the person is: " + period.getYears() +" " + "years"+ period.getMonths() + " " + "months" + period.getDays() + " " + "days");

	}

}
