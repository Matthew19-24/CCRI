package ccri.chapter3;
import javax.swing.JOptionPane;

/**
 * This program will convert an objects mass in kilograms to it's weight in Newtons
 * It will also tell if the object is too heavy or too light
 */

/**
 * @author Matthew McCaughey
 * @date 2022 02-24
 * @Assignment Chapter 3, Problem 5 (3.5)
 *
 */
public class MassAndWeight {

	/**
	 * The main method will take an objects mass in kilograms as input
	 * It will then convert the mass into it's weight in Newtons using (Weight = Mass x 9.8)
	 * After conversion it will display if the object is too heavy (more than 1,000)
	 * Or too light (less than 10)
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Declare variables
		double weight; // In Newtons
		double mass; // In kilograms
		String message; // Used to store output message
		
		// Ask for mass as user input
		mass = Double.parseDouble(JOptionPane.showInputDialog("Please enter the objects mass in kilograms"));
		
		// Convert to weight
		weight = mass * 9.8;
		
		// Set output message
		message = mass + " Kilograms is equal to " + String.format("%,.2f", weight) + " in Newtons.";
		
		// Determine if too heavy or too light and output data
		if (weight > 1000)
			JOptionPane.showMessageDialog(null, message + "\nThe object is too heavy!");
		else if (weight < 10)
			JOptionPane.showMessageDialog(null, message + "\nThe object is too light!");
		else
			JOptionPane.showMessageDialog(null, message);
		
	}

}
