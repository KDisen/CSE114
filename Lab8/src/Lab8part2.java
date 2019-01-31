/*
 * Keven Disen
 * ID: 111433335	
 * October 3, 2018
 * CSE 114 Lab 8 Part 2
 */

import java.util.*;
public class Lab8part2 {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		//User enters an encrypted code that consists of 
		//first five characters with even numbered indexes
		System.out.println("Enter an encrypted code");
		String encryption = scnr.nextLine();
		
		//New empty string for decryption of string
		String decryption = "";
		int length = encryption.length();
		for(int i = 0; i<10; i++) {
				if(length<10) {
					System.out.println("Invalid");
					break;
				}
			//if i is even 
				if (i%2 == 0) {
					 char letter = encryption.charAt(i);
					
				decryption+=letter;
			}
		}
		System.out.println(decryption);
	
		
		
	}
	}

