package ccri.chapter6;

/**
 * This object represents a single die.
 *
 */

import java.util.Random;

/**
 * This object represents a single die. The die can have any number (>0) sides. Every time the die is "rolled" a new
 * value will be assigned.
 * 
 * @author dean grammas (refactroed from "Starting out with Java - Gaddis, Muganda")
 */
public class Die
{
    /**
     * the number of sides.
     */
    private int sides;

    /**
     * The die's value.
     */
    private int value;

    /**
     * Random object
     */
    Random rand;

    /**
     * Set to true multiple rolls are allowed. Set to false, only one roll is allowed when constructed.
     * Note set to true, because the default is false
     */
    private boolean allowMultiRoll = true;

    /**
     * Returns true if multi rolls are allowed, false if they are not
     * 
     * @return the allowMultiRoll
     */
    public boolean isAllowMultiRoll()
    {
	return allowMultiRoll;
    }

    /**
     * Sets multi roll.
     * 
     * @param allowMultiRoll set to true if multi rolls are allowed, false if they are not
     */
    private void setAllowMultiRoll(boolean allowMultiRoll)
    {
	this.allowMultiRoll = allowMultiRoll;
    }

    /**
     * The constructor performs an initial roll of the die.
     * 
     * @param numSides The number of sides for this die.
     */
    public Die(int numSides)
    {
	this(numSides, true);
    } // end Die

    /**
     * The constructor performs an initial roll of the die.
     * 
     * @param numSides       The number of sides for this die.
     * @param allowMultiRoll - Set to true multiple rolls are allowed. Set to false, only one roll is allowed when
     *                       constructed.
     */
    public Die(int numSides, boolean allowMultiRoll)
    {
	this.setSides(numSides);

	// create the random object
	rand = new Random();

	// roll the dice
	roll();

	// set after the roll, otherwise the roll will never happen!
	this.setAllowMultiRoll(allowMultiRoll);
    } // end Die

    /**
     * Gets the number of sides for this die.
     * 
     * @return The number of sides for this die.
     */

    public int getSides()
    {
	return this.sides;
    } // end getSides

    /**
     * Gets the value of the die.
     * 
     * @return The value of the die.
     */

    public int getValue()
    {
	return this.value;
    } // end getValue

    /**
     * Sets the number of sides for this die.
     * 
     * @param sides The number of sides.
     */
    private void setSides(int sides)
    {
	this.sides = sides;
    } // end setSides

    /**
     * Sets the die's value.
     * 
     * @param value The value of the die.
     */
    private void setValue(int value)
    {
	this.value = value;
    } // end setValue

    /**
     * The roll method simlates the rolling of the die.
     */
    public void roll()
    {
	if (this.isAllowMultiRoll())
	{
	    // Get a random value for the die.
	    int nextValue = rand.nextInt(this.getSides()) + 1;
	    this.setValue(nextValue);
	}
    } // end roll

    /**
     * Returns an unserialized representation of this object as a <code>java.lang.String</code>.
     * 
     * @return The unserilized representation of this object as a <code>java.lang.String</code>.
     */
    public String toString()
    {
	StringBuilder sb = new StringBuilder();

	sb.append(this.getClass());
	sb.append(" this.getSides()=").append(this.getSides());
	sb.append(" this.getValue()=").append(this.getValue());

	return sb.toString();
    } // end toString
} // end class
