package oop;

public class Account {
	// Instance variables
	private int acno;
	private String customer;
	private double balance;

	// Class variables
	private static double minbal = 5000;
	
    // Static method 
	public static double getMinbal() {
		// System.out.println(this.balance);
		return Account.minbal;
	}

	// Constructor
	public Account(int acno, String customer) {
		this.acno = acno;
		this.customer = customer;
	}

	public Account(int acno, String customer, double balance) {
		this(acno, customer);
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (this.balance - Account.minbal >= amount)
			this.balance -= amount;
		else
			System.out.println("Insufficient Funds");
	}

	public double getBalance() {
		return this.balance;
	}
}
