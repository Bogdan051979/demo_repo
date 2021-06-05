package automation;

public class FirstApp {

	public static void main(String[] args) {
		// System.out.println("Hello world");

		// String s1 = "Ana";
		// String s2 = "mere.";
		// int x = 10;

		// System.out.println(s1 + " are " + x + " " + s2);

		/*
		 * args[0] = "persoane.txt"; int numarArgumente = args.length; System.out.println(numarArgumente);
		 */

		/*
		 * if (args.length == 0) {
		 * 
		 * System.out.println("Numar insuficient de argumente!"); System.exit(-1); } String nume = args[0]; String prenume; if (args.length >= 1) { prenume = args[1]; } else { prenume = ""; } System.out.println("Salut " + nume +
		 * " " + prenume);
		 */
		double numar = Double.parseDouble(args[0]);
		int putere = Integer.parseInt(args[1]);

		System.out.println("Rezultat=" + Math.pow(numar, putere));
	}
}