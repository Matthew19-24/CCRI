package ccri.chapter4;
import javax.swing.JOptionPane;

/**
 * This program will take a String and a char as user input
 * It will then output how many times the char is inside of the string
 */

/**
 * @author Matthew McCaughey
 * @date 2022 03-07
 * @Assignment Chapter 4, Problem 5 (4.5)
 *
 */
public class LetterCounter {

	/**
	 * The main method will take user input as a String.
	 * It will then take user input as a character.
	 * Then it will use a for loop with an if statement to
	 * find the amount of times the specific character appears in the input String.
	 * @param args
	 */
	public static void main(String[] args) {

		// declare variables
		String userString = null; //used for the users String input
		char userChar = 0; // used for the users char input
		int letterCounter = 0; // used as a running total counting the char's
		
		// ask user to enter a string
		userString = JOptionPane.showInputDialog("Please input any word or statement bellow:");
		
		// ask user to enter a char
		userChar = JOptionPane.showInputDialog("Please input any single character\n").toLowerCase().charAt(0);
		
		// use for loop to iterate through the String
		for (int letter = 0; letter < userString.length(); letter++)
		{
			// if the character at the iterations index is == to the character, add one to running total
			if (userString.toLowerCase().charAt(letter) == userChar)
				++letterCounter;
		}
		
		// output the data
		JOptionPane.showMessageDialog(null, "The character \'" + userChar + "\' is in the string \"" + 
											userString + "\" " + letterCounter + " times!");
		
		
			
		
	}

}
