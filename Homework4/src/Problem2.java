/*
 * Keven Disen
 * ID: 111433335
 * December 5, 2018
 * CSE 114 Homework#4
 */
public class Problem2 {
	abstract static class Shape{
			private String shape;
		
			public Shape(String shape) {
				this.shape = shape;
			}
			public String getShape() {
				return shape;
			}
	
		 public abstract class TwoDimensionalShape extends Shape{	
			public TwoDimensionalShape(String shape) {
				super(shape);
			}
			public abstract double getArea() ;
		}
		 public abstract class ThreeDimensionalShape extends Shape{	
			public ThreeDimensionalShape(String shape) {
				super(shape);
			}
			public abstract double getArea();
			public abstract double getVolume();
		}
		 class Circle extends TwoDimensionalShape{
			private double radius;
			String shapeName;
			 public Circle(String shapeName, double radius) {
				 super(shapeName);
				 this.radius = radius;
			}
			 public double getRadius() {
				 return radius;
			 }
			 public void setRadius( double radius) {
				 this.radius = radius;
			 }
			public double getArea() {
				double area = Math.PI*Math.pow(radius, 2);
				return area;
			}
			public String toString() {
				return getShape() + ":" + "\nRadius:" + radius + "\nArea:" + getArea();
			}
		}
		public class Square extends TwoDimensionalShape{
			private double side;
			String shapeName;
			public Square(String shapeName, double side) {
				super(shapeName);
				this.side = side;
			}
			public double getSide() {
				return side;
			}
			public void setSide(double side) {
				this.side = side;
			}
			public double getArea() {
				double area = Math.pow(side, 2);
				return area;
			}
			public String toString() {
				return getShape() + ":" + "\nSide:" + getSide() + "\nArea:" + getArea();		
				}
		}
		 class Triangle extends TwoDimensionalShape{
			 private double side1, side2, side3;
			 String shapeName;
			public Triangle(String shapeName, int side1, int side2, int side3) {
				super(shapeName);
				this.side1 = side1;
				this.side2 = side2;
				this.side3 = side3;
			}
			public double getSide1() {
				return side1;
			}
			public void setSide1(double side1) {
				this.side1 = side1;
			}
			public double getSide2() {
				return side2;
			}
			public void setSide2(double side2) {
				this.side2 = side2;
			}
			public double getSide3() {
				return side3;
			}
			public void setSide3(double side3) {
				this.side3 = side3;
			}
			public double getArea() {
				double area = (side1+side2+side3)/2;
				return Math.sqrt(area * (area - side1) * (area - side2) * (area - side3));
			}
			public String toString() {
				return getShape() + ":" + "\nSide 1:" + getSide1() + "\nSide 2:" + getSide2() + "\nSide3:" + getSide3() + "\nArea:" + getArea();
			}
		}
		 class Sphere extends ThreeDimensionalShape{
			private String shapeName;
			private double radius;
			 public Sphere(String shapeName, double radius) {
				super(shapeName);
				this.radius = radius;
			}
			 public double getRadius() {
				 return radius;
			 }
			 public void setRadius(double radius) {
				 this.radius = radius;
			 }
			public double getArea() {
				double area = (4*Math.PI*Math.pow(radius, 2));
				return area;
			}
			public double getVolume() {
				double volume = (4/3)*(Math.PI*Math.pow(radius, 3));
				return volume;
			}
			public String toString() {
				return getShape() + ":" + "\nRadius:" + getRadius() + "\nArea:" + getArea() + "\nVolume:" + getVolume();
			}
		}
		 class Cube extends ThreeDimensionalShape{
			 String shapeName;
			 private double side;
			public Cube(String shapeName, double side) {
				super(shapeName);
				this.side = side;
			}
			public double getSide() {
				return side;
			}
			public void setSide(double side) {
				this.side = side;
			}
			public double getArea() {
				double area = 6*Math.pow(side, 2);
				return area;
			}
			public double getVolume() {
				double volume = Math.pow(side, 3);
				return volume;
			}
			public String toString() {
				return getShape() + ":" + "\nSide:" + getSide() + "\nArea:" + getArea() + "\nVolume:" + getVolume();
			}
		}
		 class Tetrahedron extends ThreeDimensionalShape{
			 String shapeName;
			 private double side;
			public Tetrahedron(String shapeName, double side) {
				super(shapeName);
				this.side = side;
			}
			public double getSide() {
				return side;
			}
			public void setSide() {
				this.side = side;
			}
			public double getArea() {
				double area = (Math.sqrt(3)*Math.pow(side, 3));
				return area;
			}
			public double getVolume() {
				double volume = ((Math.pow(side, 3))/(6*Math.sqrt(2)));
				return volume;
			}
			public String toString() {
				return getShape() + ":" + "\nSide:" + getSide() + "\nArea" + getArea() + "\nVolume:" + getVolume() ;
			}
		}
	
	
	public static void main(String[] args) {
		Shape[] shapes = new Shape[6];
		shapes[0] = new Circle("Circle",4);
		shapes[1] = new Square("Square",3);
		shapes[2] = new Triangle("Triangle", 3, 4, 5);
		shapes[3] = new Sphere("Sphere",5);
		shapes[4] = new Cube("Cube",3);
		shapes[5] = new Tetrahedron("Tetrahedron",5);
			for(Shape s:shapes) {
			System.out.println(s.toString());
			System.out.println("\n");
						
			}
		}
	

	}
	}
	
	


