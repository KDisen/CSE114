import java.util.*;
public class Lab17part2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a string");
		String st1 = scnr.nextLine();
		for(char s: toCharacterArray(st1)) {
			System.out.print(s + " ");
		}
		}
	
	public static ArrayList<Character> toCharacterArray(String s){
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i=0; i<s.length();i++) {
			list.add(s.charAt(i));
		}
		return list;
	}
}
