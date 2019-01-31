/*
 * Keven Disen
 * ID: 111433335
 * December 5, 2018
 * CSE 114 Homework#4
 */
import java.io.*;
import java.util.*;
public class Problem1 {
	public static void main(String[] args) throws FileNotFoundException {
		try {
	           File file = new File("integerFile.txt");
	           FileWriter fw = new FileWriter(file);
	           PrintWriter pw = new PrintWriter(fw);
	           //generating random numbers
	           for(int i=1;i<=100;i++) {
	               int random = (int)(Math.random()*100);
	               //writing random numbers in text file
	               pw.write(random+" ");
	           }
	           pw.close();
	           //Read data back from file
	           String sCurrentLine;
	           BufferedReader br = new BufferedReader(new FileReader("integerFile.txt"));
	           int data[] = new int[100];
	           int j=0;
	           while ((sCurrentLine = br.readLine()) != null) {
	               String line[] = sCurrentLine.split(" ");
	               for(int i=0;i<line.length;i++) {
	                   data[j] = Integer.parseInt(line[i]);
	                   j++;
	               }
	           }
	           br.close();
	          
	           //Sort data in increasing order using bubble sort
	           sort(data,j);
	           //Finally print data in increasing order
	           for(int i=0;i<j;i++) {
	               System.out.print(data[i]+" ");
	           }
	       } catch (IOException e) {
	           System.out.println("file doesn't exist");
	       }
	   }
	//sorting data
	public static void sort(int[] data, int j) {
		for(int i=0;i<j-1;i++) {
             for(int k=i+1;k<j;k++) {
                 if(data[i]>data[k]) {
                     int temp = data[i];
                     data[i] = data[k];
                     data[k] = temp;
                 }
             }
         }
	}
	}

