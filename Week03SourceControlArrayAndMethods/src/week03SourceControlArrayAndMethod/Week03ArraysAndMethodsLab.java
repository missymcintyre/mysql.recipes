
//Subject: Arrays & Methods
//Java Week 03 Lab
//
package week03SourceControlArrayAndMethod;

import java.lang.reflect.Array;

public class Week03ArraysAndMethodsLab {

		public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
			int[] array = {1, 5, 2, 8, 13, 6};
		
			
		//		{1, 5, 2, 8, 13, 6};
			
		
		// 2. Print out the first element in the array
	
			System.out.println(array[0]);
		
		// 3. Print out the last element in the array without using the number 5
		
			System.out.println(array[array.length -1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		//	System.out.println(array [6]);
		
		// 5. Print out the element in the array at position -1, what happens?
		//	System.out.println(array [-1]);
			
		// 6. Write a traditional for loop that prints out each element in the array
			
			for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			}
			
		// 7. Write an enhanced for loop that prints out each element in the array

			for (int number : array) {
			    System.out.println(number);
			}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum

			int sum = 0;
//
		for (int i : array) {
			   sum = array[i] + sum;
				System.out.println(i);
			System.out.println(sum); 		}
	}
		// 9. Create a new variable called average and assign the average value of the array to it

			double average = sum/array.length;
			System.out.println(average);
			
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd

		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"

		
		// 12. Calculate the sum of all the letters in the new array

		

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		
		public void greet(string name) {
			System.out.println( "Hello, " + name +"!");
		}
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.

		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
	
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position

				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		
		
	}
}
	

	
	// Method 13:


	// Method 14:

	
	// Method 15:

	
	// Method 16:

	
	// Method 17:

	
	// Method 18:

	
	// Method 19:

	
	// Method 20:
	
	
	// Method 21:
	
