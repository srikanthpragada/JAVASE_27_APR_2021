package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		 ArrayList al = new ArrayList();
		 al.add("Abc");
		 al.add("Xyz");
		 al.add(10);  // 10 to Integer to Object 
		 
		 for(Object obj : al) {
			 System.out.println(obj);
			 System.out.println(obj.getClass());
		 }
		 
		 al.remove("Abc");
		 System.out.println(al.indexOf("Abc"));
		 Collections.sort(al);
		
	}
}
