/*
 * Author: Keven Disen
 * ID: 111433335
 * September 24, 2018
 * CSE 114 Lab 5
 */
import java.util.*;
public class Lab5 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a positive integer");	//Enter positive number
		int input = scnr.nextInt();						//Gets the number from user
		System.out.println(input);						//Prints the number so the user knows what number they inputted

		
		int factorial = 1;								//declare and initialize factorial
		
		do {											//loop so the number inputed can multiply to get its factorial
			factorial*=input;
			input--;
		}while(input>0);								//do that while input is greater than 0
		System.out.println("The factorial is " + factorial);
		
	
			
			
		}
		
	}


