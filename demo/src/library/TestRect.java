package library;

record Rect (int length, int width) {
	
}

public class TestRect {

	public static void main(String[] args) {
		 var r1 = new Rect(10,20);
		 var r2 = new Rect(10,20);
		 System.out.println(r1);
		 System.out.println(r1.equals(r2));
		 System.out.println(r1.width());

	}

}
