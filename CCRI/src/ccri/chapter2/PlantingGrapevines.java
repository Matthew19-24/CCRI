package ccri.chapter2;
import java.util.Scanner; //Used for user input

/**
 * This program will calculate how many grapevines a gardener can plant
 */

/**
 * @author Matthew McCaughey
 * @date 2022 02-13
 * @Assignment Chapter 2, Problem 20 (2.20)
 *
 */
public class PlantingGrapevines {

	/**
	 * The main method will take user input and calculate how many grapevines a gardener can plant
	 * User input is how long in feet a row is
	 * How much space in feet an end post takes up
	 * Amount of space is needed between vines
	 * It will then calculate using the data input
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare variables
		double rows = 0; // Space in feet in each row
		double endposts = 0; //Space each end post takes up in feet
		double spaces = 0; // How much space between each grapevine is needed
		int grapevines = 0; // Amount of grapevines calculated
		
		// Declare Scanner object
		Scanner userInput = new Scanner(System.in);
		
		// Print instructions
		System.out.println("To determine how many grapevines to plant, please enter the following data in feet");
			
		// Ask for user input for length of rows
		System.out.print("\nLength of rows: ");
		rows = userInput.nextDouble();
		
		// Ask for user input for length of space each end post takes
		System.out.print("\nLength of space an end post takes: ");
		endposts = userInput.nextDouble();
		
		// Ask for user input for length of space between the vines
		System.out.print("\nAmount of space between vines: ");
		spaces = userInput.nextDouble();
		
		// Close the Scanner object
		userInput.close();
		
		// Calculate amount of grapevines to plant
		grapevines = (int)((rows - 2 * endposts) / spaces);
		
		// Print out data
		System.out.println("\nNumber of grapevines you can fit: " + grapevines);
		

	}

}
