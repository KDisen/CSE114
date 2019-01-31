/*
 * Keven Disen
 * ID: 111433335	
 * October 1, 2018
 * CSE 114 Lab 7 Part 2
 */

import java.util.*;
public class lab7part2 {

	public static void main(String[] args) {
		
		//generates three random decimal numbers 
		
		int l1 = 65 + (int)(Math.random()* (90-65));
		int l2 = 65 + (int)(Math.random()* (90-65));
		int l3 = 65 + (int)(Math.random()* (90-65));
		
		//convert decimal numbers into characters/letters
		
		char letter1 = (char) l1;
		char letter2 = (char) l2;
		char letter3 = (char) l3;
		
		//generates 4 random numbers to complete plate
		
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		int num3 = (int)(Math.random()*10);
		int num4 = (int)(Math.random()*10);
		
		
		System.out.println("Plate number: " + letter1+letter2+letter3+num1+num2+num3+num4);
		}
		
	}
