package oop;

public class TestAccount {

	public static void main(String[] args) throws Exception {
		
		System.out.println(Account.getMinbal());
		
		Account a1; // object reference
		a1 = new Account(1, "Scott");
		a1.deposit(10000);
		a1.deposit(5000);
		a1.withdraw(50000);
		
		System.out.println(a1.getBalance());

		Account a2 = new Account(2, "Bob", 20000);
		System.out.println(a2.getBalance());
	}

}
