package ccri.chapter2;
import java.util.Scanner; //Used for user input

/**
 * This program will take test score results and calculate their average
 */

/**
 * @author Matthew Mccaughey
 * @date 2022 02-11
 * @Assignment Chapter 2, Problem 10 (2.10)
 *
 */
public class TestAverage {

	/**
	 * The main method will take 3 test results as user input
	 * It will then calculate the tests average
	 * Finally it will output each test result and their average
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare variables
		double test1 = 0; 
		double test2 = 0;
		double test3 = 0; 
		double average = 0;
		
		// Declare Scanner object
		Scanner userInput = new Scanner(System.in);
		
		// Print out instructions
		System.out.println("Please enter 3 of your test result scores on separate lines.\n");
			
		// Ask for input for test result 1
		System.out.print("Test 1: ");
		test1 = userInput.nextDouble();
		
		// Ask for input for test result 2
		System.out.print("Test 2: ");
		test2 = userInput.nextDouble();
		
		// Ask for input for test result 3
		System.out.print("Test 3: ");
		test3 = userInput.nextDouble();
		
		// Close the Scanner object
		userInput.close();
		
		// Calculate the average
		average = (test1 + test2 + test3) / 3;
		
		// Output the results
		System.out.println("\nYour results are as follows:\n");
		System.out.println("Test 1: " + (int)Math.round(test1) + "%");
		System.out.println("Test 2: " + (int)Math.round(test2) + "%");
		System.out.println("Test 3: " + (int)Math.round(test3) + "%");
		System.out.println("\nAverage Score: " + (int)Math.round(average) + "%");

	}

}