/*
 * Keven Disen
 * ID: 111433335
 * October 22, 2018
 * CSE114 Lab# 11 part 2
 */
import java.util.*;
public class Lab11part2 {
	public static void main(String[] args) {
		
		//inputs 10 numbers inside of an array
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		int [] nums = new int[10];
		for(int i=0; i<10;i++) {
			nums[i] = scnr.nextInt();
		} 
		//calls method to reverse the number given from user
		reverse(nums);
		
		//copy the numbers into r for print
		for(int r: nums) {
			System.out.print(r+ " ");
		}
		
	}
	//reverse method
	public static void reverse(int[] nums) {
		int temp;
		
		for (int i = 0, j = nums.length -1; i < nums.length / 2; i++, j--) {
			 //use temp to swap the numbers around
			temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
	}
				
	}
