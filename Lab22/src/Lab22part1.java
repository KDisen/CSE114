/*
 * Keven Disen
 * ID: 111433335
 * December 5, 2018
 * CSE 114 Lab# 22 part 1
 */
import java.io.*;
import java.util.*;

	class CompareTwoFiles{
		String fileOneContent;
		String fileTwoContent;
		public CompareTwoFiles() {
		}
		public String readFileOne(String fileOne) {
			try {
				Scanner file = new Scanner(new File("file1.txt"));
				while(file.hasNext()) {
					fileOneContent = file.nextLine();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return fileOneContent;
		}
		public String readFileTwo(String fileTwo) {
			try {
				Scanner file = new Scanner(new File("file2.txt"));
				while(file.hasNext()) {
					fileTwoContent = file.nextLine();
				}
			}catch(FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return fileTwoContent;

		}
		public int compareTwoFiles(File fileOne, File fileTwo) throws FileNotFoundException{

			Scanner file1 = new Scanner(fileOne);
			Scanner file2 = new Scanner(fileTwo);
			int similarLine = 0;

			while(file1.hasNextLine() || file2.hasNextLine()){
				String One = null, Two = null;
				if(file1.hasNextLine()) {
					One = file1.nextLine();
				}
				if(file2.hasNextLine()) {
					Two= file2.nextLine();
				}

				if(!One.equals(Two) || !Two.equals(One)) {
					similarLine++;
				}
				}
				return similarLine;

			}
			
	}
	public class Lab22part1 {
		public static void main(String[] args) throws IOException {
			CompareTwoFiles comp = new CompareTwoFiles();
			File f1 = new File("file1.txt");
			File f2 = new File("file2.txt");
			String str1 = comp.readFileOne("file1.txt");
			String str2 = comp.readFileTwo("file2.txt");
			int lines = 0;
			if(str1.equals(str2)) {
				System.out.println("The text files are identical");
			}
			else  {
				System.out.println("The text files are different");
				lines = comp.compareTwoFiles(f1, f2);
				System.out.println("There are " + lines + " lines different");
				
			}
		
		}
		
	

	}
			
		
		
	
