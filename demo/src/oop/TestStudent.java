package oop;

class Student {
	private String name;
	private int course, feepaid;

	public Student(String name, int course, int feepaid) {
		this(name,course);  // call another constructor 
		this.feepaid = feepaid;
	}

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(getCourseName());
		System.out.println(feepaid);
	}

	public void payment(int amount) {
		feepaid += amount;
	}

	private int totalFee() {
		if (course == 1)
			return 5000;
		else
			return 10000;
	}

	private String getCourseName() {
		if (course == 1)
			return "Java";
		else
			return "Java EE";
	}

	public int getDue() {
		return totalFee() - feepaid;
	}
}

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("James", 2);
		s1.payment(3000);
		s1.print();
		System.out.println(s1.getDue());

		Student s2 = new Student("Anders", 2, 5000);
		s2.print();

	}

}
