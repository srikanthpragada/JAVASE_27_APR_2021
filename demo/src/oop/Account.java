package oop;

public class Account {
	// Instance variables 
	private int acno;
	private String customer;
	private double balance;
	
	// Methods
	public void open(int no, String name) {
		acno = no;
		customer = name;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public double getBalance() {
		return balance;
	}
}
