/* Write a program that reads in a string representing a series of results of a sports team, where ’W’
 * represents a win, ’D’ represents a draw, and ’L’ represents a loss. Assuming three points for a win,
 * one for a draw, and zero for a loss, your program should return the points total of the team over
 * the games, and their average points-per-game. Your program should check that the input string
 * only contains the characters ’W’, ’D’, or ’L’, ignoring case.
 * 
 * Enter a string representing any number of wins, draws and losses e.g. "WWDLDL"
 *    WD-D
 *    Invalid format, enter again
 *    WDLD
 *    Total points:5
 *    Average points:1.25 
 */

package MA2;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for team results
		System.out.print("Enter team results: ");
		String userInput = input.nextLine();
		
		//Close the Scanner
		input.close();
		
		
		//Change input to lower case
		String teamResults = userInput.toLowerCase();
		
		//Initialise points
		int totalPoints = 0;
		
		
		//Check for invalid input
		for (int i=0; i<teamResults.length(); i++) {
			if (teamResults.charAt(i) == 'w' || teamResults.charAt(i) == 'd' || teamResults.charAt(i) == 'l') {
			}
			else {
				System.out.println("Invalid input");
				System.exit(0);
			}
		}
		
		
		//Calculate the results
		for (int i=0; i<teamResults.length(); i++) {
			if (teamResults.charAt(i) == 'w') {
				totalPoints += 3;
			}
			else if (teamResults.charAt(i) == 'd') {
				totalPoints += 1;
			}
		}
		
		
		//Print results
		System.out.println("Total points: " + totalPoints );
		System.out.printf("Average points: " + "%.2f", ((double)totalPoints/(teamResults.length())));
	}
}
