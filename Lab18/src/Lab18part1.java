/*
 * Keven Disen
 * November 19, 2018
 * CSE 114 Lab 18 part 1
 */
import java.lang.reflect.Array;
import java.util.*;
public class Lab18part1 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<String> list1 = new ArrayList<String>();
		System.out.println("Add 3 elements for the first list");
		for(int i=0; i<3;i++) {
			list1.add(scnr.nextLine());
		}
		ArrayList<String> list2 = new ArrayList<String>();
		System.out.println("Add 4 elements for the second list");
		for(int i=0; i<4;i++) {
			list2.add(scnr.nextLine());
		}
		
		System.out.println("List 1" + list1);
		System.out.println("List 2" + list2);
		
		ArrayList<String> list3 = mergeList(list1,list2);
		System.out.println("Merged list is "+ list3);
		
	}
	public static ArrayList<String> mergeList(ArrayList<String> lst1, ArrayList<String> lst2){
		//add list 2 into list 1
		for(int i=0; i<lst2.size();i++) {
			lst1.add(lst2.get(i));
		}
		//convert list into an array
		String[] array1 = new String[lst1.size()];
		lst1.toArray(array1);
		//bubble sort the array to be in ascending order
		for(int i=0; i<array1.length;i++) {
			for(int j=i+1; j<array1.length;j++) {
				if(array1[i].compareToIgnoreCase(array1[j])>=0) {
					String temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
				}
			}
		}
		//convert back to array list
		ArrayList<String> lst3 = new ArrayList<>(Arrays.asList(array1));
		return lst3;
	}

}

