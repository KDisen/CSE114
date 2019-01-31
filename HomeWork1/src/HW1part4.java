/*
 * Author: Keven Disen
 * ID: 111433335
 * September 29, 2018
 * CSE 114 Homework 1 Part 4
 */

import java.util.*;
public class HW1part4 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String s = scnr.nextLine();
		System.out.println(s);
		
		System.out.println("The length of the string is " + s.length());
		int upperCase = 0;
		
		
		for(int i = 0;i< s.length();i++) {
			if (Character.isUpperCase(s.charAt(i)) ) {
				upperCase++;
			}
		}System.out.println("The number of uppercase letters is " + upperCase);

	}
	}
	

