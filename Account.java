/* Implement a class named Account that contains:
 *  - A data field named id for an account (default 0).
 *  - A data field named balance for an account (default 0).
 *  - A Date data field named dateCreated that stores the date when an account was created.
 *  - A data field named annualInterestRate that stores the current interest rate (default 0).
 *    Assume all accounts have the same interest rate.
 *  - A no-arg constructor that creates a default account and sets the date of creation.
 *  - A constructor that creates an account with the specified id and balance and sets the date of creation.
 *  - Getter (accessor) and setter (mutator) methods for id, balance, and annualInterestRate.
 *  - A getter (accessor) method for dateCreated.
 *  - A method named getMonthlyInterest() that returns the monthly interest amount (which is given by: balance*annualInterestRate/ 12).
 *  - A method named withdraw that withdraws a specified amount from an account.
 *  - A method named deposit that deposits a specified amount to an account.
 *  - A toString() method that returns a string representation of an account (id, balance, and datecreated)
 *  
 * Write a test program that creates an Account object with an account id of 101, a balance of
 * $20,000,and set an annual interest rate of 0.045 (i.e. 4.5%). Withdraw $2,500 from the account and 
 * deposit $3,000. Display the balance, the monthly interest amount, and the date when the account
 * was created.
 */

package MA3;

import java.util.Date;

// Account Class
public class Account {
	private int id;
	private double balance;
	private Date dateCreated;
	private static double annualInterestRate;
	
	
	// No arg constructor with default account and sets date of creation
	public Account() {
		this.id =0;
		this.balance = 0;
		dateCreated = new Date();
		Account.annualInterestRate = 0;
	}
	
	
	// Constructor that creates account with specified id and balance and sets date of creation
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}
	
	
	// Id Getter
	public int getId() {
		return id;
	}
	
	
	// Id Setter
	public void setId(int id) {
		this.id = id;
	}
	
	
	// Balance Getter
	public double getBalance() {
		return balance;
	}
	
	
	// Balance Setter
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	// Annual Interest Rate Getter
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	
	// Annual Interest Rate Setter
	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}
	
	
	// Date Created Getter
	public Date getDateCreated() {
		return dateCreated;
	}
	
	
	// Method to get monthly interest
	public double getMonthlyInterest() {
		double monthlyInterest = (this.balance * Account.annualInterestRate)/12;
		return monthlyInterest;
	}
	
	
	// Method to withdraw a specified amount from an account
	public void withdraw(double amount) {
		this.balance = this.balance - amount;
	}
	
	
	// Method to deposit a specified amount to an account
	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}
	
	
	// Method to return a string representation of an account
	public String toString() {
		return "id: " + id + ", balance: " + balance + ", date created: " + dateCreated;
	}
		
	
}