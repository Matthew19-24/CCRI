package ccri.chapter3;
import javax.swing.JOptionPane;

/**
 * The program will take the amount of checks written as user input
 * It will then display the total charges from the bank after the services fee's are added
 */

/**
 * @author Matthew McCaughey
 * @date 2022 02-28
 * @Assignment Chapter 3, Problem 15 (3.15)
 *
 */
public class BankCharges {

	/**
	 * The main method will take user input as the amount of checks written in the month
	 * It will add the base charge of $10
	 * And add any service fees to the total
	 * $.10 each for less than 20 checks
	 * $.08 each for 20-39 checks
	 * $.06 each for 40-59 checks
	 * $.04 each for 60 or more checks
	 * @param args
	 */
	
	public static void main(String[] args) {

		// Declare variables
		int checks_written = 0;
		double total = 10; // Total starts at 10 for base fee of $10
		
		// Ask user how many checks were written
		checks_written = Integer.parseInt(JOptionPane.showInputDialog("How many checks were written this month?"));
		
		// Use if statement to determine the service charge
		
		// 20 or less checks written is $0.10 per check
		if (checks_written >= 0 && checks_written < 20)
			total += checks_written * .10;
		
		// 20-39 checks is $0.08 per check
		else if (checks_written >= 20 && checks_written < 40)
			total += checks_written * .08;
		
		// 40-59 checks is $0.06
		else if (checks_written >= 40 && checks_written < 59)
			total += checks_written * .06;
		
		// Anything above 60 is $0.04
		else if (checks_written >= 60)
			total += checks_written * .04;
		
		// Error for any negative number or 0
		else
			JOptionPane.showMessageDialog(null, "You cannot write a negative amount of checks!");
		
		//Output data
		JOptionPane.showMessageDialog(null, "Total Monthly Charge: $" + String.format("%.2f", total));
		

	}

}
