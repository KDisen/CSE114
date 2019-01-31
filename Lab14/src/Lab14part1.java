/*
 * Keven Disen
 * ID: 111433335
 * October 31, 2018
 * CSE 114 Lab# 14 part 1
 */
import java.util.*;
public class Lab14part1 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a");
		double a = scnr.nextDouble();
		System.out.println("Enter b");
		double b = scnr.nextDouble();
		System.out.println("Enter c");
		double c = scnr.nextDouble();
		
		QuadraticEquation eq = new QuadraticEquation(a,b,c);
		if(eq.getDiscriminant()>0) {
			System.out.println("The equation has 2 roots: " + eq.getRoot1() + " and "+ eq.getRoot2());
		}
		else if(eq.getDiscriminant()==0) {
			System.out.println("The equation only has 1 root: " + eq.getRoot1());
		}
		else {
			System.out.println("The equation has no roots.");
		}
	
		
		
	}
}
class QuadraticEquation{
	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation(double A, double B, double C) {
		a = A;
		b = B;
		c = C;
	}
	//method to get values
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getDiscriminant() {
		double discriminant = Math.pow(b, 2) - 4*a*c;
		return discriminant;
	}
	public double getRoot1() {
		double r1 = (-b + Math.sqrt(getDiscriminant()))/(2*a);
		return r1;
	}
	public double getRoot2() {
		double r2 = (-b - Math.sqrt(getDiscriminant()))/(2*a);
		return r2;
	}
	}
