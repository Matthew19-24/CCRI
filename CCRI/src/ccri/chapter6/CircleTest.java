/**
 * This program will test the Circle class.
 */

package ccri.chapter6;

import javax.swing.JOptionPane;

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date</b>: 2022 04-07
 * @author <br> <b>Assignment</b>: Chapter 6, Problem 7 (6.7)
 *
 */
public class CircleTest {

	/**
	 * The main method will run a loop until the user decides to quit the program.
	 * It will ask the user to enter in a circle's radius,
	 * it will then create a Circle object, using the radius as the argument.
	 * Using the radius outCome method, it will calculate and display
	 * the area, diameter, and the circumference. 
	 * @param args Arguments passed by the command line.
	 */
	public static void main(String[] args) {
		
		// Declare variables
		int looper = 0; // Used to control loop
		
		while (looper == 0)
		{
			// Create circle object
			Circle circle = new Circle();
			
			// Have user set radius
			circle.setRadius();
			
			// Display data
			JOptionPane.showMessageDialog(null, circle.outCome());
		
			// Ask user to go again
			looper = JOptionPane.showConfirmDialog(null, "Would you like to enter another circle?", 
														 "Go Again?", 
														 JOptionPane.YES_NO_OPTION);
			
		} // End loop
		
	} // End main method.
	
} // End class
