import java.util.*;
public class Lab4part2 {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int number;									
		System.out.print("Enter an integer: ");
		number = scnr.nextInt();
		System.out.println(number);
		
		
		System.out.print("Is " + number + " divisible by 5 and 6? ");
		if (number % 5 == 0 && number % 6 ==0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		System.out.print("Is " + number + " divisible by 5 or 6? ");
		if (number % 5 == 0 || number % 6 == 0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		System.out.print("Is " + number + " divisible by 5 or 6, but not both? ");
		if (number % 5 == 0 && number % 6 == 0) {
			System.out.println("false");
		}else {
			System.out.println("true");
		}

}
}