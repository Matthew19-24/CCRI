package ccri.chapter3;
import javax.swing.JOptionPane;

/**
 * For a phone company
 * The program will ask what monthly plan a user is subscribed to
 * It will then ask for the number of minutes used
 * And it will calculate their bill
 * 
 */

/**
 * @author Matthew McCaughey
 * @date 2022 02-28
 * @Assignment Chapter 3, Problem 13 (3.13)
 *
 */
public class MobileServiceProvider {

	/**
	 * The main method will ask the user what package they are subscribed to
	 * It will then ask how many minutes the user has used
	 * It will use the switch statement to determine the plan subscription
	 * Inside the switch statement it will calculate the bills cost
	 * @param args
	 */
	
	// PLAN A VARIABLES
	final static private double A_COST = 39.99; // 39.99 a month
	final static private int A_MINUTES = 450; // 450 minutes for free
	final static private double A_EXTRA = .45; // $0.45 a minute passed limit 
	
	// PLAN B VARIABLES
	final static private double B_COST = 59.99; // 59.99 a month
	final static private int B_MINUTES = 900; // 900 minutes for free
	final static private double B_EXTRA = .40; // $0.40 a minute passed limit
	
	// PLAN C VARIABLES
	final static private double C_COST = 69.99; //69.99 a month with unlimited minutes
	
	
	public static void main(String[] args) {
		
		// Declare variables
		char subscription = 0;
		int minutes = 0;
		double total = 0;
		
		// Ask user what plan they are subscribed to
		subscription =  JOptionPane.showInputDialog("What plan are you subscribed to?\n\n" + 
										 		"A: $39.99 a month and 450 minutes\n" + 
												"B: $59.99 a month and 900 minutes\n" + 
										 		"C: $69.99 a month and unlimited minutes").toLowerCase().charAt(0);
		
		// Ask user how many minutes were used
		minutes = Integer.parseInt(JOptionPane.showInputDialog("How many minutes were used this month?"));
		
		// Use switch statement to calculate bill
		switch (subscription)
		{
		
		// Plan A
		case 'a':
			
			// add monthly cost to total
			total += A_COST;
			
			// calculate how many minutes user went over
			minutes -= A_MINUTES;
			
			// calculate cost of extra minutes and add to running total
			total += minutes * A_EXTRA;
			break;
			
		// Plan B
		case 'b':
			
			// add monthly cost to total
			total += B_COST;
			
			// calculate how many minutes user went over
			minutes -= B_MINUTES;
			
			// calculate cost of extra minutes and add to running total
			total += minutes * B_EXTRA;
			break;
			
		// Plan C
		case 'c':
			
			// total is monthly cost, unlimited minutes
			total = C_COST;
			break;	
		default:
			
			// Give an error message and close the program
			JOptionPane.showMessageDialog(null, "Invalid Entry: Please close the program and try again.");
			System.exit(0);
		}
			
		
		// Output the data
		JOptionPane.showMessageDialog(null, "Your monthly bill is: $" + String.format("%.2f", total));

	}

}
