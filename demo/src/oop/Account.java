package oop;

public class Account {
	// Instance variables 
	private int acno;
	private String customer;
	private double balance;
	
	// Constructor 
	public Account(int no, String name) {
	    acno = no;
		customer = name;
	}
	
	public Account(int no, String name, double bal) {
	    acno = no;
		customer = name;
		balance = bal;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public double getBalance() {
		return balance;
	}
}
