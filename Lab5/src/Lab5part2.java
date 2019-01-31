/*
 * Author: Keven Disen
 * ID:111433335
 * September 24, 2018
 * CSE 114 Lab5 Part2
 */
import java.util.*;
public class Lab5part2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//Enter number of sides 
		System.out.println("Enter the number of sides");
		double n = scnr.nextDouble();
		
		//Enter length of sides
		System.out.println("Enter the length of one side");
		double length = scnr.nextDouble();
		
		//equation for area 
		double area = ((n * (Math.pow(length, 2))/(4 * Math.tan((Math.PI)/n))));  
		
		//print area of polygon
		System.out.println("The area of the " + n 
							+ " sided polygon is " + area); 
	}

}
