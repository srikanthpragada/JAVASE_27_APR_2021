package collections;

public class GenericMethodDemo {

	public static <T> void print(T a[]) {
		for (T n : a)
			System.out.println(n);
	}

	public static <T extends Comparable<T>> boolean search(T a[], T value) {
		for (T n : a)
			if (n.compareTo(value) == 0)
				return true;

		return false;

	}

	static class Point implements Comparable<Point> {
		private int x, y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Point o) {

			return 0;
		}
	}

	public static void main(String[] args) {
		Integer marks[] = { 90, 78, 67, 98, 56 };
		Double prices[] = { 10.45, 67.00, 89.83, 77.45, 30.40 };
		String names[] = { "Java", "C#", "JavaScript", "Python", "TypeScript" };

		print(marks);
		print(names);
		print(prices);

		System.out.println(search(names, "Java"));

		Point points[] = { new Point(10, 20), new Point(30, 33) };
		System.out.println(search(points, new Point(1, 2)));

	}

}
