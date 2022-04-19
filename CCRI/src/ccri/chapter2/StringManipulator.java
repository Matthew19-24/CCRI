package ccri.chapter2;
import java.util.Scanner; //For user input

/**
 * This program will take input of the user's favorite city and use it to display different outcomes
 */

/**
 * @author Matthew Mccaughey
 * @date 2022 02-12
 * @Assignment Chapter 2, Problem 12 (2.12)
 *
 */
public class StringManipulator {

	/**
	 * The main method takes the users favorite city as input
	 * It then displays the number of characters in the city name
	 * It displays the name in all uppercase letters
	 * It displays the name in all lowercase letters
	 * It displays the first letter of the name
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare Scanner object
		Scanner userInput = new Scanner(System.in);
		
		// Ask user to input their favorite city
		System.out.print("Enter the name of your favorite city: ");
		String city = userInput.nextLine();
			
		// Manipulate the String to output results
		System.out.println("\nNumber of characters: " + city.length());
		System.out.println("Uppercase: " + city.toUpperCase());
		System.out.println("Lowercase: " + city.toLowerCase());
		System.out.println("First Letter: " + city.charAt(0));
		
		//Close Scanner object
		userInput.close();
		
	}

}
