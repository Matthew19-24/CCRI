package ccri.chapter4;
import javax.swing.JOptionPane;

/**
 * The program allows the user to enter a series of numbers
 * It then calculates the largest and smallest numbers and displays them
 */

/**
 * @author Matthew McCaughey
 * @date 2022 03-07
 * @Assignment Chapter 4, Problem 10 (4.10)
 *
 */
public class LargestAndSmallest {

	/**
	 * The main method takes a user input as an integer
	 * It then uses a while loop to continue asking the user to enter more integers
	 * Inside of the while loop, it uses if statements to decide if them number is
	 * bigger or smaller than the maximum and minimum numbers
	 * If they are, they replaces the variable
	 * @param args
	 */
	public static void main(String[] args) {

		// declare variables
		int maxNum = 0; // used to store the maximum number
		int minNum = 0; // used to store the minimum number
		int userInput = 0;
		

		// ask for the user to enter a series of integers
		userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer: (or -99 to stop)"));
		
		// set base number for variables
		maxNum = userInput;
		minNum = userInput;
		
		// loop until the user enters -99
		while (userInput != -99)
		{
			
			// if number is larger than maxNum, replace variable
			if (userInput >= maxNum)
				maxNum = userInput;
			
			// if number is smaller than minNum, replace variable
			if (userInput <= minNum)
				minNum = userInput;
			
			// ask for the user to enter integer
			userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer: (or -99 to stop)"));
		}
		
		// Output data
		JOptionPane.showMessageDialog(null, "Largest Number: " + maxNum + "\nSmallest Number: " + minNum);
		
	}

}
