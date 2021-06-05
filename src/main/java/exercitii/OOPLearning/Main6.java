package exercitii.OOPLearning;

//Java parameterized constructor 

public class Main6 {
	String languages;

	public Main6(String lang) {
		this.languages = lang;
		System.out.println(languages + " Programimg Languages");
	}

	public static void main(String[] args) {
		Main6 m1 = new Main6("Java");
		Main6 m2 = new Main6("Phyton");
		Main6 m3 = new Main6("C#");

	}

}
