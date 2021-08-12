/* Write a program that prompts the user to enter the year as an integer, and the month number
 * as an integer from 1–12, and displays the number of days in the month. For example, if the year
 * number is 2020, and the month number is 2, the program should display “29 days”. The program
 * should return an error message if the month number is not between 1–12.
 */

package ma1;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		
		//Prompt the user for year
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year as an integer: ");
		int year = input.nextInt();
		
		//Prompt the user for month
		System.out.print("Enter a month as an integer from 1-12: ");
		int month = input.nextInt();
		
		//Close the Scanner
		input.close();
	
		//Display results
		switch (month) {
		case 1:
			System.out.println("31 days");
			break;
		case 2:
			//Check if the year entered is a leap year
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
				System.out.println("29 days");
			}
			else {
				System.out.println("28 days");
			}
			break;
		case 3:
			System.out.println("31 days");
			break;
		case 4:
			System.out.println("30 days");
			break;
		case 5:
			System.out.println("31 days");
			break;
		case 6:
			System.out.println("30 days");
			break;
		case 7:
			System.out.println("31 days");
			break;	
		case 8:
			System.out.println("31 days");
			break;
		case 9:
			System.out.println("30 days");
			break;
		case 10:
			System.out.println("31 days");
			break;
		case 11:
			System.out.println("30 days");
			break;
		case 12:
			System.out.println("31 days");
			break;	
		//Display error message if wrong input	
		default: System.out.println("Error: the month number is not between 1-12");	
		}
	}
}
