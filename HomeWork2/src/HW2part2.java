
/*
 * Keven Disen
 * ID:111433335
 * October 24, 2018
 * CSE 114 Homework 2
 */
import java.util.*;
public class HW2part2 {
	public static void main(String [] args) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a string");
		String user1 = scnr.nextLine();
		System.out.println("Enter another string");
		String user2 = scnr.nextLine();
		String sameUser2 = user2.toLowerCase().replace(" ", "");
		String sameUser1 = user1.toLowerCase().replace(" ", "");
		System.out.println();
		
		boolean words = anagrams(sameUser1,sameUser2);
		if(words) {
			System.out.println(user1 + " and " + user2 + " are anagrams");
		}
		else
			System.out.println(user1 + " and " + user2 + " are not anagrams");
	}
	
	public static boolean anagrams(String user1,String user2) {
		boolean anagram;
			char[] user1Array = user1.toCharArray();
			char[] user2Array = user2.toCharArray();
			Arrays.sort(user1Array);
			Arrays.sort(user2Array);
			anagram = Arrays.equals(user1Array, user2Array);
		
		return anagram;
	}
}

