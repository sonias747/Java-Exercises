/* Given an airplane’s acceleration a and take-off speed v, you can compute the minimum runway
 * length needed for take-off on a dry runway using the following formula:
 * length = ve2/2a
 * Write a program that promps the user to enter a number v for speed, a number a for acceleration,
 * and a character ‘w’ or ‘d’ to indicate if the runway is wet or dry. Then, display the calculated
 * runway length with the above formula, increasing the result of the formula by 15% if the runway is wet.
 * The third input should accept lower or upper case w or d and exit with an error message on any other input.
 */

package ma1;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for speed
		System.out.print("Enter the airplane's speed: ");
		double v = input.nextDouble();
		
		//Prompt the user for acceleration
		System.out.print("Enter the airplane's acceleration: ");
		double a = input.nextDouble();
		
		//Prompt the user for runway state
		System.out.print("Enter 'w' if the runway is wet and 'd' if the runway is dry: ");
		char runwayType = input.next().charAt(0);
		
		//Close the Scanner
		input.close();
		
		//Calculate the minimum length of dry runway
		double length = (v*v)/(2*a);  
		
		//Calculate the minimum length of wet runway
		double wetRunwayLength = length * 1.15;    
		
		//Display results
		//Checking if runway is wet
		if (runwayType == 'w' || runwayType == 'W') { 
			System.out.format("The minimun length needed is: %.2f", wetRunwayLength);
		}
		//Checking if runway is dry
		else if (runwayType == 'd' || runwayType == 'D') {  
			System.out.format("The minimun length needed is: %.2f", length);
		}
		//Otherwise display error message
		else {  
			System.out.println("Error: Wrong Input");
		}		
	}	
}