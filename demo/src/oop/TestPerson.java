package oop;

class Person {
	protected String name, email;

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}
	public void print() {
		System.out.println(this.name);
		System.out.println(this.email);
	}
	
	public String getEmail() {
		return this.email;
	}
}

class Employee extends Person {
    protected String job;
	public Employee(String name, String email, String job) {
		super(name,email);   // Call constructor of superclass 
		this.job = job;
	}
	// Overriding
	public void print() {
		super.print();
		System.out.println(this.job);
	}
}

public class TestPerson {

	public static void main(String[] args) {
		Employee e = new Employee("Mike","mike@gmail.com","Programmer");
		e.print(); 
		System.out.println(e.getEmail());

	}

}
