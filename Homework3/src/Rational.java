import java.util.*;
public class Rational {

	private int numerator;
	private int denominator;
	
	//deafult values
	public Rational() {
		numerator = 1;
		denominator = 2;
	}
	public Rational(int numerator, int denominator) {
	       int g =gcd(numerator,denominator);
	       this.numerator = numerator/g;
	       this.denominator = denominator/g;
	}
	 public static int gcd(int a, int b){
	        if(b==0)return a;
	        return gcd(b,a%b);
	    }
	public double getNumerator() {
		return numerator;
	}
	public double getDenominator() {
		return denominator;
	}

	public Rational add(Rational a) {
		if(getDenominator()==a.getDenominator()) {
			int n = (int) (a.getNumerator()+getNumerator());
			int d = (int) a.getDenominator();
			return new Rational(n,d);
		}else {
		int d = (int) (getDenominator() * a.getDenominator());
		int n = (int) ((getNumerator() * a.getDenominator()) + (a.getNumerator()*getDenominator()));
		return new Rational(n,d);
	}
		
	}
	public Rational subtract(Rational s) {
		if(getDenominator()==s.getDenominator()) {
			int n = (int) (s.getNumerator()-getNumerator());
			int d = (int) s.getDenominator();
			return new Rational(n,d);
		}else {
		int d = (int) (getDenominator() * s.getDenominator());
		int n = (int) ((getNumerator() * s.getDenominator()) - (s.getNumerator()*getDenominator()));
		return new Rational(n,d);
	}
	}
	public Rational multiply(Rational m) {
		int d= (int) (getDenominator() * m.getDenominator());
		int n = (int) (getNumerator() * m.getNumerator());
		return new Rational(n,d);

	}
	public Rational divide(Rational di) {
		int d = (int) (getDenominator() * di.getNumerator());
		int n = (int) (getNumerator() * di.getDenominator());
		return new Rational(n,d);

	}

	public String toString(){
		return ( + numerator + "/" + denominator);
	}
	public static void main(String[] args) {
		Scanner scnr  = new Scanner(System.in);
		System.out.println("Enter numerator for the first rational number: ");
		int n1 = scnr.nextInt();
		System.out.println("Enter a non-zero denominator for the first rational number:");
		int d1 = scnr.nextInt();
		Rational rational1 = new Rational(n1,d1);
		
		System.out.println("Enter numerator for the second rational number: ");
		int n2 = scnr.nextInt();
		System.out.println("Enter a non-zero denominator for the second rational number:");
		int d2 = scnr.nextInt();
		Rational rational2 = new Rational(n2,d2);
		
		System.out.println("First rational number is: " + rational1.toString());
		System.out.println("Second rational numer is: " + rational2.toString());
		System.out.println("Addition of the rational numbers is: " + rational1.add(rational2));
		System.out.println("Subtraction of the rational numbers is: " + rational1.subtract(rational2));
		System.out.println("Multiplication of the rational numbers is: " + rational1.multiply(rational2));
		System.out.println("Division of the rational numbers is: " + rational1.divide(rational2));
	}

}
