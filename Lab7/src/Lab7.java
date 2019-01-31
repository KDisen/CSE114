/*
 * Keven Disen
 * ID: 111433335	
 * October 1, 2018
 * CSE 114 Lab 7 Part 1
 */
import java.util.*;
public class Lab7 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String st1 = new String();
		String st2 = new String();
		String st3 = new String();
		
		//Scan three different Strings
		
		System.out.println("Enter the first city: ");
		st1 = scnr.nextLine();
		
		System.out.println("Enter the second city: ");
		st2 = scnr.nextLine();
		
		System.out.println("Enter the third city: ");
		st3 = scnr.nextLine();
		
		String empty = "";
		
		//Compares if first letter goes first or not
		
		if(st1.compareToIgnoreCase(st2)>0) {
            empty = st2;		
			st2 = st1;
            st1 = empty;
 
        }
        if (st2.compareToIgnoreCase(st3) > 0) {
            empty = st3;
            st3 = st2;
            st2 = empty;
 
        }
        if (st1.compareToIgnoreCase(st2) > 0) {
            empty = st2;
            st2 = st1;
            st1 = empty;
 
        }
        System.out.println("The three cities in alphabetical order are " + st1 + " " + st2 + " " + st3);
		}
	}


