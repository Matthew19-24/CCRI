/**
 * TODO Add description
 */

package ccri.chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
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
	private Circle[] circleList;
	
	
	/**
	 * The list of sorted Circle objects.
	 */
	private Circle[] sortedCircleList;
	
	
	/**
	 * The ArrayList of Circle objects.
	 */
	private ArrayList<Circle> circleArray = new ArrayList<Circle>();
	
	
	/**
	 * The ArrayList of sorted Circle objects.
	 */
	private ArrayList<Circle> sortedCircleArray = new ArrayList<Circle>();
	
	
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
	}
	
	
	/**
	 * The setCircleList creates the array of circles with a random length between 0 and this.maxCircles.
	 * Each Circle added to the array will have a random size between 1-100.
	 */
	private void setCircleList()
	{
		this.circleList = new Circle[random.nextInt(this.maxCircles + 1)];
		
		for (int i = 0; i < this.circleList.length; i++)
		{
			this.circleList[i] = new Circle(this.random.nextDouble(99) + 1);
		}
		
	} // End setCircleList()
	
	
	/**
	 * The setSortedCircleList method will copy the circleList into the sortedCircleList
	 * and set it in ascending order.
	 */
	private void setSortedCircleList()
	{
		// Set variables
		int scan = 0; // Used to scan through array
		int index = 0; // Used to hold place of the index in the array
		int minIndex = 0; // Used to hold the place of the index with the minimum value
		Circle minValue = new Circle(0); // Used to hold the value of the minimum number
		
		// Create sortedCircleList length
		this.sortedCircleList = new Circle[this.circleList.length];
		
		// Copy circleList to sortedCircleList.
		for (int i = 0; i < this.circleList.length; i++)
		{
			this.sortedCircleList[i] = this.circleList[i];
		}
		
		// Use selection sorting to organize list in ascending order
		for (scan = 0; scan < (this.sortedCircleList.length-1); scan++)
		{
			minIndex = scan;
			minValue = this.sortedCircleList[scan];
			
			for (index = scan + 1; index < this.sortedCircleList.length; index++)
			{
				if (this.sortedCircleList[index].getRadius() < minValue.getRadius())
				{
					minValue = this.sortedCircleList[index];
					minIndex = index;
				}
			}
			this.sortedCircleList[minIndex] = this.sortedCircleList[scan];
			this.sortedCircleList[scan] = minValue;
		} // End selection sorting
		
	} // End setSortedCircleList method.
	
	
	/**
	 * The setCircleArray creates the arrayList object list of circles, with a random length between 0 and the this.maxCircles.
	 * It then creates a Circle object for each index, with a random radius between 1 and 100.
	 */
	private void setCircleArray()
	{
		int size = this.random.nextInt(this.maxCircles + 1);
		
		for (int i = 0; i < size; i++)
		{
			this.circleArray.add(new Circle(this.random.nextDouble(99) + 1));
		}
	} // End setCircleArray method.
	
	
	/**
	 * The setSortedCircleArray method will copy the circleArray list to the sortedCircleArray list.
	 * It will then sort it in ascending order.
	 */
	private void setSortedCircleArray()
	{
		// Copy circleArray to sortedCircleArray
		for (int i = 0; i < this.circleArray.size(); i++)
		{
			this.sortedCircleArray.add(this.circleArray.get(i));
		}
		
		// Sort sortedArrayList
		for (int i = 0; i < this.sortedCircleArray.size(); i++)
		{
			for (int index = 0; index < this.sortedCircleArray.size(); index++)
			{
				if (this.sortedCircleArray.get(index).getRadius() > this.sortedCircleArray.get(i).getRadius())
				{
					Collections.swap(this.sortedCircleArray, i, index);
				}
			}
		}
		
	} // End setSortedCircleArray method.
	
	
	/**
	 * The getMin method will get the minimum radius in a traditional Circle array as a percentage decimal.
	 * @param circles A Circle array.
	 * @return Minimum radius as a percentage decimal.
	 */
	private double getMin(Circle[] circles)
	{
		double min = 101;
		
		for (int i = 0; i < circles.length; i++)
		{
			if (circles[i].getRadius() < min)
			{
				min = circles[i].getRadius();
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
	 * The getMin method will get the minimum radius in a Circle ArrayList as a percentage decimal.
	 * @param circles A Circle Array List.
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
	 * The getMax method will get the maximum radius in a traditional Circle array as a percentage decimal.
	 * @param circles A Circle Array.
	 * @return Maximum radius as a percentage decimal.
	 */
	private double getMax(Circle[] circles)
	{
		double max = 0;
		
		for (int i = 0; i < circles.length; i++)
		{
			if (circles[i].getRadius() > max)
			{
				max = circles[i].getRadius();
			}
		}
		
		return max;
		
	} // End getMax method.
	
	
	/**
	 * The getMax method will get the maximum radius in a Circle ArrayList as a percentage decimal.
	 * @param circles A Circle Array List.
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
	 * The getAverage method will calculate the average radius in a traditional Circle array as a percentage decimal.
	 * @param circles A Circle array.
	 * @return The average radius of the array as a percentage decimal.
	 */
	private double getAverage(Circle[] circles)
	{
		double total = 0;
		double average = 0;
		
		for (int i = 0; i < circles.length; i++)
		{
			total += circles[i].getRadius();
		}
		
		average = total / circles.length;
		
		return average;
	} // End getAverage method.
	
	
	/**
	 * The getAverage method will calculate the average radius in a Circle ArrayList as a percentage decimal.
	 * @param circles A Circle ArrayList.
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
	 * Gets metrics (max, min, average) for a traditional Circle array.
	 * @param circles An array of Circle.
	 * @return An array of java.lang.Doubles, which are the max, min and average.
	 */
	private Double[] metrics(Circle[] circles)
	{
		Double[] metrics = new Double[3];
		
		metrics[0] = this.getMax(circles);
		metrics[1] = this.getMin(circles);
		metrics[2] = this.getAverage(circles);
		
		return metrics;
	} // End metrics method.
	
	/**
	 * Gets metrics (max, min, average) for a Circle ArrayList
	 * @param circles An ArrayList of Circle
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
	 * Compare the two traditional array Circles based on their position in the list.
	 * Each circle is compared positionally and totals are counted for the number that are less,
	 * the same, more or cannot be compared.
	 * @param listLess The list of circles. The number of items in this list is <= the number of items in listMore.
	 * @param listMore The list of circles. The number of items in this list is >= the number of items in listLess.
	 * @return An ArrayList of java.lang.Double, which are less, equal, more or cannot be compared.
	 */
	private ArrayList<Double> compareLists(Circle[] listLess, Circle[] listMore)
	{
		// Set variables
		double less = 0;
		double equal = 0;
		double more = 0;
		double none = 0;
		
		// Compare lists.
		for (int i = 0; i < listLess.length; i++)
		{
			if (listLess[i].getRadius() < listMore[i].getRadius())
			{
				less += 1;
			}
			else if (listLess[i].getRadius() == listMore[i].getRadius())
			{
				equal += 1;
			}
			else if (listLess[i].getRadius() > listMore[i].getRadius())
			{
				more += 1;
			}
		}
		none = listMore.length - listLess.length;
		
		// Create ArrayList object.
		ArrayList<Double> compare = new ArrayList<Double>();
		
		// Add metrics to ArrayList.
		compare.add(less);
		compare.add(equal);
		compare.add(more);
		compare.add(none);
		
		return compare;
		
	} // End compareLists method.
	
	
	// TODO Add traditional to ArrayList
	private ArrayList<Double> compareLists(Circle[] listLess, ArrayList<Circle> listMore)
	{
		
	}
	
	// TODO Add ArrayList to traditional
	
	// TODO Add ArrayList to ArrayList
	
	
	/**
	 * Constructor
	 * @param max Maximum number of circles to create the lists.
	 */
	public CircleList(int max)
	{
		// Set maximum circles field
		this.setMaxCircles(max);
		
		// Create traditional array
		this.setCircleList();
		
		// Create arrayList
		this.setCircleArray();
		
		// Create sorted traditional array
		this.setSortedCircleList();
		
		// Create sorted arrayList
		this.setSortedCircleArray();
		
	} // End CircleList constructor
	
} // End CircleList class.
