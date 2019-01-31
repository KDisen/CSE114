/*
 * Author: Keven Disen
 * ID: 111433335
 * CSE114 Lab#3 Part 2
 * September 17, 2018
 */

import java.util.*;

public class Lab3part2 {

	public static void main(String[] args) {
		
			double w;
			Scanner scnr = new Scanner(System.in);
			
			System.out.println("Enter the weight of the package ");
			w = scnr.nextDouble();
			
			if (w<=1 && w>0) {
				System.out.println("Shipping cost is $3.50");
			}if (w>1 && w<=3) {
				System.out.println("Shipping cost is $5.50");
			}if (w>3 && w<=10) {
				System.out.println("Shipping cost is $8.50");
			}if (w>10 && w<=20) {
				System.out.println("Shipping cost is $10.50");
			}if (w<=0) {
				System.out.println("Invalid input");

			}if (w>20) {
				System.out.println("The package cannot be shipped");
			}
}
}
