package oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int total = 0;
		while (true) {
			System.out.print("Enter number [0 to stop] :");
			try {
				int num = Integer.parseInt(s.nextLine());
				if (num == 0)
					break;
				total += num;
			} catch (NumberFormatException ex) {
				System.out.println("Invalid Number!");
			}
		}

		System.out.println(total);
	}
}
