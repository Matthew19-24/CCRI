package ccri.chapter3;
import javax.swing.JOptionPane;

/**
 * This program troubleshoots a bad Wi-Fi connection
 */

/**
 * @author Matthew McCaughey
 * @date 2022 02-28
 * @Assignment Chapter 3, Problem 17 (3.17)
 *
 */
public class WiFiDiagnosticTree {

	/**
	 * This program will walk through a user through troubleshooting a bad Wi-Fi connection
	 * It will use the if statement to follow the steps
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare variable
		char answer = 0;
		
		// Ask if resetting the computer fixed the problem
		answer = JOptionPane.showInputDialog("Reboot the computer and try to connect." +
											"\nDid that fix the problem?").toLowerCase().charAt(0);
		
		// Troubleshoot with nested If statements
		if (answer == 'n')
		{
			
			answer = JOptionPane.showInputDialog("Reboot the router and try to connect." +
					"\nDid that fix the problem?").toLowerCase().charAt(0);
		
			if(answer == 'n')
			{
				
				answer = JOptionPane.showInputDialog("Make sure the cables between the router & modem are plugged in firmly." +
						"\nDid that fix the problem?").toLowerCase().charAt(0);
				
				if(answer == 'n')
				{
					answer = JOptionPane.showInputDialog("Move the router to a new location and try to connect." +
							"\nDid that fix the problem?").toLowerCase().charAt(0);
					
					
					if(answer == 'n')
					{
						JOptionPane.showMessageDialog(null, "Get a new router.");
						}
					}
				}
			}
			
		// Output a closing message
		JOptionPane.showMessageDialog(null, "Thank you for using our troubleshoot.\nHave a nice day.");
	}

}
