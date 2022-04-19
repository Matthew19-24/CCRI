package ccri.chapter6;

/**
 * This program will test the RouletteWheelColors class.
 */

import javax.swing.JOptionPane;

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date</b>: 2022 04-12
 * @author <br> <b>Assignment</b>: Chapter 6, Problem 16 (6.16)
 *
 */
public class RouletteWheelColorsTest {

	/**
	 * The main method will create a RouletteWheelColors object.
	 * It will then set the pocket number, and display the pockets color.
	 * @param args Arguments passed by the command line.
	 */
	public static void main(String[] args) {
		// Create variables
		int loop = 0; // Used to control the loop
		
		while (loop == 0)
		{
			// Create RouletteWheelColors object
			RouletteWheelColors wheel = new RouletteWheelColors();
			
			// Have user set pocket number
			wheel.setPocketNumber();
			
			// Display pocket color
			JOptionPane.showMessageDialog(null, "The color is " + wheel.getPocketColor());
			
			loop = JOptionPane.showConfirmDialog(null, "Would you like to enter another?",
					 									"Go Again?",
					 									JOptionPane.YES_NO_OPTION);
		}
		
	} // End main method.

} // End class.