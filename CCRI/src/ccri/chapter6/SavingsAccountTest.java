package ccri.chapter6;

/**
 * This program will test the SavingsAccount class.
 */

import javax.swing.JOptionPane;

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date</b>: 2022 04-07
 * @author <br> <b>Assignment</b>: Chapter 6, Problem 12 (6.12)
 */
public class SavingsAccountTest {

	/**
	 * The main method will test the SavingsAccount class.
	 * It will keep a running total of deposits, withdrawals and interest earned.
	 * It will ask the user to set an interest rate.
	 * It will then have the user enter how many months have passed since the account was opened.
	 * For each month, it will loop and have the user enter how much was deposited and withdrawn that month.
	 * Calculating the amount of interest earned each month.
	 * It will then display the data.
	 * @param args Arguments passed by the command line.
	 */
	public static void main(String[] args) {
		// Declare variables
		double startingBalance = 0; // Accounts starting balance, user input.
		int months = 0; // Amount of months passed, user input.
		double userInput = 0; // Used for deposits and withdrawals.
		
		// Ask for starting balance
		startingBalance = Double.parseDouble(JOptionPane.showInputDialog("Enter starting balance"));
		
		// Create SavingsAccount object.
		SavingsAccount account = new SavingsAccount(startingBalance);
		
		// Set interest rate.
		account.setInterest();
		
		// Ask user how many months have passed.
		months = Integer.parseInt(JOptionPane.showInputDialog("How many months have passed since opening account?"));
		
		// Validate amount of months is above 0
		while (months < 1)
		{
			months = Integer.parseInt(JOptionPane.showInputDialog("Enter a valid amount of months."));
		}
		
		// Loop for amount of months
		for (int i = 0; i < months; i++)
		{
			// Deposit money
			userInput = Double.parseDouble(JOptionPane.showInputDialog("How much money was deposited during month " + (i + 1)));
			account.deposit(userInput);
							
			// Withdrawals
			userInput = Double.parseDouble(JOptionPane.showInputDialog("How much money was withdrawn during month " + (i + 1)));
			account.withdraw(userInput);
					
			// Calculate gained interest
			account.monthlyCharge();
		}
		
		// Display data
		account.displayData();
		
	} // End main method.
	
	
} // End class.
