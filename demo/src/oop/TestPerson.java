package oop;

class Person {
	protected String name, email;

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void print() {
		System.out.println(this.name);  // Compile-time polymorphism 
		System.out.println(this.email);
	}

	public String getEmail() {
		return this.email;
	}
}

class Employee extends Person {
	protected String job;

	public Employee(String name, String email, String job) {
		super(name, email); // Call constructor of superclass
		this.job = job;
	}

	// Overriding
	@Override
	public void print() {
		super.print();
		System.out.println(this.job);
	}
}

class Player extends Person {
	private String game;

	public Player(String name, String email, String game) {
		super(name, email);
		this.game = game;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.game);
	}
}

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Employee("Mike", "mike@gmail.com", "Programmer");
		p.print();  // Runtime Polymorphism 

		p = new Player("Dhoni", "dhoni@gmail.com", "Cricket");
		p.print();  // Runtime Polymorphism 
	}
}
