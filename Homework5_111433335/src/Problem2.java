/*
 * Keven Disen
 * ID: 111433335
 * December 12, 2018
 * CSE 114 Homework #5 Problem 2
 */
import java.util.*;
public class Problem2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] array = new int[8];
		System.out.println("Enter 8 integers");
		for(int i = 0; i<array.length; i++) {
			array[i] = scnr.nextInt();
		}
		//zero index because every index starts with 0
		int largest = largestElement(array,0);
		System.out.println("The largest element is in the array " + largest);
	}
	public static int largestElement(int[]array, int in) {
		//if the zero index is the only index then that is the only number, 
					//which must be the largest
		if(in == array.length-1) {
			return array[in];
		}else {
		//if there is more than one index do these statements
			int max = largestElement(array, in+1);
			int num = array[in];
			if(num>max) {
				return num;
			}
		else return max;
		}
		
	}
	
}


