package ccri.chapter3;
import javax.swing.JOptionPane;

/**
 * The program will take user input, choosing "Air", "Water" or "Steel" and a distance
 * The program will then output the time it will take for sound to move through that element
 */

/**
 * @author Matthew McCaughey
 * @date 2022 02-28
 * @Assignment Chapter 3, Problem 12 (3.12)
 */
public class SpeedOfSound {

	/**
	 * The main method will ask the user which element they want to calculate
	 * Out of the options Air, Water or Steel
	 * It will then ask the user how much distance the sound will travel through
	 * Outputting the time it will take for sound to move through the distance in the element
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare variables
		String element = null;
		double distance = 0;
		int speed = 0;
		double time = 0;
		
		// Get user input for the element
		element = JOptionPane.showInputDialog("Please choose an element: Type air, water, or steel").toLowerCase();
		
		// Get user input for distance
		distance = Double.parseDouble(JOptionPane.showInputDialog("Please the amount of distance for the sound to travel in FEET."));
		
		// Use the switch to determine the speed sound travels through the element
		switch (element) 
		{
		// Speed sound travels through air 1,100 feet per second
		case "air":
			speed = 1100;
			break;
		
		// Speed sound travels through water 4,900 feet per second
		case "water":
			speed = 4900;
			break;
			
		// Speed sound travels through steel 16,400 feet per second
		case "steel":
			speed = 16400;
			break;
			
		// Close program if invalid entry of elements
		default:
			JOptionPane.showMessageDialog(null, "Invalid element type.\nPlease restart program and try again.");
			System.exit(0);
		}
		
		// Calculate the time it takes to travel the distance
		time = distance / speed;
		
		// Output the data
		JOptionPane.showMessageDialog(null, "The sound will travel through " + String.format("%,.2f", distance) + " feet of " + element + " in " + String.format("%,.2f", time) + " seconds.");
		
	}

}
