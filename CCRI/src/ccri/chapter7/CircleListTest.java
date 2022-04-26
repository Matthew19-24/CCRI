/**
 * Tests the CircleList class.
 */

package ccri.chapter7;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * Tests the CircleList class.
 * 
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date</b>: 2022 04-26
 * @author <br> <b>Assignment</b>: Lesson 6 Programming Assignment
 *
 */
public class CircleListTest {
	
	/**
	 * The displayCompatisons method runs the getComparisons method for each
	 * of the 4 different array comparisons. Returning a String of the data.
	 * @param compare An ArrayList of each ArrayList of comparison data.
	 * @return String of the compared data.
	 */
	private static String displayComparisons(ArrayList<ArrayList<Double>> compare)
	{
		// Create StringBuilder object.
		StringBuilder sb = new StringBuilder();
		
		// Compare traditional to sorted traditional
		sb.append("\n\nComparing traditional array to the sorted traditional array.");
		sb.append(getComparisons(compare.get(0)));
		
		// Compare ArrayList to sorted ArrayList
		sb.append("\n\nComparing ArrayList to the sorted ArrayList.");
		sb.append(getComparisons(compare.get(1)));
		
		// Compare traditional to ArrayList
		sb.append("\n\nComparing the traditional array to the ArrayList.");
		sb.append(getComparisons(compare.get(2)));
		
		// Compare sorted traditional to sorted ArrayList
		sb.append("\n\nComparing the sorted traditional array to the sorted ArrayList.");
		sb.append(getComparisons(compare.get(3)));
		
		return sb.toString();
	}
	
	
	private static String getComparisons(ArrayList<Double> compare)
	{
		// Create StringBuilder object.
		StringBuilder sb = new StringBuilder();
		
		// Append data
		sb.append("\nLess: ").append(String.format("%.2f", compare.get(0)));
		sb.append(" Equal: ").append(String.format("%.2f", compare.get(1)));
		sb.append(" More: ").append(String.format("%.2f", compare.get(2)));
		sb.append(" None : ").append(String.format("%.2f", compare.get(3)));
		
		return sb.toString();
	}
	
	
	/**
	 * The displayMetrics method will display to the user the min, max and average of
	 * both traditional and java.util.ArrayList Circle lists.
	 * @param circles The CircleList object.
	 * @return A String of the min, max and average data for both list types.
	 */
	private static String displayMetrics(CircleList circles)
	{	
		// Create StringBuilder object
		StringBuilder sb = new StringBuilder();
		
		// Display the traditional array metrics
		sb.append("\n\nTraditional Array Metrics: \n");
		sb.append(getMetrics(circles.getTraditionalMetrics()));
		
		// Display the java.util.ArrayList metrics
		sb.append("\n\njava.util.ArrayList metrics: \n");
		sb.append(getMetrics(circles.getArrayListMetrics()));
		
		return sb.toString();
		
	} // End displayMetrics
	
	/**
	 * The getMetrics method will get the max, min and average from a CircleList and return them to a String.
	 * @param metrics Metrics from circles.getTraditionalMetrics or circles.getArrayListMetrics
	 * @return A String of the max, min and average.
	 */
	private static String getMetrics(ArrayList<Double> metrics)
	{
		// Create StringBuider object
		StringBuilder sb = new StringBuilder();
		
		// Append the array metrics
		sb.append("Max: ").append(String.format("%.2f", metrics.get(0)));
		sb.append(" Min: ").append(String.format("%.2f", metrics.get(1)));
		sb.append(" Average: ").append(String.format("%.2f", metrics.get(2)));
		
		return sb.toString();
	} // End getMetrics method.
	
	
	/**
	 * Creates String for a welcome message.
	 * @param args Name of user from run configurations.
	 * @return Welcome message.
	 */
	private static String welcomeMessage(String[] args)
	{
		// Create StringBuilder object.
		StringBuilder sb = new StringBuilder();
		
		// Enter welcome message.
		sb.append("Welcome ");
		
		// If no arguments were passed append no name.
		if (args.length == 0)
		{
			sb.append("[NO NAME]");
		}
		// If arguments were passed, pass the name.
		else
		{
			for (int i = 0; i < args.length; i++)
			{
				sb.append(args[i]).append(" ");
			}
			
		} 
		
		return sb.toString();
		
	} // End testRunConfigArgs.
	
	/**
	 * Tests the Circle List class.
	 * @param args Name of user.
	 */
	public static void main(String[] args) {
		// Create StringBuilder object.
		StringBuilder sb = new StringBuilder();
		
		// Create CircleList object.
		CircleList circles = new CircleList(6000);
		
		// Append welcome message
		sb.append(welcomeMessage(args));
		
		// Append max, min and average
		sb.append(displayMetrics(circles));
		
		// Append Comparison metrics
		sb.append(displayComparisons(circles.getComparisons()));
		
		// Display data
		JOptionPane.showMessageDialog(null, sb);
		
	} // End main method.

} // End CircleListTest class.
