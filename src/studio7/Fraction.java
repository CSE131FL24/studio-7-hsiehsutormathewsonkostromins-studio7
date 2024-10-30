package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int initNumerator, int initDenominator) {
		numerator = initNumerator;
		denominator = initDenominator;
	}
	
	public String createFraction(int initNumerator, int initDenominator) {
		return initNumerator + "/" + initDenominator;
	}
	
	public String multiply(Fraction one, Fraction two) {
		int top = (one.getNumerator() * two.getNumerator());
		int bottom = (one.getDenominator() * two.getDenominator());
		return createFraction(top, bottom);
	}
	
	public String add(Fraction one, Fraction two) {
		int top = (one.getNumerator() * two.getDenominator()) + (two.getNumerator() * one.getDenominator());
		int bottom = one.getDenominator() * two.getDenominator();
		return createFraction(top, bottom);
	}
	
	public String rep(Fraction one) {
		int top = one.getDenominator();
		int bottom = one.getNumerator();
		return createFraction(top, bottom);
	}
	
	public String simplify(Fraction one) {
		int d = gcd(one.getNumerator(), one.getDenominator());
		return createFraction(one.getNumerator() / d, one.getDenominator() / d);
	}
	
	public static int gcd(int p, int q) {
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}
	
	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public static void main(String[] args) {
		Fraction one = new Fraction(2, 4);
		Fraction two = new Fraction(1, 3);
		System.out.println(one.simplify(one));
		System.out.println(one.multiply(one, two));
		System.out.println(one.add(one, two));
		System.out.println(one.rep(one));
	}
}
