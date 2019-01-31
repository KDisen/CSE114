import java.util.*;
public class Complex {

		public double imaginary;
		public double real;
		
		public Complex() {
			real = 1;
			imaginary = 1;
		}
		public Complex(double real, double imaginary) {
			this.real = real;
			this.imaginary = imaginary;
		}
		public double getReal() {
			return real;
		}
		public double getImaginary() {
			return imaginary;
		}
		public Complex add(Complex a) {
			double r = this.real + a.getReal();
			double i = this.imaginary + a.getImaginary();
			return new Complex(i,r);
		}
		public Complex subtract(Complex s) {
			double r = this.real - s.getReal();
			double i = this.imaginary - s.getImaginary();
			return new Complex(i,r);
		}
		public String toString() {
			return ( + real + "," + imaginary );
		}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter real part of the first complex number");
		double r1 = scnr.nextDouble();
		System.out.println("Enter imaginary part of the first complex number");
		double i1 = scnr.nextDouble();
		Complex com1 = new Complex(r1,i1);
		
		System.out.println("Enter real part of the second complex number");
		double r2 = scnr.nextDouble();
		System.out.println("Enter imaginary part of the second complex number");
		double i2 = scnr.nextDouble();
		Complex com2 = new Complex(r2,i2);
		
		System.out.println("First complex number is: " + "(" +com1.toString() + ")");
		System.out.println("Second complex number is: " + "("+com2.toString()+ ")");
		
		System.out.println("Addition of the complex numbers is: " + "("+com2.add(com1)+")");
		System.out.println("Subtraction of the complex numbers is: " + "("+com2.subtract(com1)+")");
	}
}