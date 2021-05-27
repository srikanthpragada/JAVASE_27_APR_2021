package collections;

import java.util.ArrayList;

public class ArrayListGenericDemo {

	public static void main(String[] args) {
		var al = new ArrayList(); // RAW means not type-safe 
		var names = new ArrayList<String>(); // Type-safe 

		al.add(10); // Autoboxing
		al.add("Abc");

		String s = (String) al.get(0);

		names.add("Abc");
		
		s = names.get(0);
		 

	}
}
