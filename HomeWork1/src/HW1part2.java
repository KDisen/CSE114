/*
 * Author: Keven Disen
 * ID: 111433335
 * September 29, 2018
 * CSE 114 Homework 1 Part 2
 */

import java.util.*;
public class HW1part2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a letter");
		char user = scnr.next().charAt(0);
		
		if (user == 'a'|| user ==  'e' || user == 'i' ||user ==  'o' || user == 'u' ||
			user == 'A'|| user == 'E' || user == 'I' || user == 'O' || user == 'U') 	//if any of these letters, then it's a vowel
		{
			System.out.println(user + " is a vowel");
		}else if((user >= 97 && user <= 122) || (user >= 65 && user <= 90))				//if letters that are not the vowels then print it's a consonant
	       {
	           System.out.println(user + " is a consonant.");
	       }
	       else			// if it's a number or anything other than a number then it's an invalid input
	       {
	           System.out.println(user + " is an invalid input.");
	       }
		}
		
	}
