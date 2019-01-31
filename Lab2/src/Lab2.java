/*
 * Author: Keven Disen
 * ID: 111433335
 * September 12, 2018
 * CSE 114 Lab#2
 */

import java.util.*;
public class Lab2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//Declaring variables
		double v0;			
		double v1;
		double t;
		double a;
		
		//User inputs numbers for variables
		System.out.println("Enter the starting velocity v0");  
		v0 = scnr.nextDouble();
		
		System.out.println("Enter the ending velocity v1");
		v1 = scnr.nextDouble();
		
		System.out.println("Enter the time span t");
		t = scnr.nextDouble();
		
		//Equation for average acceleration
		a = ((v1 - v0)/t);
		
		System.out.println("The average acceleration when\n" + "v0= " + v0 + " meters/second\n" 
							+ " v1= " + v1 + " meters/second\n" 
							+ " and t= " + t  + " seconds\n"
							+ " is, a = " + a + "\n");
		
		scnr.close();
		
	}

}
