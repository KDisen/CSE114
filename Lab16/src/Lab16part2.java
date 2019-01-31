import java.util.*;
public class Lab16part2 {

	public static void main(String[] args) {
		Scanner scnr  = new Scanner(System.in);
		System.out.println("Enter a,b,c,d,e,f: ");
		double a = scnr.nextDouble();
		double b = scnr.nextDouble();
		double c = scnr.nextDouble();
		double d = scnr.nextDouble();
		double e = scnr.nextDouble();
		double f = scnr.nextDouble();
		LinearEquation leq = new LinearEquation(a,b,c,d,e,f);
		//if isSolvable
		if(leq.isSolvable()==true) {
			System.out.println("The equation has no solution");
		}else {
			System.out.println("X is " + leq.getX() + " and Y is " + leq.getY());
		}
	}
	static class LinearEquation{
		private double a,b,c,d,e,f;
		public LinearEquation(double A, double B, double C, double D, double E, double F) {
			a = A;
			b = B;
			c = C;
			d = D;
			e = E;
			f = F;
		}//getters for each variable
		public double getA() {
			return a;
		}
		public double getB() {
			return b;
		}
		public double getC() {
			return c;
		}
		public double getD() {
			return d;
		}
		public double getE() {
			return e;
		}
		public double getF() {
			return f;
		}
		//isSolvable boolean
		public boolean isSolvable() {
			boolean s = true;
			if((a*d)-(b*c)==0)  s = true;
			else  s = false;
			return s;
		}
		
		//get x and y methods
		public double getX() {
			double x = ((e*d)-(b*f))/((a*d)-b*c);
			return x;
		}
		public double getY() {
			double y = ((a*f)-(e*c))/((a*d)-b*c);
			return y;
		}
		
	}
}
