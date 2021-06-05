package automation.oop;

/** A public class with four public instance variables */
public class Book {
	private String name;
	private int year;
	private Author author;
	private double price;

	/** A constructor to initialize the variables */
	public Book(String name, int year, Author author, double price) {

		this.name = name;
		this.year = year;
		this.author = author;
		this.price = price;
	}

	/** public getters */
	public String getName() {
		return this.name;
	}

	public Author getAuthor() {
		return this.author;
	}

	public Double getPrice() {
		return this.price;
	}

	public int getYear() {
		return this.year;
	}

	// A toString() method
	@Override
	public String toString() {
		return "Book " + name + "(" + price + " RON" + ")" + "," + " by " + author + "," + " published in " + year;
	}

}
