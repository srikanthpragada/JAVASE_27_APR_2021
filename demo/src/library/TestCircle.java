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
		return String.format("X = %d, Y = %d, Radius = %d",this.x, this.y, this.radius);
	}
	
	@Override 
	public boolean equals(Object obj) {
		// Pattern matching 
		if (obj instanceof Circle other)
		    return this.x == other.x && this.y == other.y && this.radius == other.radius;
		else
			return false;
	}
	
	@Override 
	public int hashCode() {
		return 1;
	}
}

public class TestCircle {
	public static void main(String[] args) {
		var c1 = new Circle(10, 20, 10);
		var c2 = new Circle(10, 20, 10);
		var c3 = new Circle(10, 10, 20);

		System.out.println(c1 == c2);        // Object references 
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1.equals("Abc"));
		System.out.println(c1.toString());
		
	}
}
