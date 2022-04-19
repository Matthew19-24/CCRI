package ccri.chapter3;
import javax.swing.JOptionPane;

/**
 * This program will take a user input of how much a package weighs
 * And it will output the shipping charge per 500 miles
 */

/**
 * @author Matthew McCaughey
 * @date 2022 02-26
 * @Assignment Chapter 3, Problem 9 (3.9)
 *
 */
public class ShippingCharges {

	/**
	 * The main method takes the users input for how much the package weights in pounds
	 * It then uses the if statement to decide how much the shipping charge is
	 * If it is 2 pounds or lower, the charge is $1.10 per 500 miles
	 * If it is higher than 2 pounds and 6 or lower, the charge is $2.20 per 500 miles
	 * If it is higher than 6 pounds and 10 or lower, the charge is $3.70 per 500 miles
	 * If it is higher than 10, the charge is $3.80 per 500 miles
	 * @param args
	 */
	public static void main(String[] args) {

		// Declare variables
		double shipping_charge = 0;
		double weight = 0;
		
		// Ask user for weight of the package
		weight = Double.parseDouble(JOptionPane.showInputDialog("How much does the package weigh in pounds?"));
		
		// Calculate the shipping charge
		if (weight <= 2)
			shipping_charge = 1.1;
		
		else if (weight > 2 && weight <=6)
			shipping_charge = 2.2;
		
		else if (weight > 6 && weight <= 10)
			shipping_charge = 3.7;
		
		else
			shipping_charge = 3.8;
		
		// Output the data
		JOptionPane.showMessageDialog(null, "Shipping Cost: $" + String.format("%.2f", shipping_charge) + " per 500 miles");

	}

}
