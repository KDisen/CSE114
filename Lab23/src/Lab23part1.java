abstract class GeometricObject {
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
class Circle extends GeometricObject {
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
	  public double getArea() {
	    return radius * radius * Math.PI;
	  }
	  public double getDiameter() {
	    return 2 * radius;
	  }
	  public double getPerimeter() {
	    return 2 * radius * Math.PI;
	  }
	  /* Print the circle info */
	  public void printCircle() {
	    System.out.println("The circle is created " + getDateCreated() +
	      " and the radius is " + radius);
	  }
	}

//***********************************************************\\
///Comparable Circle class extending Circle and implementing Comparable
class ComparableCircle extends Circle implements Comparable{
	public ComparableCircle(double radius) {
		super(radius);
	}
	//method to compare both objects
	public int compareTo(Object o) {
		//if returns 1, the first object is larger than the second one
		if(getArea() > ((ComparableCircle)o).getArea())
			return 1;
		//if returns 1, the first object is larger than the second one
		else if(getArea() < ((ComparableCircle)o).getArea())
			return -1;
		//if the same it will return 0
		else return 0;
	}
	
}
public class Lab23part1 {
	public static void main(String[] args) {
		System.out.println("Circle 1:");
		ComparableCircle c1 = new ComparableCircle(2);
		c1.printCircle();
		System.out.println("Circle 2:");
		ComparableCircle c2 = new ComparableCircle(3);
		c2.printCircle();
		
		System.out.println();
		
		int compare = c1.compareTo(c2);
		if(compare==1) System.out.println("C1 is larger than C2");
		else if(compare==-1) System.out.println("C2 is larger than C1");
		else System.out.println("C1 and C2 are the same size");
		}
}
