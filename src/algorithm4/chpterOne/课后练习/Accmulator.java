package algorithm4.chpterOne.课后练习;



public class Accmulator {
	private double m;
	private double s;
	private int N;
	
	public void addDataValue(double x) {
		N++;
		s = s+1.0*(N-1)/N*(x-m)*(x-m);
		m = m + (x-m) / N;
	}
	
	public double mean() {
		return m;
	}
	
	public double var() {
		return s/(N-1);
	}
	
	public double stddev() {
		return Math.sqrt(this.var());
	}
	
	public static void main(String[] args) {

	} 

}
