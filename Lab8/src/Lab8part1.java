/*
 * Keven Disen
 * ID: 111433335	
 * October 3, 2018
 * CSE 114 Lab 8 Part 1
 */

import java.util.*;
public class Lab8part1 {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		//User enters a phone number
		System.out.print("Enter a phone number: ");
		String phNumber = scnr.next();
		
		//New String that begins the phone number format
		String newNum = "";
		
		for(int i = 0;i < phNumber.length();i++) {
			if(phNumber.length()<10) {
				System.out.println("Invalid");
				break;
			}
			if(i==0) newNum+="(";
			//After the third digit, add )
			if(i == 3) newNum += ")";
			//After the sixth digit, add -
			if(i==6) newNum += "-";
			newNum += phNumber.charAt(i);
		
			}
		System.out.println(newNum);
		
		
		
	}
}
	


