/*
 * Author: Keven Disen
 * ID: 111433335
 * CSE114 Lab#2 part 2
 * September 12, 2018
 */

import java.util.*;
public class Lab2part2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//Declaring variables
		int i, e, cross;
		double pay;
		String y = new String();
		
		
		
		System.out.println("Please enter your initial zone");
		i = scnr.nextInt();
		System.out.println(i);
		
		
		System.out.println("Please enter your end zone");
		e = scnr.nextInt();
		System.out.println(e);
		
		System.out.println("Please enter the zone you crossed");
		cross= scnr.nextInt();
		System.out.println(cross);
		
		System.out.println("Are you a student?");
		y = scnr.next();
		System.out.println(y);
		
		
		if (y.equals("Yes")) {
		if ( cross == 0  ) {
			
			pay = 1.5*.7;
			System.out.println("You should pay: $" + pay);
		}
			
		if (cross == 1 ) {
			
			pay = 2.0*.7;
			System.out.println( "You should pay: $" + pay);
			
		}
		if (cross == 2 ) {
			
			pay = 3.5 * .7;
			System.out.println("You should pay: $" + pay);
		}} 
		else if (cross == 0) {
			pay = 1.5;
			System.out.println("You should pay: $" + pay);
		}
		if (cross == 1) {
			pay = 2.0;
			System.out.println("You should pay: $" + pay);
		}
		if (cross == 2) {
			pay = 3.5;
			System.out.println("You should pay: $" + pay);
		}
		
		
}
}
