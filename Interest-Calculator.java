/* Write a program that prompts the user to enter an investment amount and an annual percentage
 * interest rate, and prints a table that displays future value for the years from 1 to 30, as below:
 * 
 * The amount invested: 1000
 * Annual interest rate: 9
 * Years Value
 * 1 1093.80
 * 2 1196.41
 * ...
 * 29 13467.25
 * 30 14730.57
 * 
 * Begin by writing a method that computes future investment value at a given monthly interest rate
 * for a specified number of years. The future investment is determined using the formula:
 * 		futureValue = amount ∗ ((1 + monthlyRate)e(numYears∗12))
 * Where monthlyRate is expressed in the range 0..1, e.g. 1.5% is 0.015. Divide the annual percent-
 * age by 1200 to convert to the monthly rate. For example, futureValue(10000, 5/1200, 5) returns
 * 12833.59.
 * 
 * Use the following method header:
 * public static double futureValue(double amount, double monthlyRate, int years)
 * 
 * Write a main method that prompts the user for an amount of money and an annual percentage
 * interest rate, and prints the table as above. You can assume numeric input, but your program
 * should check that the amount is not negative. Use print formatting to display each amount to only
 * two decimal places as in the example.
 */


package MA2;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for amount of money
		System.out.print("Enter the amount of money: ");
		double amount = input.nextDouble();
		
		//Prompt the user for annual percentage interest rate
		System.out.print("Enter the annual percentage interest rate: ");
		double monthlyRate = input.nextDouble();
		
		//Close the Scanner
		input.close();
		
		
		//Check if amount entered is positive
		if (amount <= 0) {
			System.out.println("Invalid input");
		}
		
		//Change monthlyRate to correct format
		monthlyRate = monthlyRate/1200;
		
		
		//Print the headings of the table
		System.out.println("Years" + "\t" + "Value");
		
		//Print the rest of the table by calling the futureValue method on each iteration
		for (int i=1; i<=30; i++) {
			System.out.printf(i + "\t" + "%.2f",(futureValue(amount, monthlyRate, i)));
			System.out.println();
		}
	}
	
	
	//Method to compute future investment value
	public static double futureValue(double amount, double monthlyRate, int years) {
		double futureValue = amount * (Math.pow((1+monthlyRate), (years*12)));
		return futureValue;
	}
}
