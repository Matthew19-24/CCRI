package ccri.chapter4;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 * The program will ask the user to enter in their name
 * It will then ask the user to type in a description about themselves
 * It will take these two inputs, and save them to an HTML file
 * Creating a basic webpage with the information entered.
 */

/**
 * @author Matthew McCaughey
 * @date 2022 03-12
 * @Assignment Chapter 4, Problem 23 (4.23)
 *
 */
public class PersonalWebPageGenerator {

	/**
	 * The main method will use JOptionPane to display dialog
	 * It will ask the user for their name
	 * It will then ask the user for a description of themselves
	 * It will user PrintWriter to create a new writable file
	 * It will then print HTML code, with the user input inbetween
	 * Creating a basic webpage
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		// declare variables
		String name = null;
		String description = null;
		
		// ask for user's name and description for website
		name = JOptionPane.showInputDialog("Enter your name.");
		description = JOptionPane.showInputDialog("Write a description about yourself.");
		
		// create writable file
		PrintWriter website = new PrintWriter("website.html");
		
		// print website to file
		website.print("<html>\r\n<head>\r\n</head>\r\n<body>\r\n\t<center>\r\n\t\t<h1>");
		website.print(name);
		website.print("</h1>\r\n\t</center>\r\n\t<hr />\r\n\t");
		website.print(description);
		website.print("\n\t<hr />\r\n</body>\r\n</html>");
		
		// close file
		website.close();
		
		JOptionPane.showMessageDialog(null, "website.html was successfully created");
	}

}