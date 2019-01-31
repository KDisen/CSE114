/*
 * Author: Keven Disen
 * ID: 111433335
 * CSE114 Lab#1
 * September 10, 2018
 * 
 */

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double radius;  			// declaring radius
		double area;				// declaring area
		
		System.out.println("Enter the radius->");	//User enters radius
		radius = scnr.nextDouble();
		
		area = Math.PI * Math.pow(radius, 2);  		//Equation for area of circle
		
		System.out.println("The area of the circle" +
							" of the radius " + radius + " is " + area);
		
		scnr.close();

	}

}
