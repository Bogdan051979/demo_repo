package automation.collections;

public enum Browser {
	CHROME, //
	FIREFOX, //
	IE("993"), //
	OPERA("978234.");// daca se merge mai departe, trebuie pus ";"

	/** se declara variabila de clasa */
	private String version;// acest version este disponibil pt fiecare din instantele
	// CHROME,FIREFOX,IE,OPERA

	/**
	 * se construieste un constructor care este TOT TIMPUL PRIVATE in paranteze adaugam variabila si tipul ei - parametrizare- se seteaza valori pt variabila respectiva la randurile 4,5,6,7 se primesc erori intrucat nu am
	 * specificat parametrii constructorului. Se poate fie sa-i specificam fie sa construim un constructor default ()
	 */

	Browser() {
		this.version = "1211";
	}

	Browser(String version) {
		this.version = version;
	}

	public String getVersion() {
		return version;
	}
}
