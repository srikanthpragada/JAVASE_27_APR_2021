package oop;

public class FinalDemo {
	private static final int rate = 10;
	
	public FinalDemo() {
		// rate = 100;
	}
	
	public void process() {
		System.out.println(rate);
	}
	
	public static void main(String[] args) {
		  System.out.println(FinalDemo.rate);
		  
		  FinalDemo obj = new FinalDemo();
		  obj.process();

	}

}
