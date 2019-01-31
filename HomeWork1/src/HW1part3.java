/*
 * Author: Keven Disen
 * ID: 111433335
 * September 29, 2018
 * CSE 114 Homework 1 Part 3
 */

import java.util.*;
public class HW1part3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String s = new String();
		int consonant = 0;
		int vowels = 0;
				
		System.out.println("Enter a string");
		s = scnr.next();
		int sLength = s.length();
		s = s.toLowerCase();
		
		System.out.println("Length of the string is " + sLength);
		
		for (int i = 0; i<sLength; ++i ) {
			char l = s.charAt(i);
			if (l == 'a'|| l ==  'e' || l == 'i' || l ==  'o' || l == 'u') {
				vowels++;	
			}else {
				consonant++;
			}
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonant);
		
		

		
		
		
	}
}