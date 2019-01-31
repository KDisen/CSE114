/*
 * Keven Disen
 * ID: 111433335
 * October 31, 2018
 * CSE 114 Lab# 14 part 2
 */
import java.util.*;
public class Lab14part2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double[][] matrix = new double[4][4];
		
		System.out.println("Enter a 4x4 matrix row by row: ");
		for(int row = 0; row<matrix.length; row++) {
			for(int col = 0; col<matrix[0].length;col++) {
				matrix[row][col] = scnr.nextDouble();
			}
		}
		scnr.close();
		System.out.println("The sum of the Diagonal in the matrix is " +sumMajorDiagonal(matrix));
		
		
	}
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for(int i =0; i<m.length;i++) {
			for(int j =0; j<m[i].length;j++) {
				if(i==j) {
				sum+= m[i][j];
				}
			}
		}
		
		return sum;
	}
}

