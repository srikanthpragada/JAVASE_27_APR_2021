package oop;

@FunctionalInterface
interface Printable {
	int size = 100; // static final in class

	void print();

	// 8
	default String target() {
		return getTarget();
	}

	// 9
	private String getTarget() {
		return "screen";
	}
}

class MyPrintable implements Printable {
	public void print() {
		System.out.println("Printing");
		System.out.println(target());
	}
}

public class TestInterface {

	public static void main(String[] args) {
		System.out.println(MyPrintable.size);
		
		var p = new Printable() {
			@Override
			public void print() {
				System.out.println("Anonymous Class");
				
			}
		};

	    p.print(); 
		System.out.println(p.getClass());
		
		// Lambda Expression
		Printable pl = () -> System.out.println("Lambda");
		pl.print(); 
		
		
		
	}

}
