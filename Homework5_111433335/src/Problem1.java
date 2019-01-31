/*
 * Keven Disen
 * ID: 111433335
 * December 12, 2018
 * CSE 114 Homework #5 Problem 1
 */
import java.util.*;

abstract class GeometricObject implements Comparable {
			  private String color = "white";
			  private boolean filled;
			  private java.util.Date dateCreated;
			  protected GeometricObject() {
			    dateCreated = new java.util.Date();
			  }
			  protected GeometricObject(String color, boolean filled) {
			    dateCreated = new java.util.Date();
			    this.color = color;
			    this.filled = filled;
			  }
			  public String getColor() {   return color;  }
			  public void setColor(String color) {  this.color = color;  }
			  public boolean isFilled() {   return filled;  }
			  public void setFilled(boolean filled) {  this.filled = filled;  }
			  public java.util.Date getDateCreated() {   return dateCreated;  }
			  public String toString() {
			    return "created on " + dateCreated + "\ncolor: " + color +
			      " and filled: " + filled;
			  }
			  /** Abstract method getArea */
			  public abstract double getArea();
			  /** Abstract method getPerimeter */
			  public abstract double getPerimeter();
			}
		class Circle extends GeometricObject implements Comparable{
				private double radius;
				  public Circle() {   }
				  public Circle(double radius) {
				    this.radius = radius;  
				  }
				  public double getRadius() {
				    return radius;
				  }
				  public void setRadius(double radius) {
				    this.radius = radius;  
				  }
			@Override
			public int compareTo(Object o) {
				if(getArea() > ((Circle) o).getArea())
					return 1;
				else if(getArea() < ((Circle)o).getArea())
					return -1;
				else return 0;
			}
			@Override
			public double getArea() {
			    return radius * radius * Math.PI;
			}
			@Override
			public double getPerimeter() {
			    return 2 * radius * Math.PI;
			}
			
		}
		class Rectangle extends GeometricObject implements Comparable{
			 private double width;
			  private double height;
			  public Rectangle() {  }
			  public Rectangle(double width, double height) {
			    this.width = width;
			    this.height = height;
			  }
			  public double getWidth() {    return width;  }
			  public void setWidth(double width) {     this.width = width;  }
			  public double getHeight() {    return height;  }
			  public void setHeight(double height) {    this.height = height;  }
			  @Override
			  public double getArea() {
			    return width * height;
			  }
			  @Override
			  public double getPerimeter() {
			    return 2 * (width + height);
			  }
			@Override
			public int compareTo(Object o) {
				if(getArea() > ((Rectangle) o).getArea())
					return 1;
				else if(getArea() < ((Rectangle)o).getArea())
					return -1;
				else return 0;
			}
		}
public class Problem1 {
	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		Circle c2 = new Circle (4);
		Rectangle r1 = new Rectangle(4,5);
		Rectangle r2 = new Rectangle(3,5);
		
		//Comparing circles
		int compareCircles = c1.compareTo(c2);
		if(compareCircles==1) System.out.println("Circle 1 is larger than Circle 2");
		else if(compareCircles==-1) System.out.println("Circle 2 is larger than Circle 1");
		else System.out.println("Circle 1 and Circle 2 are the same size");
		
		System.out.println();
		
		//Comparing Rectangles
		int compareRectangles = r1.compareTo(r2);
		if(compareRectangles==1) System.out.println("Rectangle 1 is larger than Rectangle 2");
		else if(compareRectangles==-1) System.out.println("Rectangle 2 is larger than Rectangle 1");
		else System.out.println("Rectangle 1 and Rectangle 2 are the same size");
		
}
	public interface Comparable{
		public abstract int compareTo(Object o);
	}
	}
