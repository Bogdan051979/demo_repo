package exercitii.OOP3exercises;

//The Time class models a time instance with second, minute and hour
// This class does not perform input validation for seconds,minute and hour
public class Time {
	// private variables members
	private int second, minute, hour;

	// constructors overloaded
	// constructs a Time instance with the given parameters
	public Time(int second, int minute, int hour) {// 1st constructor
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}

	// constructs a Time instance with default values
	public Time() {// 2nd constructor
		this.second = 45;
		this.minute = 25;
		this.hour = 15;
	}

	// getters/setters
	public int getSecond() {
		return this.second;
	}

	public int getMinute() {
		return this.minute;
	}

	public int getHour() {
		return this.hour;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	public void setTime(int second, int minute, int hour) {// no input validation
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}

	public Time nextSecond() {
		++second;
		if (second >= 60) {
			second = 0;
			++minute;
			if (minute >= 60) {
				minute = 0;
				++hour;
				if (hour >= 24) {
					hour = 0;
				}
			}
		}
		return this;
	}

}
