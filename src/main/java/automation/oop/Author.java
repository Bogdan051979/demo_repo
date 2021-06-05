package automation.oop;

/** a class called Author with two public instance variables */
public class Author {
	private String name;
	private String email;

	/** A constructor to initialize the name and email */
	public Author(String name, String email) {
		this.name = name;
		this.email = email;
	}

	// public getters
	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	/** A toString() method that returns Author's name and email */
	@Override
	public String toString() {
		return "Author " + name + " email " + email;
	}

}
