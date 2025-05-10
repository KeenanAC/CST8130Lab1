import java.util.InputMismatchException;
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
 * Driver class, contains main method
 */
public class Lab1 {


	/**
	 * Method to display the main menu
	 */
	public static void displayMenu(){
		System.out.print(
				"Please select one of the following:\n" +
				"1: Initialize a default array\n" +
				"2: Specify the max size of the array\n" +
				"3: Add value to the array\n" +
				"4: Display values in the array\n" +
				"5: Display average of the values, minimum value, maximum value, max mod min, factorial Max\n" +
				"6: To Exit\n");
	}

	/**
	 * Main program logic
	 * @param args Command line arguments - not used here
	 */
	public static void main(String[] args) {

		// Initialize Numbers object to null
		Numbers numbers = null;
		// Initialize scanner for user input
		Scanner input = new Scanner(System.in);
		// Variable to store user selection
		int choice;

		// Main menu loop
		do {
			try {
				//Call method to display menu
				displayMenu();
				//Prompt user for input
				System.out.print("Enter your choice: ");
				// Store user input in variable choice
				choice = input.nextInt();
				// Clear line
				input.nextLine();

				// Begin switch / case block
				switch (choice) {
					case 1:
						// initialize default Numbers Array(4)
						numbers = new Numbers();
						break;
					case 2:
						// Initialize array of given value
						System.out.print("Enter the max size of the array: ");
						int arraySize = input.nextInt();
						input.nextLine();
						numbers = new Numbers(arraySize);
						break;
					case 3:
						// Adding a value to the array
						try{
							numbers.addValue(input);
						}catch(NullPointerException e){
							System.err.println("No array initialized! Try again.");
						}
						break;
					case 4:
						// Displaying each value in the array
						try {
							System.out.println(numbers.toString());
						}catch(NullPointerException e){
							System.err.println("No array initialized! Try again.");
						}
						break;
					case 5:
						//Displaying all calculations for the values in the Numbers array.
						try {
							numbers.findMinMax();
						}catch(NullPointerException e) {
							System.err.println("No array initialized! Try again.");
						}
						break;
					case 6:
						// Exit option
						System.out.print("Exiting...");
						System.exit(0);
						break;
					default:
						// Default option if anything other than 1-6 is given.
						System.out.println("Invalid choice try again!");
						break;
				}
				// Exception catch for invalid entry - i.e. char instead of int
			} catch (InputMismatchException e) {
				// Prompts user to enter again with expected input
				System.err.println("Invalid entry try again (1-6)!");
				// Clear input
				input.nextLine();
				// Reset choice to 0
				choice = 0;
			}
			// While condition - while choice does not equal 6 the loop will continue
		}while (choice != 6) ;
		// Close scanner
		input.close();
	}



}
