/*
 * Keven Disen
 * ID: 111433335
 * November 5, 2018
 * CSE 114 Lab#15 part2
 */
public class Lab15part2 {
	public static void main(String[] args) {
		RegularPolygon rp1 = new RegularPolygon();
		System.out.println("The perimeter of the first polygon is " + rp1.getPerimeter());
		System.out.println("The area of the first polygon is " + rp1.getArea());

		System.out.println();
		
		RegularPolygon rp2 = new RegularPolygon(6,4);
		System.out.println("The perimeter of the second polygon is " + rp2.getPerimeter());
		System.out.println("The area of the second polygon is " + rp2.getArea());
		
		System.out.println();
		
		RegularPolygon rp3 = new RegularPolygon(10,4,5.6,7.8);
		System.out.println("The perimeter of the third polygon is " + rp3.getPerimeter());
		System.out.println("The area of the third polygon is " + rp3.getArea());

	}
	
	 static class RegularPolygon{
		private int n;
		private double side;
		private double x;
		private double y;
		
		//default values
		public RegularPolygon() {
			n = 3;
			side = 1;
			x = 0;
			y = 0;
		}
		public RegularPolygon(int numSide, double lengthSide) {
			n = numSide;
			side = lengthSide;
			x=0;
			y=0;
		}
		public RegularPolygon(int num, double sideLen, double xcoor, double ycoor) {
			n = num;
			side = sideLen;
			x = xcoor;
			y = ycoor;
		}
		public int getN() {
			return n;
		}
		public void setN() {
			this.n= n;
		}
		public double getSide() {
			return side;
		}
		public void setSide() {
			this.side = side;
		}
		public double getX() {
			return x;
		}
		public void setX() {
			this.x = x;
		}
		public double getY() {
			return y;
		}
		public void setY() {
			this.y = y;
		}
		public double getPerimeter() {
			double perimeter = n*side;
			return perimeter;
		}
		public double getArea() {
			double area = ((n*(Math.pow(side, 2)))/(4*(Math.tan(Math.PI/n))));
			return area;
		}

	}
}
