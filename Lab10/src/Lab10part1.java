/*
 * Keven Disen
 * ID: 111433335	
 * October 17, 2018
 * CSE114 Lab #10
 * 
 */

import java.util.*;
public class Lab10part1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		double [] input = new double[10];
		for(int i = 0; i<10; i++) {
			input[i] = scnr.nextDouble();
		}
		//print and call methods
		System.out.println("The mean is " + mean(input));
		System.out.println("The standard deviation is " + deviation(input));
		
	}
	
	//Deviation Method
	public static double deviation(double[]x) {
		//link with other method because this equations
		//needs the mean equation 
		double mean = mean(x);
		double sum = 0;
		
		//equation for standard deviation
		for(int i=0; i<x.length; i++) {
			double val = x[i] - mean;
			sum += Math.pow(val, 2);
			
		}
		double insideVal = sum/(x.length-1);
		double standDev = Math.sqrt(insideVal);
		//return standDev
		return standDev;
	}
	
	//Mean method
	public static double mean(double[]x) {
		double sum = 0;
		
		//equation for mean
		for(int i =0; i<x.length; i++) {
			sum +=x[i];
		}
		double meansAns = sum/x.length;
		//return meanAns
		return meansAns;
	}

}
