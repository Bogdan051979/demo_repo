package automation.oop;

/** A public Library class */
public class Library {

	public static void main(String[] args) {
		Author author = new Author("Richard J.Evans", "Evans.Richard@yahoo.com");// construct an author's instance
		System.out.println(author); // author's toString()

		Book book = new Book("The third Reich", 2003, author, 25.99);
		System.out.println(book);

	}

}
