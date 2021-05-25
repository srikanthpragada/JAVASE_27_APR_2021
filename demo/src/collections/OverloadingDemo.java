package collections;

public class OverloadingDemo {

	public static void print(int a[]) {
		for (int n : a)
			System.out.println(n);
	}

	public static void print(String a[]) {
		for (String n : a)
			System.out.println(n);
	}

	public static void main(String[] args) {
		int marks[] = { 90, 78, 67, 98, 56 };
		String names[] = { "Java", "C#", "JavaScript", "Python", "TypeScript" };

		print(marks);
		print(names);

	}

}
