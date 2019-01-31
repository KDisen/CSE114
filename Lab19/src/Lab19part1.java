/*
 * Keven Disen
 * ID: 111433335
 * November 26, 2018
 * CSE 114 Lab#19 part 1
 */
import java.util.*;
public class Lab19part1 {
		public static void main(String[] args) {
			Course course1 = new Course("Data Structures");
			Course course2 = new Course("Database Systems");
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
					System.out.print("Updated Course 1: ");
					for(int i = 0; i < course2.getNumberOfStudents(); i++)
						System.out.print(students[i] + " , ");
		}
		
	}
	class Course{
		private String courseName;
		private String[] students = new String[100];
		private int numberOfStudents;
		public Course(String courseName) {
			this.courseName = courseName;
		}
		public void addStudent(String student) {
			if(numberOfStudents>= students.length) {
				String[] array1 = new String[students.length*2];
				for(int i=0; i<array1.length;i++) {
					students[i] = array1[i];
					
				}
				students=array1;
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

