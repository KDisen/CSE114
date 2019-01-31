/*
 * Keven Disen
 * ID: 111433335
 * December 12, 2018
 * CSE 114 File Extra Credit
 */
import java.io.*;
import java.util.*;
public class ReverseFile_111433335 {

	public static void main(String[] args) throws IOException {
		Scanner scnr = new Scanner(System.in);
		//write strings into file
		File file = new File("randStrings.txt");
		printRandStrings(file);
		//read file again
		try {
		Scanner read = new Scanner(file);
		ArrayList<String> scan  = new ArrayList<String>();
			while(read.hasNext()) {
				scan.add(read.next());
		}
		String[] array = new String[scan.size()];
		scan.toArray(array);
		//Sort String arrays method
		sortString(array);
		//Writing sorted Strings into the same file
		FileWriter fw2 = new FileWriter(file,false); //false to replace the content with the new content sorted
		PrintWriter pw2 = new PrintWriter(fw2);
		for(int i=0; i<array.length; i++) {
			pw2.print(array[i] + " ");
		}
		pw2.flush();

	}catch(IOException ex) {
		ex.printStackTrace();
	}
	}
				//write random strings into file
	public static void printRandStrings(File file) {
		try {
		FileWriter fw = new FileWriter(file,true);
		PrintWriter pw = new PrintWriter(fw);
		int letterA = 97; // letter 'a'
	    int letterZ = 122; // letter 'z'
		String[] str = new String[100];
		Random rand = new Random();
		for(int i =0; i<str.length; i++) {
			int randNum = getRandomNumberInRange();
			StringBuilder sb = new StringBuilder(randNum);
			for(int j=0; j<randNum; j++) {
				//get random integers to convert to a character
			int randLetters = letterA + (int)(rand.nextFloat() * (letterZ - letterA + 1));
	    	        sb.append((char) randLetters);
			}
			pw.print(sb.toString() + " ");
		}
		pw.flush();
	}catch(IOException ioe) {
		System.out.println("File does not exist");
	}

}
	//random number for String length
	public static int getRandomNumberInRange() {
		Random rand = new Random();
		return rand.nextInt((10-3)+1)+3; // random number between 3 and 10
	}
	//sorting the Strings
	public static void sortString(String[] str) {
		for(int i=0; i<str.length;i++) {
			for(int j=i+1; j<str.length;j++) {
				if(str[i].compareToIgnoreCase(str[j])>=0) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
	}
	}



