package ccri.chapter2;
import java.util.Scanner; //used for user input

/**
 * This program will compute the tax and tips on a restaurant bill
 */

/**
 * @author Matthew McCaughey
 * @date 2022 02-12
 * @Assignment Chapter 2, Problem 13 (2.13)
 *
 */
public class RestaurantBill {

	/**
	 * The main method will calculate the tips and tax on a restaurant bill
	 * Taxes are 6.75%
	 * Tips are 20%
	 * User will input the price of the meal
	 * The taxes and tips will be generated into a total
	 * The output will be in receipt form
	 * @param args
	 */
	
	// Declare final variables
	final static private double TAX = .0675;
	final static private double TIP = .20;
	
	// Define main method
	public static void main(String[] args) {
		
		// Declare variables
		double subtotal = 0; // User input for price of bill
		double tax = 0; // Amount of sales tax calculated
		double tip = 0; // Amount of tips calculated
		double total = 0; // Total after taxes and tips added
		
		// Declare Scanner object
		Scanner userInput = new Scanner(System.in);
		
		// Ask for user to input meal charge and add it to total
		System.out.print("Meal Price: ");
		subtotal = userInput.nextDouble();
		total += subtotal;
		
		// Close Scanner object
		userInput.close();
		
		// Calculate tax and add it to total
		tax = total * TAX;
		total += tax;
		
		// Calculate tip and add it to total
		tip = total * TIP;
		total += tip;
		
		// Output data to the users terminal
		// Use format to round to 2 decimal points
		System.out.println("\nSUBTOTAL: $" + String.format("%.2f", subtotal));
		System.out.println("TAXES: $" + String.format("%.2f", tax));
		System.out.println("TIP: $" + String.format("%.2f", tip));
		System.out.println("TOTAL: $" + String.format("%.2f", total));
		
		
	}

}
