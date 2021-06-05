package automation.collections;

public class TestBrowser1 {

	public static void main(String[] args) {
		Browser1 b = Browser1.FIREFOX;
		Browser1 b2 = Browser1.IE;

		System.out.println(b2.getVersions());
		System.out.println(b.getVersions());

		/** pentru a reda ultima versiune dintr-o lista */

		String lastFFVersion = b.getVersions()
				.get(b.getVersions()
						.size() - 1);
		System.out.println(lastFFVersion);
	}

}
