import java.util.*;
public class Lab16part1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int [][] matrix = new int[4][4];
		for(int i = 0; i<matrix.length; i++) {
			for(int j = 0; j<matrix[0].length;j++) {
				matrix[i][j] = (int)(Math.random()*2);
			}
		}
		for (int row = 0; row < matrix.length; row++) {
			  for (int column = 0; column < matrix[0].length; column++) {
			    System.out.print(matrix[row][column] + " ");
			  }
			  System.out.println();
			}
		System.out.println("The largest row index: " + RowOnes(matrix));
		System.out.println("The largest column index: " + ColOnes(matrix));
	}
	public static int RowOnes(int[][] matrix){
		int largestRow = -1;
		int rowCount = 0;
//for loops and if statement for if it equals 1 add count
		for(int row = 0; row<matrix.length;row++) {
			int count = 0;
			for(int col = 0; col<matrix[0].length;col++) {
				if(matrix[row][col]==1) count++;
			
		}
			if(largestRow<count) {
				rowCount = count;
				largestRow = row;
				
			}
		}
		return rowCount;
	}
	public static int ColOnes(int[][] matrix) {
		int largestCol = -1;
		int colCount = 0;
		for(int col = 0; col<matrix[0].length;col++) {
			int count = 0;
			for(int row = 0; row<matrix.length; row++) {
			if(matrix[row][col] == 1) count++;
			}
			if(largestCol<count) {
				colCount = count;
				largestCol = col;
			}
				
			}
		
		return colCount;
	}
}
