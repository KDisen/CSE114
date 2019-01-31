/*
 * Keven Disen
 * ID: 111433335
 * October 17, 2018
 * CSE114 Lab #10
 * 
 */
import java.util.*;
public class Labpart2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		int [] input = new int[10];
		for(int i=0; i<input.length; i++) {
			 input[i] = scnr.nextInt();
		}
		System.out.print("The distinct numbers are: ");
		for (int c:eliminateDuplicate(input)) {
			if (c!='a') {
				System.out.print(c + " ");
			}
		}
		
		
		
		
		
	}
	public static int[] eliminateDuplicate(int[]list) {
		//access array and go through each number
		//if number == to another one put a zero
		for (int i=0; i<list.length-1;i++) {
			 for (int j=i+1; j<list.length;j++) {
				 if(list[i]==list[j]) {
					 list[i] = (char) 'a';
				 }
			 }
		}
		
		return list;
	}
}
