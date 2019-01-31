import java.io.*;
import java.util.*;
public class Lab21part1 {
	public static void main(String[] args){
		
		try {
			Scanner scnr = new Scanner(System.in);
			System.out.println("Enter the file name");
			File file = new File(scnr.next());
			Scanner s = new Scanner(file);
			
			double total = 0;
			int count = 0;
			double average = 0;
			while(s.hasNext()) {
				total+=s.nextInt();
				count++;
			}
			average = total/count;
			System.out.println("Total Score: " + total);
			System.out.println("Average: " + average);
		}catch(IOException ioe) {
			System.out.println("File does not exist");
		}
	}
}

