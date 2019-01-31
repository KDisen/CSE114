/*
 * Keven Disen
 * ID: 111433335
 * October 29, 2018
 * CSE 114 Lab# 13 part 2
 */
public class Lab13part2 {
	public static void main(String[]args) {
		int[] rand = new int[10];
		
		//generates 100 random integers between 0 and 9
		for(int i = 0; i<100; i++) {
			rand[(int)(Math.random()*9)]++;
			
		}
		//prints how many times the index of the array appears
		for(int i = 0; i<rand.length;i++) {
			System.out.println(i + " appears " + rand[i] + " times.");
		}
		//System.out.println("The sum is: " + sum);
	}
}
