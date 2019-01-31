/*
 * Author: Keven Disen
 * ID: 111433335
 * September 29, 2018
 * CSE 114 Homework 1
 */
import java.util.*;
public class HW1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter edge 1");
		double edge1 = scnr.nextDouble();
		System.out.println(edge1);
		
		System.out.println("Enter edge 2");
		double edge2 = scnr.nextDouble();
		System.out.println(edge2);
		
		System.out.println("Enter edge 3");
		double edge3 = scnr.nextDouble();
		System.out.println(edge3);
		
		double sum;
		
		if (edge1 + edge2 > edge3 && edge2 + edge3 > edge1 && edge1 + edge3 > edge2) {
			sum = edge1+edge2+edge3;
			System.out.println("The perimeter of this triangle is " + sum);
		}else {
			System.out.println("The input is invalid");
		}
	}
}