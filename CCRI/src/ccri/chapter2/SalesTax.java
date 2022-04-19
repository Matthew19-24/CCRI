package ccri.chapter2;
import java.util.Scanner; // Needed for user input with Scanner

/**
 * This program will calculate a total purchase price after taxes have been calculated
 */

/**
 * @author Matthew Mccaughey
 * @date 2022 02-09
 * @Assignment Chapter 2, Problem 7 (2.7)
 *
 */
public class SalesTax {

	/**
	 * The main method will collect a sales price as user input
	 * It will then calculate the state and county sales taxes
	 * State taxes are 4% and county taxes are 2%
	 * It will then generate the total by adding the price and the taxes together
	 * It will print the subtotal, state tax cost, county tax cost and the total
	 * @param args
	 */
	
	// Declare final variables
	final static private double STATE_TAX = 0.04; // Percentage of state taxes
	final static private double COUNTY_TAX = 0.02; // Percentage of county taxes
	
	// Define main method
	public static void main(String[] args) {
		
		// Declare variables
		double subTotal = 0; // User input for the price of the purchase
		double stateTax = 0; // Amount of state tax being added to bill
		double countyTax = 0; // Amount of county tax being added to bill
		double total = 0; // Total cost of bill after taxes have been added
		
		// Create Scanner object for user input
		Scanner userInput = new Scanner(System.in);
		
		// Have user input the cost of their purchase
		System.out.print("How much was your purchase? ");
		subTotal = userInput.nextDouble();
		
		// Close Scanner object
		userInput.close();
		
		// Calculate the taxes
		stateTax = subTotal * STATE_TAX;
		countyTax = subTotal * COUNTY_TAX;
		
		// Calculate the total
		total = subTotal + stateTax + countyTax;
		
		// Output the data
		System.out.println("\nSUBTOTAL:\t$" + subTotal);
		System.out.println("STATE TAX:\t$" + String.format("%.2f", stateTax));
		System.out.println("COUNTY TAX:\t$" + String.format("%.2f", countyTax));
		System.out.println("TOTAL:\t\t$" + String.format("%.2f", total));
		
	}

}
