package ccri.chapter4;
import java.io.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * This program will ask the user to enter the name of the file needed to open
 * It will then ask for them to name a new file
 * Then copy the file over, convert it to all capital letters
 * Then it will save the file to the new files name
 */

/**
 * @author Matthew McCaughey
 * @date 2022 03-08
 * @Assignment Chapter 4, Problem 15 (4.15)
 *
 */
public class UppercaseFileConverter {

	/**
	 * The main method will take user input as a file name
	 * It will use a while loop to validate that the input is an existing file
	 * Then it will ask the user to enter a new file name to save to
	 * It will iterate through the original file with a while loop
	 * Using .toUpperCase() to convert everything to uppercase letters
	 * As well as writing them to the new file
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
		// declare variables
		String userInput = null; // the file name that will be read
		
		// ask for user input
		userInput = JOptionPane.showInputDialog("Enter file name:");
		
		// open file to read
		File userFile = new File(userInput);
		
		// check if file exists and loop until valid input
		while (!userFile.exists())
		{
			userInput = JOptionPane.showInputDialog("Invalid file\nEnter a valid file name");
			userFile = new File(userInput);
			
		}
		
		// open the file for reading
		Scanner readFile = new Scanner(userFile);
		
		// ask for user input for new file
		userInput = JOptionPane.showInputDialog("Create New File Name");
		
		// open file to write
		PrintWriter writeFile = new PrintWriter(userInput);
		
		// copy contents to file and make uppercase
		while (readFile.hasNext())
			writeFile.println(readFile.nextLine().toUpperCase());
		
		// close files
		readFile.close();
		writeFile.close();
		
		JOptionPane.showMessageDialog(null, userInput + " was successfully created.");
		
		
		}

	}
