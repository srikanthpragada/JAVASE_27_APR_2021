package advanced;

class Task implements Runnable {
	public void run() {
		System.out.println("In run() of Task");
	}
}

public class LambdaDemo {

	public static void printNumbers() {
		for (int i = 1; i <= 5; i++)
			System.out.println(i);
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Task()); // Thread(Runnable)
		t1.start();

		// Using anonymous inner class
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Anonymous inner class thread!");
			}
		});

		t2.start();

		// Lambda Expression
		Thread t3 = new Thread(() -> System.out.println("Thread with Lambda!"));
		t3.start();

		// Lambda Block
		Thread t4 = new Thread(() -> {
			for (int i = 1; i <= 5; i++)
				System.out.println(i);
		});

		t4.start();

		// Thread t5 = new Thread(() -> printNumbers());

		// Method Reference
		Thread t5 = new Thread(LambdaDemo::printNumbers);
		t5.start();

	}

}
