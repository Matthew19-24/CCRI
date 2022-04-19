package ccri.chapter2;
import java.util.Scanner; //Used for user input

/**
 * This program asks questions and takes multiple lines of input
 * It then uses the input to tell a story
 */

/**
 * @author Matthew McCaughey
 * @date 2022 02-13
 * @Assignment Chapter 2, Problem 18 (2.18)
 *
 */
public class WordGame {

	/**
	 * The main method will take user input for:
	 * Name, age, city, college, profession, type of animal and a pet name
	 * It will then take each line of input and add it into a story
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variables
		String name = null;
		String age = null; 
		String city = null; 
		String college = null; 
		String profession = null; 
		String animal = null; 
		String animalName = null;
		
		// Declare Scanner object
		Scanner userInput = new Scanner(System.in);
		
		// Print out instructions to the user terminal
		System.out.println("I will tell you a story!\nType in an answer for each of the commands.");
			
		// Get user input for name
		System.out.print("\nYour name: ");
		name = userInput.nextLine().toUpperCase();
		
		// Get user input for age
		System.out.print("Your age: ");
		age = userInput.nextLine().toUpperCase(); //age is String in case user spells out age
		
		// Get user input for city name
		System.out.print("The name of a city: ");
		city = userInput.nextLine().toUpperCase();
		
		// Get user input for college name
		System.out.print("The name of a college: ");
		college = userInput.nextLine().toUpperCase();
		
		// Get user input for profession
		System.out.print("A profession: ");
		profession = userInput.nextLine().toUpperCase();
		
		// Get user input for type of animal
		System.out.print("A type of animal: ");
		animal = userInput.nextLine().toUpperCase();
		
		// Get user input for a pet name
		System.out.print("A pet's name: ");
		animalName = userInput.nextLine().toUpperCase();
		
		// Close Scanner object
		userInput.close();
		
		// Print story to user terminal
		System.out.println("\nThere once was a person named " + name + " who lived in " + city + ".");
		System.out.println("At the age of " + age + ", " + name + " went to college at " + college + ".");
		System.out.println(name + " graduated and went to work as a " + profession + "."); 
		System.out.println("Then, " + name + " adopted a(n) " + animal + " named " + animalName + "."); 
		System.out.println("They both lived happily ever after!");
	}

}
