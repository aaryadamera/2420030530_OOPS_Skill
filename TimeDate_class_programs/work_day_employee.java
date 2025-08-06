package labDay1_myproject;
import java.time.*;

public class work_day_employee {

	public static void main(String[] args) {
		LocalTime starting_time = LocalTime.of(9, 0);
		LocalTime ending_time = LocalTime.of(18, 0);
		LocalTime login_time = LocalTime.of(9, 15);
		LocalTime logout_time = LocalTime.of(17, 45);
		LocalDateTime current_time = LocalDateTime.now();
		
		System.out.printf("Current Time: %s%n", current_time);
		
		if (!login_time.isBefore(starting_time)&&!login_time.isAfter(ending_time)) {
			System.out.println("Employee logged in to work");
		}
		else {
			System.out.println("Employee didn't logged in");
			
		}
		Duration duration  = Duration.between(login_time, logout_time);
		long hours = duration.toHours();
		long minutes = duration.toMinutes();
		long seconds = duration.toSeconds();
		System.out.println("The total duration the employee worked is: " + hours + " hours " + minutes + " minutes " + seconds + " seconds ");
		
	
		
		

	}

}
