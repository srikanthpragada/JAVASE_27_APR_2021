package library;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo {

	public static void main(String[] args) {
		var sd = LocalDate.now();
		var ed = sd.plusDays(100);
		var days = ChronoUnit.DAYS.between(sd, ed);
		System.out.println(days);
		var months = ChronoUnit.MONTHS.between(sd, ed);
		System.out.println(months);
	}

}
