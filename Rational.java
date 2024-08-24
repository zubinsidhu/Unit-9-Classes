
public class Rational {

	private int numerator;
	private int denominator = 1;
	
	public Rational() {  }
	public Rational(int n, int d) {
		if (d == 0) {
			System.out.println("Denominator can't be 0");
			System.exit(0);
		}
		numerator = n;
		denominator = d;
	}
	
	public int getNumerator() { return numerator; }
	public int getDenominator() { return denominator; }
	public void setNumerator(int newNumerator) { numerator = newNumerator; }
	public void setDenominator(int newDenominator) { denominator = newDenominator; }
	
	private static int getGCD(int n1, int n2) {
		n1 = Math.abs(n1);
		n2 = Math.abs(n2);
		if (n1 == 0) { return n2; }
		if (n2 == 0) { return n1; }
		while (n1 != n2) {
			if (n1 > n2) { n1 = n1 - n2; }
			else n2 = n2 - n1;
		}
		return n1;
	}
	private void reduce() {
		int g = getGCD(numerator, denominator);
		if (g != 1) {
			numerator = numerator / g;
			denominator = denominator / g;
		}
	}
	
	public static Rational add(Rational r1, Rational r2) {
		int n = r1.numerator * r2.denominator + r2.numerator * r1.denominator;
		int d = r1.denominator * r2.denominator;
		Rational r = new Rational(n, d);
		r.reduce();
		return r;
	}
	public static Rational subtract(Rational r1, Rational r2) {
		int n = r1.numerator * r2.denominator - r2.numerator * r1.denominator;
		int d = r1.denominator * r2.denominator;
		Rational r = new Rational(n, d);
		r.reduce();
		return r;
	}
	public static Rational multiply(Rational r1, Rational r2) {
		int n = r1.numerator  * r2.numerator;
		int d = r1.denominator * r2.denominator;
		Rational r = new Rational(n, d);
		r.reduce();
		return r;
	}
	public static Rational division(Rational r1, Rational r2) {
		int n = r1.numerator * r2.denominator;
		int d = r1.denominator * r2.numerator;
		Rational r = new Rational(n, d);
		r.reduce();
		return r;
	}
	
	public String toString() {
		if (numerator == 0) { return "0"; }
		else if (denominator == 1) { return "" + numerator; }
		else return numerator + "/" + denominator;
	}
}
