package basics;

public class MonthDays2 {

	public static void main(String[] args) {
		int month = 6;
		int days;

		// Switch Expression 
		days = switch (month) {
		case 2 -> 28;
		case 4, 6, 9, 11 -> 30;
		default -> 31;
		};

		System.out.println(days);
	}

}
