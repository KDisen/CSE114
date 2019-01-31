/*
 * Author: Keven Disen
 * ID: 111433335
 * September 26, 2018
 * Lab 6 Part 3
 */

import java.util.*;
public class Lab6part3Loop2 {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a value: ");
		double n = scnr.nextInt();
		double sum = 0;
		
		for(double i = n; i>=1; i--) {
			double fact = 1.0;
			for (double j = i; j>=1; j--) {
				fact*=j;
			}sum += (1/fact);

		
			
		}
		System.out.printf("%.2f", sum);
		
	}
	
}
