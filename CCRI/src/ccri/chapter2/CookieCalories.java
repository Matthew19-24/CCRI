package ccri.chapter2;
import java.util.Scanner; //Used for user input

/**
 * This program will calculate the amount of calories of cookies a user consumed
 */

/**
 * @author Matthew Mccaughey
 * @date 2022 02-09
 * @Assignment Chapter 2, Problem 8 (2.8)
 *
 */
public class CookieCalories {

	/**
	 * The main method takes how many cookies the user ate as input
	 * It then calculates how many calories were consumed
	 * Each bag has 40 cookies
	 * Each bag has 10 servings
	 * Each serving is equal to 300 calories
	 * @param args
	 */
	
	// Declare final variables
	final static private int COOKIE_BAG = 40; // How many cookies in each bag
	final static private int BAG_SERVINGS = 10; // How many servings in one bag
	final static private int CALORIES = 300; // Amount of calories per serving
	
	// Define the main method
	public static void main(String[] args) {
		
		// Calculate the amount of calories in a single cookie
		int calories = CALORIES / (COOKIE_BAG / BAG_SERVINGS);
		
		// Declare Scanner object
		Scanner userInput = new Scanner(System.in);
		
		// Ask user how many calories they consumed and output the data
		System.out.print("How many cookies did you eat? ");
		System.out.println("\nYou had " + (int)(userInput.nextDouble() * calories) + " calories");
			
		// Close the Scanner object
		userInput.close();

	}

}
