package library;

class Circle {
	private int x, y, radius;

	public Circle(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public String toString() {
		return this.x + "," + this.y + "," + this.radius;
	}
}

public class TestCircle {
	public static void main(String[] args) {
		var c1 = new Circle(10, 20, 10);
		var c2 = new Circle(10, 20, 10);
		var c3 = new Circle(10, 10, 20);

		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.toString());
	}
}
