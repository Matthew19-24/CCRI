package ccri.chapter5;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * This program will ask the user to enter the name of the file needed to open,
 * it will then ask for them to name a new file.
 * Then it will copy the file, convert it to all capital letters,
 * and save the file to the new file name.
 */

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br><b>Date</b>: 2022 03-24
 * @author <br><b>Assignment</b>: Chapter 4, Problem 15 (4.15)
 */
public class UppercaseFileConverter {

	/**
	 * The main method will take user input as a file name.
	 * It will also take a new file name as input.
	 * It will then convert the file to all uppercase letters,
	 * and save them to the new file name location.
	 * @param args Arguments passed by the command line.
	 * @throws IOException For reading and writing files
	 */
	public static void main(String[] args) throws IOException {
		// Declare variables
		String fileContents = null; // Used to hold the files contents
		boolean looper = true; // Used to determine if the user wants to exit program
		
		// Begin programs loop until user exits
		while (looper)
		{
			// Have user open file and convert it to a String
			fileContents = fileToCaps();
		
			// Have user save to a new file
			writeNewFile(fileContents);
		
			// Ask user if they want to loop again
			looper = goAgain();
		}
	}

	
	/**
	 * The fileToCaps method allows the user to enter a file name,
	 * it will then open it, convert it to all capital letters,
	 * and return it as a String.
	 * @return String of all the file's contents in upper case letters.
	 * @throws IOException For reading and writing files
	 */
	public static String fileToCaps() throws IOException
	{
		// Declare variables
		StringBuilder fileContents = new StringBuilder(); // To hold the file contents
		String userInput = null; // the file name that will be read
				
		// Ask for user input
		userInput = JOptionPane.showInputDialog("Enter file name:");
		
		// Open file to read
		File userFile = new File(userInput);
				
		// Check if file exists and loop until valid input
		while (!userFile.exists())
		{
			// Print to console for debugging
			userInput = JOptionPane.showInputDialog("Invalid file\nEnter a valid file name");
			userFile = new File(userInput);
		}
		
		// Open file with Scanner object
		Scanner readFile = new Scanner(userFile);
		
		// Copy contents of file to StringBuilder and make all letters uppercase
		while (readFile.hasNext())
		{
			fileContents.append(readFile.nextLine().toUpperCase());
			fileContents.append("\n");
		}
				
		// Close file
		readFile.close();
		
		// Print to console for debugging
		System.out.println(fileContents);
		
		// Return files contents as a String
		return fileContents.toString();
	}
	
	
	/**
	 * The writeNewFile method will ask the user to create a new file name,
	 * it will then write the contents of a String to the file's location.
	 * @param contents String to be written to file.
	 * @throws IOException For reading and writing files.
	 */
	public static void writeNewFile(String contents) throws IOException
	{
		// Declare variables
		String userInput = null;
		
		// Ask for user input for new file
		userInput = JOptionPane.showInputDialog("Create New File Name");
				
		// Open file to write
		PrintWriter writeFile = new PrintWriter(userInput);
				
		// Copy contents to file and make uppercase
		writeFile.println(contents);
				
		// Close files
		writeFile.close();
				
		JOptionPane.showMessageDialog(null, userInput + " was successfully created.");
		
	}
	
	/**
	 * The goAgain method is used to determine if the user wants to exit the program or run it again
	 * @return True if the user wants to run again, false if the user wants to exit.
	 */
	public static boolean goAgain()
	{
		int yesorno = -1; // used to store Yes or No answer
		   
		// Ask user to go again
		yesorno = JOptionPane.showConfirmDialog(null, "Would you like to run program again?", "Go Again?", JOptionPane.YES_NO_OPTION);
		   
		if (yesorno == 0)
		{
			// Write to console for debugging
			System.out.println("YES loop again.");
			   
			// Return true to continue loop
			return true;
		}
		else
		{
			// Write to console for debugging
			System.out.println("NO don't loop again.");
			   
			// Return false to stop loop
			return false;
		}
	}
}
