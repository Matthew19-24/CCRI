package ccri.chapter3;
import javax.swing.JOptionPane;

/**
 * This program will ask the user if a person in their party is a vegan, vegetarian, or gluten-free
 * It will then display the restaurants that they may visit based on the input
 */

/**
 * @author Matthew McCaughey
 * @date 2022 03-02
 * @Assignment Chapter 3, Problem 18 (3.18)
 *
 */
public class RestaurantSelector {

	/**
	 * The main method will take user input 3 times
	 * It will ask if a member in the party is a vegan, a vegitarian, or gluten-free
	 * It will then use the input to switch boolean variables of the same names
	 * It uses the if statement to display the restaurants that support the diets of the members in the party
	 * @param args
	 */
	public static void main(String[] args) {

		// Declare boolean variables
		// These will switch to true if a member is one of the following
		boolean vegan = false; 
		boolean vegetarian = false; 
		boolean gluten_free = false;
		
		// Declare variables for userInput and data output
		String userInput = null;
		StringBuilder restaurants = new StringBuilder(); // This will append each restaurant for output
		
		// Append the first message to StringBuilder
		restaurants.append("Available restaurants based on your party's diets: \n\n");
		
		// Ask if user is a vegan
		userInput = JOptionPane.showInputDialog("Are you a vegan? (Enter Yes or No)");
		
		// If user answers yes, switch vegan boolean to true
		if (userInput.toLowerCase().charAt(0) == 'y')
			vegan = true;
		
		// Ask if user is a vegetarian
		userInput = JOptionPane.showInputDialog("Are you a vegitarian? (Enter Yes or No)");
		
		// If user answers yes, switch vegetarian boolean to true
		if (userInput.toLowerCase().charAt(0) == 'y')
			vegetarian = true;
		
		// Ask if user is gluten-free
		userInput = JOptionPane.showInputDialog("Are you gluten-free? (Enter Yes or No)");
		
		// If user answers yes, switch gluten_free boolean to true
		if (userInput.toLowerCase().charAt(0) == 'y')
			gluten_free = true;
		
		// Append available restaurants with no restrictions
		restaurants.append("Corner Café\n");
		restaurants.append("The Chef's Kitchen\n");
		
		// Append available restaurants who don't support vegan
		if (vegan == false)
			restaurants.append("Main Street Pizza Company\n");
		
		// Append available restaurants who don't support vegan or gluten-free
		if (vegan == false && gluten_free == false)
			restaurants.append("Mama's Fine Italian\n");
		
		// Append available restaurants who don't support any diet restrictions
		if (vegan == false && gluten_free == false && vegetarian == false)
			restaurants.append("Joe's Gourmet Burgers");
		
		//Output the available restaurants
		JOptionPane.showMessageDialog(null, restaurants);

	}

}
