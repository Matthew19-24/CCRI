package ccri.chapter3;
import javax.swing.JOptionPane;

/**
 * This program will determine if user entered date is considered a magic date
 * This means the month multiplied by the day equals the two two digit year
 */

/**
 * @author Matthew McCaughey
 * @date 2022 02-23
 * @Assignment Chapter 3, Problem 2 (3.2)
 *
 */
public class MagicDates {

	/**
	 * The main method will ask for the user to input a numeric month, a day, and a two-digit year
	 * It will then multiply the month by the day
	 * Then it will compare and see if the product is equal to the two-digit year
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare variables
		int month = 0;
		int day = 0;
		int year = 0;
		String userInput = null;
		
		// Ask for month and convert to int
		userInput = JOptionPane.showInputDialog("Enter the number for a month");
		month = Integer.parseInt(userInput);
		
		// Ask for day and convert to int
		userInput = JOptionPane.showInputDialog("Enter the a date of the month");
		day = Integer.parseInt(userInput);
		
		// Ask for the year and convert to int
		userInput = JOptionPane.showInputDialog("Enter two digits for the year");
		year = Integer.parseInt(userInput);
		
		// Calculate if it is a magic date and output the data
		if (month * day == year)
			JOptionPane.showMessageDialog(null, "The date " + month + "/" + day + "/" + year + " is a Magic Date!");
		else
			JOptionPane.showMessageDialog(null, "The date " + month + "/" + day + "/" + year + " is not a Magic Date...");

	}

}
