/* Write a program that prompts the user to enter two strings and displays the largest common prefix
 * of the two strings. Here are some examples (note that case should be taken into account when
 * finding prefixes; for example, the characters ’a’ and ’A’ should not be considered a match):
 * For input strings “Car” and “Cars”, the program should display ”Car”
 * For input strings “Welcome to Java!” and “Welcome to Java”, the program should display “Welcome
 * to Java”
 * For input strings “Hi ALL” and “Hi All”, the program should display “Hi A”
 * For input strings “Abc” and “abc”, the program should display “no common prefix”
 */

package ma1;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for first string
		System.out.print("Enter a string: ");
		String string1 = input.nextLine();
		
		//Prompt the user for second string
		System.out.print("Enter another string: ");
		String string2 = input.nextLine();
		
		//Close the Scanner
		input.close();
		
		//Initialise the prefix as empty string
		String prefix = "";
		
		//Check for the existence of common prefix
		for (int i = 0; i < (Math.min(string1.length(), string2.length())); i++) {
			if (string1.charAt(i) == string2.charAt(i)) {     //If both characters at index i match
				prefix += string1.charAt(i);                  //Add character to prefix string
			}
			else {        //If characters don't match
				break;    //Break out of loop
			}
		}	
		//If prefix exists display results	
		if (prefix.length() > 0) {
			System.out.println(prefix);	
		}
		//If prefix doesn't exist display no common prefix message
		else {
			System.out.println("No common prefix");	
		}	
	}	
}	
