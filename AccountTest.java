package MA3;

public class AccountTest {
	public static void main(String[] args) {
		
		// Create Account with specified id and balance
		Account testAccount = new Account(101, 20000);
		
		
		// Set annual interest
		testAccount.setAnnualInterestRate(0.045);
		
		
		// Withdraw money from account
		testAccount.withdraw(2500);
		
		
		// Deposit money into account
		testAccount.deposit(3000);
		
		
		// Display account information
		System.out.println("Balance: $" + testAccount.getBalance());
		System.out.println("Monthly Interest Amount: " + testAccount.getMonthlyInterest());
		System.out.println("Date of Creation: " + testAccount.getDateCreated());
	}

}
