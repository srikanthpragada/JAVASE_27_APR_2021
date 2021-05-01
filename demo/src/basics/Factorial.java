package basics;

public class Factorial {

	public static void main(String[] args) {
		int fact = 1;
		
		  int num = Integer.parseInt(args[0]);  // String to int
		  for(int i = 1; i <= num; i ++)
			    fact *= i;
		  
		  System.out.printf("Factorial of %d is %d",num,fact);

	}

}
