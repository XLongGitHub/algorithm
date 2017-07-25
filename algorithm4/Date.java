
public class Date {


	private final int month;
	private final int day;
	private final int year;
	
	public Date(int month, int day, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public Date(String s) {
		String[] fileds = s.split("/");
		month = Integer.parseInt(fileds[0]);
		day = Integer.parseInt(fileds[1]);
		year = Integer.parseInt(fileds[2]);
	}

	public static void main(String[] args) {
		
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}
	
	@Override
	public String toString() {
		return getMonth() + "/"+getDay()+"/"+getYear();
	}

	@Override
	public boolean equals(Object x) {
		if (this == x) return true;
		if (x == null) return false;
		if (this.getClass() != x.getClass()) return false;
		Date that = (Date)x;
		if (this.day != that.day) return false;
		if (this.month != that.month) return false;
		return true;
	}
}