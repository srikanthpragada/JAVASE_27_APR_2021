package library;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateFormatDemo {
	public static void main(String[] args) {
		 
		var df = DateTimeFormatter.ofPattern("dd-MM-uuuu H:m:s");
		var now = LocalDateTime.now();
		System.out.println(df.format(now));
		
		var today = LocalDate.now();
		var sd = LocalDate.parse("01-01-2021",
				    DateTimeFormatter.ofPattern("dd-MM-uuuu"));
				
		System.out.println( ChronoUnit.DAYS.between(sd, now));

	}

}
