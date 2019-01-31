/*
 * Keven Disen
 * ID: 111433335
 * October 10, 2018
 * CSE114 Lab #9
 */
import java.util.*;
public class Lab9part1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s = new String();
		s = scnr.nextLine();
		
		System.out.println("Enter a character");;
		char chr = scnr.next().charAt(0);
		
		
		System.out.println("Number of occurrences of character in String is "
				+ count(s,chr));
	}
	public static int count(String str, char a) {
		int count=0;
		for (int i = 0; i<str.length(); i++) {
			if(str.charAt(i)==a) {
				count++;
			}
		}return count;
	}
}
