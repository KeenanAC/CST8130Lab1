import java.util.Scanner;

/**
 * CET - CS Academic Level 3
 * Declaration: I declare that this is my own original work and is free from Plagiarism
 * This class contains the dynamically allocated array, and it's processing
 * Student Name: Keenan Bewley
 * Student Number:  041160935
 * Section Number: 302
 * Course: CST8130 - Data Structures
 * Professor: James Mwangi PhD.
 *
 */

/**
 * Business class for Lab 1
 */
public class Numbers {

	//Stores Float values.
	private final Float [] numbers;
	//Store the number of items currently in the array.
	private int numItems;
	//Store the size of the array
	private int arraySize;

	/**
	 * Default Constructor <p>
	 * Sets Numbers array to a default size of 4
	 */
	public Numbers() {
		this(4);
	}

	/**
	 * Constructor that initializes the numbers array.
	 * @param arraySize - Max size of the numbers array
	 */
	public Numbers(int arraySize) {
		numbers = new Float[arraySize];
		numItems = 0;

		// Debug test
		//System.out.println("Debug test. Array length: "+ numbers.length);
	}
	
	/**
	 * Adds a value in the array
	 * @param input - Scanner object to use for input
	 */
	public void addValue(Scanner input) {
		// Check for space in the array
		if (numItems >= numbers.length) {
			System.out.println("Array is full!");
		}else {
			/* Prompt user for the desired value and add it to the array. Array position / index is determined by
			numItems variable.
			 */
			System.out.print("Enter value: ");
			numbers[numItems] = input.nextFloat();
			numItems++;
			// Item added confirmation.
			System.out.println("Item added!");
		}
	}

	/**
	 * Calculates the average of all the values in the numbers array.
	 * @return float value that represents the average
	 */
	public float calcAverage() {
		// Check if array is empty
		if (numItems == 0) {
			System.out.println("Array is empty!");
			return 0;
		} else {

			// Variable to store total value of all items in array
			float total = 0;
			// For loop to iterate over and sum all items in the array.
			for (int i = 0; i < numItems; i++) {
				total += numbers[i];
			}
			//Average calculation cast into a float
			return total / numItems;
		}
	}

	/**
	 * Method that will determine and display the max / min, max % min, in the numbers array. <p>
	 * The average / factorial is also displayed but is determined by the calcAverage and getFactorialMax methods.<p>
	 * The max value determined in this method is passed on to the getFactorialMax method as an argument.
	 */
	public void findMinMax() {
		// Check if array is empty
		if (numItems == 0) {
			System.out.println("Array is empty!");
		} else {
			// Initialize both max and min to the first value in the array
			float min = numbers[0];
			float max = numbers[0];

			// For loop to iterate through the array and set the max / min values by comparing array values to each other
			for (int i = 0; i < numItems; i++) {
				if (numbers[i] < min) {
					min = numbers[i];
				}
				if (numbers[i] > max) {
					max = numbers[i];
				}
			}

			// Modulus calculation of max / min, cast into an int
			int modValue = 0;
			try {
				modValue = (int) (max % min);
			} catch (ArithmeticException e) {
				System.err.println("Cannot divide by zero!");
			}


			// Formatted string to print out all calculated information
			System.out.printf("Average is: %.2f, Minimum value is: %.2f, Max value is: %.2f, " +
					"max mod min is: %d, Factorial of Max is: %d.\n", calcAverage(), min, max, modValue, getFactorialMax(max));
		}
	}

	/**
	 * This method will calculate the factorial of the maximum value found in a given array.
	 * @param max The max value in the array is passed as an argument from the findMinMax method.
	 * @return int value of the factorial of the maximum value found in the given array
	 */
	public int getFactorialMax(float max) {
		// Commented out repeated code - now passing max as a parameter
//		// Initialize local max variable
//		float max = numbers[0];
//        // Check if array is empty
//            System.out.println("Array is empty!");
//        } else {
//            // For loop to iterate through the array and set the max / min values by comparing array values to each other
//            for (int i = 0; i < numItems; i++) {
//                if (numbers[i] > max) {
//                    max = numbers[i];
//                }
//            }
//        }

        // Initialize the factorial value to 1 for multiplication
        int factorialMax = 1;
        // Cast max value into an int
        int maxInt = (int) max;
        // Check if the max value is greater than 0
        if (maxInt > 0) {
            // While loop to decrement and multiply max int until it = 0
            while (maxInt > 0) {
                factorialMax *= maxInt;
                maxInt--;
            }
        } else {
            // Print method to let user know a factorial will not be calculated.
            System.out.println("Max value is negative! No factorial calculated.");
            // Set factorialMax to 0 to not confuse user
            factorialMax = 0;
        }
        return factorialMax;
    }

	@Override
	public String toString() {
		// Check if array is empty
		if (numItems == 0) {
			return "Array is empty!";
		}
		/* For loop to iterate over each number in the array and add them to a String. Items will be displayed on their
		own line.
		 */
		String nums = "Numbers are:\n";
		for (int index = 0; index < numItems; index++) {
            nums += numbers[index] + "\n";
        }
		return nums;
	}
	
}

