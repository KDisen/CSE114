/*
 * Keven Disen
 * November 19, 2018
 * CSE 114 Lab 18 part 2
 */
import java.util.*;
import java.lang.reflect.Array;
public class Lab18part2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		System.out.println("Add 5 numbers for the first list");
		for(int i=0; i<5;i++) {
			list1.add(scnr.nextInt());
		}
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		System.out.println("Add 5 numbers for the second list");
		for(int i=0; i<5;i++) {
			list2.add(scnr.nextInt());
		}
		//print list 1
		System.out.print("List 1: ");
		for(int i=0; i<list1.size();i++) {
			System.out.print(list1.get(i) + " ");

		}
		System.out.println();

		//print list 2
		System.out.print("List 2: ");
		for(int i=0; i<list2.size();i++) {
			System.out.print(list2.get(i) + " ");

		}		
		System.out.println();
		//print list 3 with spaces
		ArrayList<Integer> list3 = union(list1,list2);		
		System.out.print("Union list is: ");
		for(int i=0; i<list3.size();i++) {
			System.out.print(list3.get(i) + " ");
		}
	}
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
		//add list 2 into list1
		for(int i=0; i<list2.size();i++) {
			list1.add(list2.get(i));
		}
		return list1;
	}

}
