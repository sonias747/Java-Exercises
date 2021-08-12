/* Some websites impose certain rules for passwords. Write a method that checks whether a string is
 * a valid password. Suppose the password rules are as follows:
 * 
 * - A password must have at least two character.
 * - A password consists of only letters and digits.
 * - A password must contain at least three digits.
 * 
 * Write a program that prompts the user to enter a password and displays ‘Valid Password’ if the
 * rules are followed or ‘Invalid Password’ otherwise. Use a separate method for each of the rules.
 */

package MA2;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for a password
		System.out.print("Enter a password: ");
		String password = input.nextLine();
		
		//Close the Scanner
		input.close();
		
		
		//Check if password is correct and print result
		if (twoCharacters(password) && lettersAndDigits(password) && threeDigits(password)) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}
	}
	
	
	//Method to check if the password has at least 2 characters
	public static boolean twoCharacters(String password) {
		if (password.length() >= 2) {
			return true;
		}
		else {
			return false;
		}	
	}
	
	
	//Method to check if password consists of only letters and digits 
	public static boolean lettersAndDigits(String password) {
		for (int i=0; i<password.length(); i++) {
			if (Character.isLetterOrDigit(password.charAt(i))) {
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	
	//Method to check if password contains at least 3 digits
	public static boolean threeDigits(String password) {
		int count = 0;
		for (int i=0; i<password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				count++;
			}
		}
		if (count >= 3) {
			return true;
		}
		else {
			return false;
		}
	}
}
