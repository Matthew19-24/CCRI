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
			this.circleList[i] = new Circle(this.random.nextDouble(101));
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
			this.circleArray.add(new Circle(this.random.nextDouble(101)));
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
	 * @return Minimum radius as a decimal.
	 */
	private double getMin(Circle[] circles)
	{
		double min = circles[0].getRadius();
		
		for (int i = 1; i < circles.length; i++)
		{
			if (circles[i].getRadius() < min)
			{
				min = circles[i].getRadius();
			}
		} //TODO Finish switching decimal places.
		
		return min;
	} // End getMin method.
	
	
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
