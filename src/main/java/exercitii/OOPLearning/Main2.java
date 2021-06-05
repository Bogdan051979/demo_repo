package exercitii.OOPLearning;

public class Main2 {

	// cand metoda nu este statica, ci dinamica, apelarea ei in main
	// se face prin crearea de obiecte a clasei respective, obiectul creat apeleaza metoda
	public void square(int a) {
		int square = a * a;
		System.out.println("Square is: " + square);
	}

	public static void main(String[] args) {

		Main2 m = new Main2();

		m.square(2);
	}
}
