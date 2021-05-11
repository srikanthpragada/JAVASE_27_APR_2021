package oop;

record Contact(String name, String email, String mobile) {
}

public class RecordsDemo {

	public static void main(String[] args) {

		var c1 = new Contact("A", "a@gmail.com", "123456");
		var c2 = new Contact("A", "a@gmail.com", "123456");
		System.out.println(c1.toString());
		System.out.println(c1.equals(c2));
		System.out.println(c1.email()); // getter method

	}

}
