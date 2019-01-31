/*
 * Keven Disen
 * ID:111433335
 * October 24, 2018
 * CSE 114 Homework 2
 */
import java.util.*;
public class HW2part4 {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		double [][] matrixA = new double [3][3];
		System.out.println("Enter matrix 1: ");
		for(int row = 0; row<matrixA.length; row++) {
			for(int column = 0; column < matrixA[0].length;column++) {
				matrixA[row][column] = scnr.nextDouble();
			}
		}
		System.out.println("This is matrix A");
		for (int row = 0; row < matrixA.length; row++) {
			  for (int column = 0; column < matrixA[row].length; column++) {
			    System.out.print(matrixA[row][column] + " ");
			  }
			  System.out.println();
	}
		double [][] matrixB = new double[3][3];
		System.out.println("Enter matrix 2: ");
		for(int row = 0; row<matrixB.length; row++) {
			for(int column = 0; column < matrixB[0].length;column++) {
				matrixB[row][column] = scnr.nextDouble();
			}
		}
		System.out.println("This is matrix B");
		for (int row = 0; row < matrixB.length; row++) {
			  for (int column = 0; column < matrixB[row].length; column++) {
			    System.out.print(matrixB[row][column] + " ");
			  }
			  System.out.println();
	}
		System.out.println("Multiplication of the matrices is: ");
		double[][] matrixC = multiplyMarkov(matrixA,matrixB);
		for (int row = 0; row < matrixC.length; row++) {
			  for (int column = 0; column < matrixC[row].length; column++) {
			    System.out.printf("%5.1f",matrixC[row][column]);
			  }
			  System.out.println();
}
	}
	public static double [][] multiplyMarkov(double[][]a, double[][]b){
		double[][] matrixC = new double[3][3];
		for (int i = 0; i < a.length; i++) { 
		    for (int j = 0; j < b[0].length; j++) { 
		        for (int k = 0; k < a[0].length; k++) { 
		            matrixC[i][j] += a[i][k] * b[k][j];
		        }
		    }
		}
		return matrixC;
		
		
		
		
	}
}

