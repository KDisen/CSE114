/*
 * Author: Keven Disen
 * ID:111433335
 * September 26, 2018
 * CSE 114 Lab 6 part 2
 */
import java.util.*;
public class Lab6part2 {

	public static void main(String[] args) {
		
		int ch = 65 +(int)(Math.random() * (90-65));	//The decimal code for upper case letters 
		
		char letter = (char) ch;		//gets the decimal code and converts it into characters
		
		System.out.println("The letter is " + letter);
		
	}

}
