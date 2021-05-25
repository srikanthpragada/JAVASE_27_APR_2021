package collections;

import java.util.ArrayList;

public class ArrayListRawDemo {

	public static void main(String[] args) {
		 ArrayList al = new ArrayList();
		 
		 al.add(10);  // 10 to Integer to Object 
		 al.add("Abc");
		 al.add("Xyz");
		
		 
		 String s = (String) al.get(0);
		 
		 
	}
}
