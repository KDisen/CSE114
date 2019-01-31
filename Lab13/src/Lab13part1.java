/*
 * Keven Disen
 * ID: 111433335
 * October 29, 2018
 * CSE 114 Lab# 13 part 1
 */
import java.util.*;
public class Lab13part1 {
	public static void main(String[] args) {
		//Get width and height from user
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the width");
		double width = scnr.nextDouble();
		System.out.println("Enter the height");
		double height = scnr.nextDouble();
		
		//Object
		Rectangle r1 = new Rectangle(width,height);
		System.out.println("height: " + height );
		System.out.println("width: " + width );
		System.out.println("area: " + r1.getArea() );
		System.out.println("Perimeter: " + r1.getPerimeter() );
	}
}
class Rectangle {
	private double width;
	private double height;
	
	//default constructor
	public Rectangle() {
		width =1;
		height =1;
	}//specified constructor
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}//method to get the area of the object
	public double getArea() {
		double area = width*height;
		return area;
	}//method to get perimeter of the object
	public double getPerimeter() {
		double perimeter = (2*width)+(2*height);
		return perimeter;
	}
}


