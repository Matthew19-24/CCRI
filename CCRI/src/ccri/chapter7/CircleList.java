/**
 * TODO Add description
 */

package ccri.chapter7;

import java.util.ArrayList;
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
	 * The setCircleList creates the array of circles with a length of this.maxCircles.
	 * Each Circle added to the array will have a random size between 1-100.
	 */
	private void setCircleList()
	{
		this.circleList = new Circle[this.maxCircles];
		
		for (int i = 0; i < this.maxCircles; i++)
		{
			this.circleList[i] = new Circle(this.random.nextDouble(100 + 1));
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
		
		// Use Selection Sort to organize list in ascending order
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
		}
		
	} // End setSortedCircleList method.
	
	
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
		
		// TODO Create arrayList
		
		// Create sorted traditional array
		this.setSortedCircleList();
		
		// TODO Create sorted arrayList
		
	} // End CircleList constructor

	public void test() {
		System.out.println("Circle Radius List: ");
		
		for (int i = 0; i < this.circleList.length; i++)
		{
			System.out.println(this.circleList[i].getRadius());
		}
		
		System.out.println("\n\nSorted Circle Radius List: ");
		for (int i = 0; i < this.sortedCircleList.length; i++)
		{
			System.out.println(this.sortedCircleList[i].getRadius());
		}
	}
	
} // End CircleList class.
