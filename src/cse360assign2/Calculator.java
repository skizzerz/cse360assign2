// Ryan Schmidt - 544
// Assignment 2
// Provides a simplistic calculator

package cse360assign2;

/**
 * Exposes methods to perform simple arithmetic on values.
 */
public class Calculator {
	/**
	 * The current value of the calculation.
	 */
	private int total;
	
	/**
	 * The running history of all operations on this calculator.
	 */
	private String history;

	/**
	 * Constructs a new Calculator instance.
	 * 
	 * Each instance maintains its own internal total.
	 */
	public Calculator () {
		total = 0;
		history = "0";
	}
	
	/**
	 * Fetches the current total of the calculation.
	 * 
	 * @return The current total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds a value to the current total.
	 * 
	 * @param value Value to add
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	/**
	 * Subtracts a value from the current total.
	 * 
	 * @param value Value to subtract
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * Multiplies the current total by a value.
	 * 
	 * @param value Value to multiply by
	 */
	public void multiply (int value) {
		total *= value;
		history += " * " + value;
	}
	
	/**
	 * Divides the current total by a value, using integer division.
	 * 
	 * Attempting to divide by 0 sets the total to 0.
	 * 
	 * @param value Value to divide by
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
		} else {
			total /= value;
		}

		history += " / " + value;
	}
	
	/**
	 * Retrieves a string detailing all operations performed on this calculator.
	 * 
	 * @return History string in the order arithmetic was run, earliest first.
	 */
	public String getHistory () {
		return history;
	}
}
