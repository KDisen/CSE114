/*
 * Author: Keven Disen
 * ID: 111433335
 * CSE114 Lab#3
 * September 17, 2018
 */

import java.util.*;

public class Lab3 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		double a,b,c;
		
		System.out.println("Enter value for a");
		a = scnr.nextDouble();
		
		System.out.println("Enter value for b");
		b = scnr.nextDouble();
		
		System.out.println("Enter value for c");
		c = scnr.nextDouble();
		
		System.out.println("a = " + a + " b = " + b + " c = " + c);
		
		double discriminate = (Math.pow(b, 2) - 4*a*c);
		double r1, r2;
		
		r1 = (-b + Math.pow(discriminate, 0.5)) / (2*a);
		r2 = (-b - Math.pow(discriminate, 0.5))/(2*a);
		
		if (discriminate>0) {
			
			System.out.println("The equation has two roots " + r1 + " and " + r2);
		}
			
		 if (discriminate ==0) {
			
			System.out.println("The equation has one root " + r1);
		 }
		else if (discriminate < 0 ) {
			
			System.out.println("The equation has no real roots");
		}
		

	}

}
