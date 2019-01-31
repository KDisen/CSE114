 abstract class GemetricObject {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;
  protected GemetricObject() {
    dateCreated = new java.util.Date();
  }
  protected GemetricObject(String color, boolean filled) {
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
class Square extends GemetricObject implements Colorable{
	private int side;
	public Square() {
		side = 0;
	}
	public Square(int s) {
		this.side = s;
	}
	public void setSide(int s) {
		this.side = s;
	}
	public int getSide() {
		return side;
	}
	@Override
	public String howToColor() {
		return "Color all 4 sides for Square";
	}
	@Override
	public double getArea() {
		return Math.pow(side, 2);
	}
	@Override
	public double getPerimeter() {
		return side*4;
	}
}
class Cirle extends GemetricObject implements Colorable {
	  private double radius;
	  public Cirle() {   }
	  public Cirle(double radius) {
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
	@Override
	public String howToColor() {
		return "Color the Circle";
	}
	}
class Rectangle extends GemetricObject implements Colorable {
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
	public String howToColor() {
		return "Color all 4 sides for Rectangle";
	}
	}
class Triangle extends GemetricObject implements Colorable{
	private double base;
	private double height;
	private double side1;
	private double side2;
	public Triangle() {
	}
	public Triangle(double base, double height, double side1, double side2) {
		this.base = base;
		this.height = height;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getBase() {
		return base;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide1() {
		return side1;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide2() {
		return side2;
	}
	@Override
	public double getArea() {
		return (base*height)/2;
	}
	@Override
	public double getPerimeter() {
		return base + side1 + side2;
	}
	@Override
	public String howToColor() {
		return "Color all 3 sides for Triangle";
	}
	
}
interface Colorable{
	public abstract String howToColor();
}

public class Lab23part2 {
	public static void main(String[] args) {
		GemetricObject[] shapes = new GemetricObject[4];
		shapes[0] = new Cirle(4);
		shapes[1] = new Square(2);
		shapes[2] = new Rectangle(3,4);
		shapes[3] = new Triangle(5,6,3,4);
		for(int i = 0; i<shapes.length; i++) {
			System.out.println("Area is " + shapes[i].getArea());
			if(shapes[i] instanceof Colorable) {
				System.out.println(((Colorable)shapes[i]).howToColor());
			}
			System.out.println();
		}
	}
}
