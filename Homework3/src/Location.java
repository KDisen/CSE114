import java.util.*;
class Location{
	public int row;
	public int col;
	public double maxValue;
 
public Location(int r, int c, double val){
	row = r;
	col = c;
	maxValue = val;
}

public Location locateLargest(double[][] a) {
	
	for(int i = 0; i<a.length; i++) {
		for(int j = 0; j<a[0].length; j++) {
			if(maxValue <a[i][j]) {
				maxValue = a[i][j];
				row = i;
				col = j;
			}
		}
	}
	return new Location(row,col,maxValue);
}
public String toString() {
	return "(" + row +","+ col+")";
}
	
	public static void main(String[] args) {
		Location loc = new Location(0,0,0);
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the numbers of rows and columns");
		double matrix [][] = new double[scnr.nextInt()][scnr.nextInt()];
		System.out.println("Enter the matrix");
		for(int row = 0; row<matrix.length; row++) {
			for(int col = 0; col<matrix[0].length; col++) {
				matrix[row][col] = scnr.nextDouble();
			}
		}
		
		Location trix = loc.locateLargest(matrix);
		System.out.println("The location of the largest element " + trix.maxValue + " is at " + trix.toString() );
	}
}

