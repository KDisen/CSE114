import java.util.Scanner;
 class GeometricObject {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;
  public GeometricObject() {
    dateCreated = new java.util.Date();
  }
  public GeometricObject(String color, boolean filled) {
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

}
 public class Lab17part1{
		public static void main(String[] args) {
			Scanner scnr = new Scanner(System.in);
			System.out.println("Enter three sides: ");
			double s1 = scnr.nextDouble();
			double s2 = scnr.nextDouble();
			double s3 = scnr.nextDouble();
			System.out.println("Enter a color: ");
			String st = scnr.next();
			System.out.println("Enter a boolean value");
			boolean bool = scnr.nextBoolean();
			Triangle tri = new Triangle(s1,s2,s3);
			System.out.println("Are of the Triangle: " + tri.getArea());
			System.out.println("Perimeter of the Triangle: " + tri.getPerimeter());
			System.out.println("Color of the Triangle: " + tri.getColor());
			if(bool==true) System.out.println("triangle is filled");
			else System.out.println("Triangle is not filled");
		}
 }
 class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	public Triangle(double sideOne, double sideTwo, double sideThree ) {
		side1 = sideOne;
		side2 = sideTwo;
		side3 = sideThree;
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public double getArea() {
		double s = (getSide1()+getSide2()+getSide3())/2;
		double area = Math.sqrt(s*(s-getSide1())*(s-getSide2())*(s-getSide3()));
		return area;
	}
	public double getPerimeter() {
		return (getSide1()+getSide2()+getSide3());
	}
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}

}
	