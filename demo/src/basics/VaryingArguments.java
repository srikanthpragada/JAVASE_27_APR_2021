package basics;

public class VaryingArguments {

	public static int total(int ... values) {
		 int total = 0;
		 for(int v : values)
			 total += v;
		 
		 return total;
	}
	public static void main(String[] args) {
	    System.out.println(total(10,20));
	    System.out.println(total(10,20,40));
	    System.out.println(total(10,20,40,59));

	}

}
