package collections;

import java.util.ArrayList;

public class ArrayListGenericDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		ArrayList<Integer> nums = new ArrayList<>();

		al.add("Abc");
		al.add("Xyz");
		
		nums.add(10);

		String s = al.get(0);
		int v = nums.get(0);  // Integer object to int  (Unboxing)

	}
}
