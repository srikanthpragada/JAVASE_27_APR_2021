package advanced;

import java.util.Arrays;
import java.util.regex.Pattern;

public class TotalMarks {

	public static boolean isNumber(String s) {
		return Pattern.matches("\\d+", s);
	}

	public static void main(String[] args) {
		String marks[] = { "50", "90", "xy", "56", "98", "76", "789", "abc" };

		var total = Arrays.stream(marks)
				 		  .filter(TotalMarks::isNumber)
				 		  .mapToInt(s -> Integer.parseInt(s))
				 		  .filter(n -> n <= 100)
				 		  .average();

		System.out.println(total.getAsDouble());
	}

}
