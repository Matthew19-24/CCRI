package ccri.chapter3;
import javax.swing.JOptionPane;

/**
 * This program will display the Roman Numeral of a number entered in the range of 1-10
 */

/**
 * @author Matthew McCaughey
 * @date 2022 02-23
 * @Assignment Chapter 3, Problem 1 (3.1)
 *
 */
public class RomanNumerals {

	/**
	 * The main method will take user input, a whole number between 1 and 10
	 * It will then convert the number into it's Roman Numeral and output it for the user
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare variables
		StringBuilder roman = new StringBuilder("The Roman Numeral of "); // Holds the converted Roman Numeral output
		String number = null; // Holds the user entered number (1-10)
		
		// Ask for input
		number = JOptionPane.showInputDialog("Enter a whole number in the range of 1-10");
		
		// Determine Roman Numeral with switch statement
		// Using default switch as error statement
		switch (number) {
		case "1":
			roman.append("1 is I");
			break;
		case "2":
			roman.append("2 is II");
			break;
		case "3":
			roman.append("3 is III");
			break;
		case "4":
			roman.append("4 is IV");
			break;
		case "5":
			roman.append("5 is V");
			break;
		case "6":
			roman.append("6 is VI");
			break;
		case "7":
			roman.append("7 is VII");
			break;
		case "8":
			roman.append("8 is VIII");
			break;
		case "9":
			roman.append("9 is IX");
			break;
		case "10":
			roman.append("10 is X");
			break;
		default:
			roman.setLength(0);
			roman.append("Invalid input: Please run the program again.");
		}
		
		// Output the data
		JOptionPane.showMessageDialog(null, roman);
		

	}

}
