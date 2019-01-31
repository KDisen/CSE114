/*
 * Keven Disen
 * ID: 111433335
 * October 24, 2018
 * CSE 114 Lab #12 part 2
 */
import java.util.*;
public class Lab12part2 {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		double[][] matrix = new double[3][3];
		
		System.out.println("Enter a 3x3 matrix: ");
		
		for(int row = 0; row<matrix.length; row++) {
			for(int column = 0; column < matrix[0].length;column++) {
				matrix[row][column] = scnr.nextDouble();
			}
		}
		for (int row = 0; row < matrix.length; row++) {
			  for (int column = 0; column < matrix[row].length; column++) {
			    System.out.print(matrix[row][column] + " ");
			  }
			  System.out.println();
			}
		//call method
		boolean test = isMarkovMatrix(matrix);
		if(test)
			System.out.println("It is a Markov matrix");
		else
			System.out.println("It is not a Markov matrix");
		
		
		
	}
	public static boolean isMarkovMatrix(double[][]m ) {
		//get largest indices for largest element in the two D array
		//if number is greater than 0 and sum of column is 1 then it's a Markov matrix
		boolean markov;
		for(int r =0; r<m.length;r++) {
			double sum = 0;
			for(int c=0;c<m[r].length;c++) {
				if(m[r][c]>=0) {
				sum=sum+m[r][c];
				}else if (m[r][c]<0) {
					return false;
			
		}
			}
			
			if(sum!=1) 
				markov = false;
			}
				return true;
}
	}


