/*
 * Keven Disen
 * ID: 111433335
 * November 28, 2018
 * CSE 114 Lab#20 part 2
 */
import java.util.*;
public class Lab20part2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] array = new int[100];
		for(int i=0; i<array.length;i++) {
			array[i] = (int)(Math.random()*100);
		}
		boolean continueInput = true;
		do {
			try {
				System.out.println("Enter an integer for an index of the array");
				int index = scnr.nextInt();
				int number = array[index];
				System.out.println("The number in index " + index + " is: " + number);
				continueInput = false;
			}catch(IndexOutOfBoundsException ex) {
				System.out.println("Try again. (" + "index in range is required)");
				scnr.nextLine();
			}
		}while(continueInput);
	}
	}

