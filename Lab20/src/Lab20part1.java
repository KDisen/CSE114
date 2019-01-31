/*
 * Keven Disen
 * ID: 111433335
 * November 28, 2018
 * CSE 114 Lab#20 part 1
 */
import java.util.*;
public class Lab20part1 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean continueInput = true;
		do {
			try {
				System.out.println("Enter one integer");
				int n1 = scnr.nextInt();
				System.out.println("Enter another integer");
				int n2 = scnr.nextInt();
				System.out.println("The sum of the integers is "+ (n1+n2));
				continueInput = false;
			}catch(InputMismatchException ex) {
				System.out.println("Try again. (" + "an integer is required)");
				scnr.nextLine();
			}
		}while(continueInput);
	}
}
