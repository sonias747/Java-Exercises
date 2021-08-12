/* Write a program that will count the number of characters, words and lines in a file. Words are
 * separated by whitespace characters. The file name should be passed as a command-line argument.
 */

package MA4;

import java.io.*;
import java.util.Scanner;

public class Q1 {
	public static void main (String [] args) {
		
		// Constructing file object
		File f = new File(args[0]);
		
		// Defining variables
		int characters = 0;
		int words = 0;
		int lines = 0;
		
		
		// Finding number of words
		try {
			Scanner in = new Scanner(f);
			while (in.hasNext()) {
				in.next(); 
				words += 1;
			}
			in.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	
		
		// Finding number of lines and characters
		try {
			Scanner in = new Scanner(f);
			while (in.hasNextLine()) {
				String line = in.nextLine(); 
				lines += 1;
				characters += line.length();
			}
			in.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		
		// Printing results
		System.out.println("File " + args[0] + " has:");
		System.out.println(characters + " characters"); 
		System.out.println(words + " words"); 
		System.out.println(lines + " lines");
	}
}