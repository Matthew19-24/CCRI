package ccri.chapter6;

/**
 * The EmployeeTest class is a test class for the Employee POJO
 */

import javax.swing.JOptionPane;

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date</b>: 2022 04-04
 * @author <br> <b>Assignment</b>: Chapter 6, Problem 1 (6.1)
 */
public class EmployeeTest {

	/**
	 * The main method will create 3 Employee objects and store data within them.
	 * @param args Arguments passed by the command line.
	 */
	public static void main(String[] args) {
		// Create Employee object for Susan Meyers
		Employee susan = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
		
		// Create Employee object for Mark Jones
		Employee mark = new Employee("Mark Jones", 39119, "IT", "Programmer");
		
		// Create Employee object for Joy Rogers
		Employee joy = new Employee("Joy Rogers", 81774, "Manufacturing", "Enineer");
		
		// Display data
		JOptionPane.showMessageDialog(null, susan.displayData() +
											mark.displayData() +
											joy.displayData()
											);
	} // End main method.
	
} // End class.
