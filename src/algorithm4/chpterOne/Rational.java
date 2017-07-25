package algorithm4.chpterOne;

import edu.princeton.cs.algs4.StdOut;

public class Rational {
	@Override
	public String toString() {
		return numetator+"/"+denominator;
	}

	private long numetator;
	private long denominator;
	
	public Rational(long numetator, long denominator) {
		this.setNumetator(numetator/gcd(numetator, denominator));
		this.setDenominator(denominator/gcd(numetator, denominator));
	}
	
	public static long gcd(long suma, long sumb) {
		if (sumb == 0) return suma;
		long r = suma % sumb;
		return gcd(sumb, r);
	}
	
	public Rational plus(Rational b) {
		long suma = this.numetator * b.getDenominator() + 
				this.denominator * b.getNumetator();
		long sumb = this.denominator * b.getDenominator();
		return new Rational(suma, sumb);
	}
	
	public Rational minus(Rational b) {
		long suma = this.numetator * b.getDenominator() - 
				this.denominator * b.getNumetator();
		long sumb = this.denominator * b.getDenominator();
		return new Rational(suma, sumb);
	}
	
	public Rational times(Rational b) {
		long suma = this.numetator * b.getNumetator();
		long sumb = this.denominator * b.getDenominator();
		return new Rational(suma, sumb);
	}
	
	public Rational devides(Rational b) {
		long suma = this.numetator * b.getDenominator();
		long sumb = this.denominator * b.getNumetator();
		return new Rational(suma, sumb);
	}
	
	public boolean equals(Rational b) {
		if (this.denominator == b.getDenominator() && this.numetator == b.getNumetator())
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Rational a = new Rational(456465, 5665467);
		Rational b = new Rational(41564, 45456);
		StdOut.println(a);
		StdOut.println(b);
	}

	public long getNumetator() {
		return numetator;
	}

	public void setNumetator(long numetator) {
		this.numetator = numetator;
	}

	public long getDenominator() {
		return denominator;
	}

	public void setDenominator(long denominator) {
		this.denominator = denominator;
	}



}
