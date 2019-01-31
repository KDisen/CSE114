import java.util.*;
public class Lab4 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int numbers;
		System.out.println("Enter a three digit number: ");
		numbers = scnr.nextInt();
		System.out.println(numbers);
		
		int firstNumber = numbers / 100;
		int thirdNumber = numbers % 10;
		
		if (firstNumber == thirdNumber) {
			
			System.out.println("The number " + numbers + " is a palindrome");
			
		}else {
			System.out.println("The number " + numbers + " is not palindrome");
		}
		
	}
}
