/*
 * Author: Keven Disen
 * ID: 111433335
 * September 26, 2018
 * Lab 6 Part 3
 */

import java.util.*;
public class Lab6part3 {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a value: ");
		int n = scnr.nextInt();
		double sum = 0;
		
		while (n >= 1){
			double fact = 1;
			double m = n;
			while(m >= 1) {
				fact *= m;
				m--;
			}
			sum += 1/fact;
			n--;
		}
		System.out.printf("%.2f" , sum); 
}
}
