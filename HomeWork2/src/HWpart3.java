/*
 * Keven Disen
 * ID:111433335
 * October 24, 2018
 * CSE 114 Homework 2
 */
import java.util.*;
public class HWpart3 {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter 10 Strings");
		String [] cities = new String[10];
		for(int i = 0; i<10; i++) {
			cities[i] = scnr.nextLine();
		}
		sort(cities);
		
}		
//sorting cities	
	public static void sort(String [] cities) {
		//extra string to swap cities
		String temp;
		for(int i=0;i<10;i++){
			for(int j=i+1;j<10;j++){
				//comparing letters, if greater than they switch
				if(cities[i].compareTo(cities[j]) > 0){
					temp = cities[i];
					cities[i]=cities[j];
					cities[j] = temp;
		}
	}
}
		//prints the cities
		System.out.println();
		for(int i=0;i<10;i++){
		System.out.print(cities[i]+" ,");
		}
	}
}

