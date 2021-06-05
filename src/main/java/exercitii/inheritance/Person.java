package exercitii.inheritance;

public class Person {

	/** private instance variables */
	private String name;
	private String address;

	/** Construct a Person instance with the given name and address */
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	/** returns the name */
	public String getName() {
		return this.name;
	}

	/** returns the address */
	public String getAddress() {
		return this.address;
	}

	/** sets the address */
	public void setAddress(String address) {
		this.address = address;
	}

	/** returns a self descriptive String in form of "name(address)" */
	@Override
	public String toString() {
		return name + " (" + address + " )";
	}
}
