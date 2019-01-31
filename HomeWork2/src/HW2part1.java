/*
 * Keven Disen
 * ID:111433335
 * October 24, 2018
 * CSE 114 Homework 2
 */
import java.util.*;
public class HW2part1 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the input string");
		String st = scnr.nextLine();
		String st1 = st.replaceAll(" ", "");
		String st2 = st1.toLowerCase();
		System.out.println(st2);
		boolean palind = palindrome(st2);
		if(palind) {
			System.out.println("String is a palindrome");
		}else {
			System.out.print("String is not a palindrome");
		}
		
	}
	public static boolean palindrome(String st) {
		int j = st.length()-1;
		for (int i = 0; i<st.length()-1; i++) {
				if(st.charAt(i)!=st.charAt(j)) {
					return false;
				}
				--j;
			}
		return true;
		
	}
}


