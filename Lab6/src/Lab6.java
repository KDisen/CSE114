/*
 * Author: Keven Disen
 * ID:111433335
 * September 26, 2018
 * CSE 114 Lab 6
 */
import java.util.*;
public class Lab6 {

	public static void main(String[] args) {
		
		//Declaring variables and initializing them
		double average = 0; 	
		int rand = 0;
		double sum= 0;
		
		//For loop to generate 10 integers
		for(int i = 0; i<10; i++) {
			rand =(int) (Math.random() *100); //random integers from 0 to 100
			sum = sum + rand;					// to get sum to find average
		}
		System.out.println("The sum is " + sum);
		
		//Finding average 
		average = sum/ 10.0;		//Dividing by 10 b/c there are 10 integers that are being generated
		System.out.println("The average is " + average);

	}
	}


