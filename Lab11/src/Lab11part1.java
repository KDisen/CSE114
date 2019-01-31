/*
 * Keven Disen
 * ID: 111433335
 * October 22, 2018
 * CSE114 Lab# 11 part 1
 */
import java.util.*;
public class Lab11part1 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		//list 1
		System.out.println("Enter list1 size and contents: ");
		int [] list1 = new int[scnr.nextInt()];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = scnr.nextInt();
		}
		//list 2
		System.out.println("Enter list2");
		int [] list2 = new int[scnr.nextInt()];
		for(int i =0; i<list2.length;i++) {
			list2[i] = scnr.nextInt();
		}
		//call method and merge array in list 3
		int [] list3 = merge(list1, list2);
		System.out.print("The merged list is");
		//list 3 then copied to e for print
		for (int e: list3) {
			System.out.print(" " + e);
		}
		System.out.println();
	}
	
	//merging both lists
	public static int[] merge(int[]list1,int[]list2) {
		int[] merge = new int[list1.length + list2.length];
		for (int i = 0; i < list1.length; i++)
			merge[i] = list1[i];

		for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
			merge[j] = list2[i];	
		}
		//sort the merging array
		bubbleSort(merge);

		return merge;
	}
	
	//sorts the merging lists
	public static void bubbleSort(int[] list) {
		//i begins with the 0th index
		for (int i = 0; i < list.length - 1; i++) {
			int min = list[i];
			int index = i;
		//j begins with index next to i
			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < min) {
					min = list[j];
					index = j; 
				}					
			}
			//if its not i then change the indexes
			if (index != i) {
				list[index] = list[i];
				list[i] = min;
			}
		}
	}
	
		}
		
	



