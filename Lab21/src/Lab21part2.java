import java.io.*;
import java.util.*;
public class Lab21part2 {

	public static void main(String[] args) {
		boolean continueinput = true;
		do {
			try {
				Scanner scnr = new Scanner(System.in);
				System.out.println("Enter the file name");
				File file = new File(scnr.next());
				//reading file
				Scanner s = new Scanner(file);
				ArrayList<String> cities = new ArrayList<String>();
				//adding data from file to cities
				while(s.hasNext()) {
				cities.add(s.next());
				}
				//reverse
				for(int i = 0, j = cities.size() - 1; i < j; i++) {
			        cities.add(i, cities.remove(j));
			    }
				String[] city = new String[cities.size()];
				cities.toArray(city);
				//writing the reverse of the first text file in the new text file
				File f = new File("output.txt");
				FileWriter fw = new FileWriter(f,true);
				PrintWriter pw = new PrintWriter(fw);
				for(int i=0; i<city.length;i++) {
					pw.print(city[i] + " ");
				}
				pw.flush();
				System.out.println("output file updated");
				continueinput = false;
			}catch(IOException ioe) {
				System.out.println("File does not exist");
			}
		}while(continueinput);
	}
	}


