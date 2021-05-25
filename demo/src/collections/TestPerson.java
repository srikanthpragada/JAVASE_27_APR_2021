package collections;

import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return String.format("%s %d", this.name, this.age);
	}

	@Override
	public boolean equals(Object obj) {
		Person other = (Person) obj;
		return this.name.equals(other.name) && this.age == other.age;
	}
	
	@Override
	public int hashCode() {
		 return this.age;
	}

	@Override
	public int compareTo(Person other) {
	    return  this.age - other.age;
	}
	
}

public class TestPerson {

	public static void main(String[] args) {
		var persons = new TreeSet<Person>();
		persons.add(new Person("Pqr", 25));
		persons.add(new Person("Abc", 35));
		persons.add(new Person("Def", 22));
		persons.add(new Person("Bbb", 21));
		persons.add(new Person("Def", 22));

		for (Person p : persons)
			System.out.println(p);

	}

}
