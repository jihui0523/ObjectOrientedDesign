
public class Date {
	private int year;
	private int month;
	private int day;

	public void setYear(int y) {
		year=y;
	}

	public void setMonth(int m) {
		month=m;
	}

	public void setDay(int d) {
		day=d;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
	
	public String toString() {
		return getYear() + "년 " + getMonth() + "월 " + getDay() + "일";
	}
}
