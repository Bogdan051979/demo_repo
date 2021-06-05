package automation.collections;

public class TestBrowser {

	public static void main(String[] args) {
		Browser b = Browser.FIREFOX;
		Browser b2 = Browser.IE;

		String browserStr = b.name();// returneaza stringul aferent acestei constant.
		// adica String returneaza FIREFOX care acuma nu mai este de tip Browser

		int browserSt = b.ordinal();// reprezinta pozitia pe care se afla acea constanta

		Browser browser = Browser.valueOf("FIREFOX");// se poate pasa un String care sa fie transformat in
		// enum.Daca acel String nu exista, va rezulta o eroare

		/** se poate obtine un Array cu toate valorile din Enum */
		Browser[] browserArray = Browser.values();
		System.out.println(b.getVersion());
		System.out.println(b2.getVersion());
		System.out.println(b);
	}

}
