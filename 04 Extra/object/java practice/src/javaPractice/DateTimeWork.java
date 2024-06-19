package javaPractice;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;


public class DateTimeWork {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println("Local Date is " + date);
		System.out.println("Local Date year is " + date.getYear());
		System.out.println("Local Date month is " + date.getMonth());
		System.out.println("Local Date day of the month  is " + date.getDayOfMonth());
		
		LocalTime time = LocalTime.now();
		System.out.println("The current local time is " + time);
		
		LocalDateTime dt = LocalDateTime.now();
				System.out.println("\nThe current local Date and Time is : " + dt);
	}

}
