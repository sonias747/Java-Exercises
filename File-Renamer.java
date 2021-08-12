/* Write a program that renames a file. The program checks whether the file exists. If so, change the
 * file name by appending the date and time to the file. Pass the filename from the command line.
 */

package MA4;

import java.io.*;
import java.util.Date;

public class Q2 {
	public static void main (String [] args) {
		
		// Constructing file object
		File f = new File(args[0]);
		
		// Checking if file exists and renaming it
		if (f.exists()) {
			File oldName = new File(args[0]);
			File newName = (new File(args[0] + new Date()));
			oldName.renameTo(newName);
			
			// Printing new name of file
			System.out.println("Success. New file is " + newName);
		}
		else {
			// Printing error message if file doesn't exist
			System.out.println("The file does not exist");
		}
			
	}
}
