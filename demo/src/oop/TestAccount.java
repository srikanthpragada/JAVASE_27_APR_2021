package oop;

public class TestAccount {

	public static void main(String[] args) {
		Account a1; // object reference 
		
		a1 = new Account();  // object or instance
		// a1.acno = 1;
		a1.open(1,  "Scott");
		a1.deposit(10000);
		
		System.out.println(a1.getBalance());
		
		Account a2 = new Account();
	}

}
