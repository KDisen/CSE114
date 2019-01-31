/*
 * Keven Disen
 * ID: 111433335
 * November 26, 2018
 * CSE 114 Lab#19 part 2
 */
import java.util.*;
public class Lab19part2 {
	public static void main(String[] args) {
		Corse course1 = new Corse("Data Structures");
		Corse course2 = new Corse("Database Systems");
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");
		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");
		
		System.out.println("Number of students in course 1: " +
		course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for(int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + " , ");
		
		System.out.println();
		System.out.println();

		System.out.println("Number of students in course 2: " +
				course2.getNumberOfStudents());
				students = course2.getStudents();
				for(int i = 0; i < course2.getNumberOfStudents(); i++)
					System.out.print(students[i] + " , ");
				
				System.out.println();					
				System.out.println();
				
				students = course1.getStudents();
				course1.dropStudent("Peter Jones");
				System.out.println("Peter Jones is removed");
				System.out.print("Updated Course 2: ");
				for(int i = 0; i < course2.getNumberOfStudents(); i++)
					System.out.print(students[i] + " , ");
	}
	
}
class Corse{
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	public Corse(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent(String student) {
		if(numberOfStudents>= students.length) {
			ArrayList<String> list = new ArrayList<String>(Arrays.asList(students));
			list.add(student);
			list.toArray(students);
		}
		students[numberOfStudents] = student;
		numberOfStudents++;

	}
	public String[] getStudents() {
		return students;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}
	public void dropStudent(String student) {
	ArrayList<String> list = new ArrayList<String>(Arrays.asList(students));
	list.remove(student);
	list.toArray(students);
	
	}
	public String[] clear() {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(students));
		list.clear();
		list.toArray(students);
		return students;
		
	}
}



