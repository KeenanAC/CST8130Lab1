import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * CET - CS Academic Level 3
 * This class contains the dynamically allocated array and it's processing
 * Student Name: 
 * Student Number:  
 * Course: CST8130 - Data Structures
 * @author/Professor: James Mwangi PhD. 
 * 
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
						"5: Display average of the values, minimum calue, maximum value, max mod min, factorial Max\n" +
						"6: To Exit\n");
	}

	/**
	 * Main program logic
	 * @param args Command line arguments - not used here
	 */
	public static void main(String[] args) {

		// Initialize Numbers object
		Numbers numbers = new Numbers();
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
						;
						break;
					case 2:
						;
						break;
					case 3:
						;
						break;
					case 4:
						;
						break;
					case 5:
						;
						break;
					case 6:
						;
						break;
					default:
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
