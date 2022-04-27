/**
 * Circle Array POJO for www.ShapeArray.com.
 * Creates traditional arrays and java.util.ArrayList's of Circle objects
 * It creates sorted versions of these lists.
 * Generating metrics for max, min, and average radius's in each list.
 * Also comparing each list to one another.
 */

package ccri.chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Circle Array POJO for www.ShapeArray.com.
 * Creates traditional arrays and java.util.ArrayList's of Circle objects
 * It creates sorted versions of these lists.
 * Generating metrics for max, min, and average radius's in each list.
 * Also comparing each list to one another.
 * 
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date</b>: 2022 04-19
 * @author <br> <b>Assignment</b>: Lesson 6 Programming Assignment
 */
public class CircleList 
{
	/**
	 * The maximum number of circles for the list.
	 */
	private int maxCircles;
	
	/**
	 * The list of Circle objects.
	 */
	private Circle[] circleArray;
	
	/**
	 * The list of sorted Circle objects.
	 */
	private Circle[] sortedCircleArray;
	
	/**
	 * The ArrayList of Circle objects.
	 */
	private ArrayList<Circle> circleArrayList = new ArrayList<Circle>();
	
	/**
	 * The ArrayList of sorted Circle objects.
	 */
	private ArrayList<Circle> sortedCircleArrayList = new ArrayList<Circle>();
	
	/**
	 * Random object.
	 */
	private Random random = new Random();
	
	/**
	 * The setMaxCircles method sets the value in the maxCircles field.
	 * @param max Maximum circles for the lists.
	 */
	private void setMaxCircles(int max)
	{
		this.maxCircles = max;
	} // End setMaxCircles
	
	/**
	 * The setCircleList creates the array of circles with a random length between 0 and this.maxCircles.
	 * Each Circle added to the array will have a random size between 1-100.
	 */
	private void setCircleArray()
	{
		this.circleArray = new Circle[random.nextInt(this.maxCircles + 1)];
		
		for (int i = 0; i < this.circleArray.length; i++)
		{
			this.circleArray[i] = new Circle(this.random.nextDouble(99) + 1);
		}
		
	} // End setCircleList()
	
	/**
	 * The setSortedCircleList method will copy the circleList into the sortedCircleList
	 * and set it in ascending order.
	 */
	private void setSortedCircleArray()
	{
		// Set variables
		int scan = 0; // Used to scan through array
		int index = 0; // Used to hold place of the index in the array
		int minIndex = 0; // Used to hold the place of the index with the minimum value
		Circle minValue = new Circle(0); // Used to hold the value of the minimum number
		
		// Create sortedCircleList length
		this.sortedCircleArray = new Circle[this.circleArray.length];
		
		// Copy circleList to sortedCircleList.
		for (int i = 0; i < this.circleArray.length; i++)
		{
			this.sortedCircleArray[i] = this.circleArray[i];
		}
		
		// Use selection sorting to organize list in ascending order
		for (scan = 0; scan < (this.sortedCircleArray.length-1); scan++)
		{
			minIndex = scan;
			minValue = this.sortedCircleArray[scan];
			
			for (index = scan + 1; index < this.sortedCircleArray.length; index++)
			{
				if (this.sortedCircleArray[index].getRadius() < minValue.getRadius())
				{
					minValue = this.sortedCircleArray[index];
					minIndex = index;
				}
			}
			this.sortedCircleArray[minIndex] = this.sortedCircleArray[scan];
			this.sortedCircleArray[scan] = minValue;
		} // End selection sorting
		
	} // End setSortedCircleList method.
	
	/**
	 * The setCircleArray creates the arrayList object list of circles, with a random length between 0 and the this.maxCircles.
	 * It then creates a Circle object for each index, with a random radius between 1 and 100.
	 */
	private void setCircleArrayList()
	{
		int size = this.random.nextInt(this.maxCircles + 1);
		
		for (int i = 0; i < size; i++)
		{
			this.circleArrayList.add(new Circle(this.random.nextDouble(99) + 1));
		}
	} // End setCircleArray method.
	
	/**
	 * The setSortedCircleArray method will copy the circleArray list to the sortedCircleArray list.
	 * It will then sort it in ascending order.
	 */
	private void setSortedCircleArrayList()
	{
		// Copy circleArrayList to sortedCircleArrayList
		for (int i = 0; i < this.circleArrayList.size(); i++)
		{
			this.sortedCircleArrayList.add(this.circleArrayList.get(i));
		}
		
		// Sort sortedCircleArrayList
		for (int i = 0; i < this.sortedCircleArrayList.size(); i++)
		{
			for (int index = 0; index < this.sortedCircleArrayList.size(); index++)
			{
				if (this.sortedCircleArrayList.get(index).getRadius() > this.sortedCircleArrayList.get(i).getRadius())
				{
					Collections.swap(this.sortedCircleArrayList, i, index);
				}
			}
		}
		
	} // End setSortedCircleArray method.
	
	/**
	 * The getMin method will get the minimum radius in a list of Circle objects as a percentage decimal.
	 * @param circles A list of Circle objects.
	 * @return Minimum radius as a percentage decimal.
	 */
	private double getMin(ArrayList<Circle> circles)
	{
		double min = 101;
		
		for (int i = 0; i < circles.size(); i++)
		{
			if (circles.get(i).getRadius() < min)
			{
				min = circles.get(i).getRadius();
			}
		}
		
		// Return 0 if no minimum was found
		if (min == 101)
		{
			return 0;
		}
		
		return min;
		
	} // End getMin method.
	
	/**
	 * The getMax method will get the maximum radius in a a list of Circle objects as a percentage decimal.
	 * @param circles A list of Circle objects.
	 * @return Maximum radius as a percentage decimal.
	 */
	private double getMax(ArrayList<Circle> circles)
	{
		double max = 0;
		
		for (int i = 0; i < circles.size(); i++)
		{
			if (circles.get(i).getRadius() > max)
			{
				max = circles.get(i).getRadius();
			}
		}
		
		return max;
	} // End getMax method.
	
	/**
	 * The getAverage method will calculate the average radius in a list of Circle objects as a percentage decimal.
	 * @param circles A list of Circle objects.
	 * @return The average radius of the array as a percentage decimal.
	 */
	private double getAverage(ArrayList<Circle> circles)
	{
		double total = 0;
		double average = 0;
		
		for (int i = 0; i < circles.size(); i++)
		{
			total += circles.get(i).getRadius();
		}
		
		average = total / circles.size();
		
		return average;
		
	} // End getAverage method.
	
	/**
	 * Gets metrics (max, min, average) for a list of Circle objects.
	 * @param circles A list of Circle objects.
	 * @return An ArrayList of java.lang.Doubles, which are the max, min and average.
	 */
	private ArrayList<Double> metrics(ArrayList<Circle> circles)
	{
		ArrayList<Double> metrics = new ArrayList<Double>();
		
		metrics.add(this.getMax(circles));
		metrics.add(this.getMin(circles));
		metrics.add(this.getAverage(circles));
		
		return metrics;
	} // End metrics method.
		
	/**
	 * The getMetrics method returns the max, min and average of the traditional Circle array.
	 * @return An array of java.lang.Double which are max, min and average.
	 */
	public ArrayList<Double> getTraditionalMetrics()
	{
		return this.metrics(converter(this.circleArray));
	} // End getTraditionalMetrics.
	
	/**
	 * The getMetrics method returns the max, min and average of the Circle ArrayList
	 * @return An array of java.lang.Double which are max, min and average.
	 */
	public ArrayList<Double> getArrayListMetrics()
	{
		return this.metrics(this.circleArrayList);
	} // End getArrayListMetrics.
	
	/**
	 * Compare two ArrayLists Circles based on their position in the list.
	 * Each circle is compared positionally and totals are counted for the number that are less,
	 * the same, more or cannot be compared.
	 * @param listLess The list of circles. The number of items in this list is <= the number of items in listMore.
	 * @param listMore The list of circles. The number of items in this list is >= the number of items in listLess.
	 * @return An ArrayList of java.lang.Double, which are less, equal, more or cannot be compared.
	 */
	private ArrayList<Double> compareLists(ArrayList<Circle> listLess, ArrayList<Circle> listMore)
	{
		// Set variables
		double less = 0;
		double equal = 0;
		double more = 0;
		double none = 0;
				
		for (int i = 0; i < listLess.size(); i++)
		{
			if (listLess.get(i).getRadius() < listMore.get(i).getRadius())
			{
				less +=1;
			}
			else if (listLess.get(i).getRadius() == listMore.get(i).getRadius())
			{
				equal += 1;
			}
			else if (listLess.get(i).getRadius() > listMore.get(i).getRadius())
			{
				more += 1;
			}	
		}
		
			none = listMore.size() - listLess.size();
		
			// Create ArrayList object.
			ArrayList<Double> compare = new ArrayList<Double>();
			
			// Add metrics to ArrayList.
			compare.add(less / listMore.size());
			compare.add(equal / listMore.size());
			compare.add(more / listMore.size());
			compare.add(none / listMore.size());
			
			return compare;
			
	} // End compareLists method.
	
	/**
	 * The getComparisons method returns the comparison metrics for each list.
	 * @return An ArrayList of ArrayLists. 
	 * Index[0] - Traditional array to sorted traditional array metrics.
	 * Index[1] - ArrayList to sorted ArrayList metrics.
	 * Index[2] - Traditional array to ArrayList.
	 * Index[3] - Sorted traditional array to sorted ArrayList.
	 */
	public ArrayList<ArrayList<Double>> getComparisons()
	{
		// Create ArrayList
		ArrayList<ArrayList<Double>> comparisons = new ArrayList<ArrayList<Double>>();
		
		// Compare traditional array to sorted traditional array
		comparisons.add(this.compare(this.converter(this.circleArray), this.converter(this.sortedCircleArray)));
		
		// Compare ArrayList to sorted ArrayList
		comparisons.add(this.compare(this.circleArrayList, this.sortedCircleArrayList));
		
		// Compare traditional array to ArrayList
		comparisons.add(this.compare(this.converter(this.circleArray), this.circleArrayList));
		
		// Compare sorted traditional array to sorted ArrayList
		comparisons.add(this.compare(this.converter(this.sortedCircleArray), this.sortedCircleArrayList));
		
		return comparisons;
		
	} // End getComparisons method.
	
	/**
	 * The compare method returns the comparison metrics for each list.
	 * @return An ArrayList of the comparison metrics 
	 */
	private ArrayList<Double> compare(ArrayList<Circle> list1, ArrayList<Circle> list2)
	{	
		// Compare arrays
		if(list1.size() < list2.size())
		{
			return this.compareLists(list1, list2);
		}
		else
		{
			return this.compareLists(list2, list1);
		}
		
	} // End getComparisons method.
	
	/**
	 * The converter method copies a traditional array into a java.util.ArrayList
	 * @param traditional The traditional array.
	 * @return The java.util.Array list of the old traditional array.
	 */
	private ArrayList<Circle> converter(Circle[] traditional)
	{
		ArrayList<Circle> arrayList= new ArrayList<Circle>();
		
		for (int i = 0; i < traditional.length; i++)
		{
			arrayList.add(traditional[i]);
		}
		
		return arrayList;
	} // End converter method.
	
	/**
	 * Constructor
	 * @param max Maximum number of circles to create the lists.
	 */
	public CircleList(int max)
	{
		// Set maximum circles field
		this.setMaxCircles(max);
		
		// Create traditional array
		this.setCircleArray();
		
		// Create arrayList
		this.setCircleArrayList();
		
		// Create sorted traditional array
		this.setSortedCircleArray();
		
		// Create sorted arrayList
		this.setSortedCircleArrayList();
		
	} // End CircleList constructor
	
	/**
	 * The toString method returns String representation of object.
	 * @return The String representation of object.
	 */
	public String toString()
	{
		// Create StringBuilder object.
		StringBuilder sb = new StringBuilder();
		
		sb.append("\ntraditional max = ").append(this.getTraditionalMetrics().get(0));
		sb.append("\ntraditional min = ").append(this.getTraditionalMetrics().get(1));
		sb.append("\ntraditional avg = ").append(this.getTraditionalMetrics().get(2));
		sb.append("\nArrayList max = ").append(this.getArrayListMetrics().get(0));
		sb.append("\nArrayList min = ").append(this.getArrayListMetrics().get(1));
		sb.append("\nArrayList avg = ").append(this.getArrayListMetrics().get(2));
		
		for (int i = 0; i < 4; i++)
		{
			sb.append("\n\nmetrics for lists " + i);
			sb.append(" LESS = ").append(this.getComparisons().get(i).get(0));
			sb.append(" EQUAL = ").append(this.getComparisons().get(i).get(1));
			sb.append(" MORE = ").append(this.getComparisons().get(i).get(2));
			sb.append(" NONE = ").append(this.getComparisons().get(i).get(3));
		}
		
		return sb.toString();
	} // End toString method.
	
} // End CircleList class.
