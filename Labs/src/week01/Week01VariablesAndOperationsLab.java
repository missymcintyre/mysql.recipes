//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		System.out.println("Week 1 Lab");
	
		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int availablePlaneSeats = 5;
				
		// 2. Create a variable to hold the cost of groceries at checkout

		double costOfGrocery = 54.31;
		
		// 3. Create a variable to hold a person's middle initial

		char middleInitial = 'T';
		
		// 4. Create a variable to hold true if it's hot outside
	
				
		//		and false if it's cold outside
		boolean isHotOutside = false;

		
		// 5. Create a variable to hold a customer's first name
		
		String customersFirstName = "Sally";

		
		// 6. Create a variable to hold a street address
		String streetAddress = "1234 Main Street";
		

		// 7. Print all variables to the console
		System.out.println("Avaliable Seats Left:" + availablePlaneSeats);
		System.out.println(costOfGrocery + " is the total price.");
		System.out.println(middleInitial + " is the person's middle initial. ");
		System.out.println("Is it cold outside? " + isHotOutside);
		System.out.println("The customer's first name is " + customersFirstName);
		System.out.println("Street address: " + streetAddress);
		
	

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		System.out.println(availablePlaneSeats -=2);
	

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		
		System.out.println(costOfGrocery += 2.15);


		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
			
		

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was


		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
	

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable

		
	
	}//end main
}//end of class