/* Write a program that randomly generates an integer between 0 and 100, inclusive. The program
 * prompts the user to enter a number continuously until the number matches the randomly generated
 * number. For each user input, the program tells the user whether the number is too low or too high.
 */

package ma1;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		
		//Display program instructions
		System.out.println("Guess a number from 0-100");
		
		//Prompt user for number
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int guess = input.nextInt();
		
		//Generate random number between 0 - 100
		int number = (int)(Math.random()*(101));
		
		//While the guess is not equal to the random number
		while (guess != number) {
			
			//If the guess is greater than the random number
			if (guess > number) {
				System.out.println("Too high");         //Display too high message
				System.out.print("Enter a number: ");   //Prompt user for another guess
				guess = input.nextInt();
			}
			//If the guess is less than the random number
			else {
				System.out.println("Too low");          //Display too low message
				System.out.print("Enter a number: ");   //Prompt user for another guess
				guess = input.nextInt();
			}
		}
		//If guess is equal to random number display correct message
		System.out.println("Correct!");
		
		//Close the Scanner
		input.close();
	}
}
