/*
 * Keven Disen
 * ID: 111433335
 * October 24, 2018
 * CSE 114 Lab #12 part 1
 */
import java.lang.reflect.Array;
import java.util.*;
public class Lab12part1 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("How many rows and columns do you want?");
		double [][] array = new double[scnr.nextInt()][scnr.nextInt()];
		System.out.println("Enter " + array.length + " rows and " + array[0].length + " columns: ");
		
		for(int row = 0; row<array.length; row++) {
			for(int column = 0; column < array[0].length;column++) {
				array[row][column] = scnr.nextDouble();
			}
		}
		for (int row = 0; row < array.length; row++) {
			  for (int column = 0; column < array[row].length; column++) {
			    System.out.print(array[row][column] + " ");
			  }
			  System.out.println();
			}
		// call method
		int [] location = locateLargest(array);
		System.out.println("The location of the largest element is at location (" + location[0] + "," + location[1]+")");
		
	}
	public static int[] locateLargest(double[][] a) {
		int [] location = new int[2];
		double largest = a[0][0];
		//for loops to get inside of the 2D arrays 
		//and if largest put them in location 0 and 1
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length; j++) {
				if(largest<a[i][j]) {
					largest = a[i][j];
					location[0] = i;
					location[1] = j;
				}
				
			}
		}
		return location;

	}
	
}
