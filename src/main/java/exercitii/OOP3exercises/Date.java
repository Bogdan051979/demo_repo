package exercitii.OOP3exercises;

public class Date {
	// private class variables
	private int year, month, day;

	// construct a Date instance with the given year,month and day.
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// the public getters/setters for the private variables
	// return the year
	public int getYear() {
		return this.year;
	}

	// return the month
	public int getMonth() {
		return this.month;
	}

	// return the day
	public int getDay() {
		return this.day;
	}

	// set the year.No input validation
	public void setYear(int year) {
		this.year = year;
	}

	// set the month. No input validation
	public void setMonth(int month) {
		this.month = month;
	}

	// set the day. No input validation
	public void setDay(int day) {
		this.day = day;
	}

	// returns a descriptive toString() in the form "MM/DD/YYYY" with leading zero
	@Override
	public String toString() {
		// use built in function String.format() to form a formated String
		return String.format("%02d/%02d/%4d", month, day, year);
		// specifier "0" to print leading zeros
	}

	// sets year, month and day. No input validation
	public void setDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

}
