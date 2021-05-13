package library;

public class Boxing {

	public static double process(Double d) {
		return d;
	}

	public static void main(String[] args) {
		Object obj;

		obj = "Abc";
		obj = 10.10; // Autoboxing - Primitive type to Object
		System.out.println(obj.getClass());

		double d = (Double) obj; // Unboxing
		System.out.println(d);

		process(10.10);

	}

}
