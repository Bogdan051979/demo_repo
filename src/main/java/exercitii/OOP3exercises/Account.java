package exercitii.OOP3exercises;

public class Account {
	// private instance variables
	private int number;
	private double balance;

	// constructors overloaded
	// constructs an Account instance with the given number and initial balance of 0
	public Account(int number) {
		this.number = number;
		this.balance = 0.0;
	}

	// constructs an Account instance with the given number and initial balance
	public Account(int number, double balance) {
		this.number = number;
		this.balance = balance;
	}

	// the public getters/setters for the private instance variables
	// no setter for number because it is not designed to be changed
	// no setter for balance as it is changed via credit() and debit()
	// returns the number
	public int getNumber() {
		return this.number;
	}

	// returns the balance
	public double getBalance() {
		return this.balance;
	}

	// returns a string description of this instance
	@Override
	public String toString() {
		// use built-in function System.format() to form a formated String
		return String.format("Account[number=%d,balance=$%.2f]", number, balance);
	}

	// add the given amount to the balance
	public void credit(double amount) {
		this.balance += amount;// balance = balance + amount
	}

	// substract the given amount from balance, if balance >= amount
	public void debit(double amount) {
		if (balance >= amount) {
			this.balance -= amount;// balance = balance - amount
		} else {
			System.out.println("amount exceeded");
		}
	}

	// transfer the given amount to Account another, if balance >= amount
	public void transferTo(double amount, Account another) {
		if (balance >= amount) {
			this.balance -= amount;
			another.balance += amount;
		} else {
			System.out.println("amount exceeded");
		}
	}
}
