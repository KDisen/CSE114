/*
 * Keven Disen 
 * ID: 111433335
 * October 10, 2018
 * CSE114 Lab 9 part 2
 */
import java.util.*;
public class Lab9part2 {

	public static void main(String[] args) {
		
		System.out.println("i            m(i)");

		for( double i = 1; i<=20; i++) {
			
			System.out.printf(i + "           "+ "%.4f\n", series(i));
		}
	}
	public static double series(double j) {
		double sum=0;
		//equation for series
		for (double i = 1; i<=j;i++) {
			sum  += i/(i+1);
		}
		return sum;
	}

}
