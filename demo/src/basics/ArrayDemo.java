package basics;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };

		for (int i = a.length - 1; i >= 0; i--)
			System.out.println(a[i]);

		// Enhanced for loop
		for (int n : a)
			System.out.println(n);
	}
}
