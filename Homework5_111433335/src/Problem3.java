/*
 * Keven Disen
 * ID: 111433335
 * December 12, 2018
 * CSE 114 Homework #5 Problem 1
 */
import java.util.*;
public class Problem3 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = scnr.next();
		 word = reverse(word);
		System.out.println("Reversed String is " + word);
	}
	public static String reverse(String word) {
		//if word has nothing then print nothing
		if(word.isEmpty())
			return word;
		else {
	//skips first letter and adds it to the end, continues doing it until there are no more letters left in word
			String reversedWord = reverse(word.substring(1))+ word.charAt(0); //adds letters before first letters
			return reversedWord;
		}
	}
}
