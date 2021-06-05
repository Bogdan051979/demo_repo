package exercitii.OOP3exercises;

public class TestAccount {

	public static void main(String[] args) {
		// test constructors and toString()
		Account a1 = new Account(5566);
		System.out.println(a1.toString());
		Account a2 = new Account(1234, 99.9);
		System.out.println(a2);

		// test getters
		System.out.println("The account number is :" + a1.getNumber());
		System.out.println("The account balance is: " + a1.getBalance());
		System.out.println("The new account number is:" + a2.getNumber());
		System.out.println("The new account balance is: " + a2.getBalance());

		// test credit(), debit() and transfer()
		a1.credit(11.1);
		System.out.println(a1);
		a1.debit(5.5);
		System.out.println(a1);
		a1.debit(500);// test debit() error
		System.out.println(a1);

		a2.transferTo(1.0, a1);
		System.out.println(a1);
		System.out.println(a2);

	}

}
