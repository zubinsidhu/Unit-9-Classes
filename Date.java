
public class Date {

	private int year;
	private int month;
	private int day;
	
	public Date(int y, int m, int d) {
		this.year = y;
		this.month = m;
		this.day = d;
	}
	public Date(int m, int d) {
		year = 2022;
		month = m;
		day = d;
	}
	
	public int getYear() { return year; }
	public int getMonth() { return month; }
	public int getDay() { return day; }
	
	public void setYear(int newYear) { year = newYear; }
	public void setMonth(int newMonth) { month = newMonth; }
	public void setDay(int newDay) { day = newDay; }
	
	private static boolean isLeapYear(int y) {
		return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
	}
	
	public int getNumberOfDays() {
		if (month == 2) {
			if (isLeapYear(year)) return 29;
			else return 28;
		}
		else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
		else return 30;
	}
	
	public int compareTo(Date other) {
		if (month < other.month || month == other.month && day < other.day) return -1;
		else if (month == other.month && day == other.day) return 0;
		else return 1;
	}
	
	public String toString() {
		return month + "/" + day + "/" + year;
	}
	
}
