package cse360assign3;

/**
 * Exposes methods to perform simple arithmetic on values.
 */
public class Calculator {
	/**
	 * The current value of the calculation.
	 */
	private int total;
	
	/**
	 * Constructs a new Calculator instance.
	 * 
	 * Each instance maintains its own internal total.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Fetches the current total of the calculation.
	 * 
	 * @return The current total
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Adds a value to the current total.
	 * 
	 * @param value Value to add
	 */
	public void add (int value) {
		
	}
	
	/**
	 * Subtracts a value from the current total.
	 * 
	 * @param value Value to subtract
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * Multiplies the current total by a value.
	 * 
	 * @param value Value to multiply by
	 */
	public void multiply (int value) {
		
	}
	
	/**
	 * Divides the current total by a value, using integer division.
	 * 
	 * Attempting to divide by 0 sets the total to 0.
	 * 
	 * @param value Value to divide by
	 */
	public void divide (int value) {
		
	}
	
	/**
	 * Retrieves a string detailing all operations performed on this calculator.
	 * 
	 * @return History string in the order arithmetic was run, earliest first.
	 */
	public String getHistory () {
		return "";
	}
}