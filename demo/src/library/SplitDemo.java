package library;

public class SplitDemo {

	public static void main(String[] args) {
		String names = "Larry,Kevin,Jerry,Jason";
		
		for(var n : names.split(","))
			System.out.println(n.toUpperCase());
	}

}
