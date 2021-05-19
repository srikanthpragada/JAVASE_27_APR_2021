package oop;

public class AssertDemo {

	public static boolean isEven(int n) {
		return n % 2 == 0;
	}

	public static void main(String[] args) {
		int a = 10, b = 20;

		assert a == b : "Not equal";
		assert isEven(10) : "isEven() not working";

	}

}
