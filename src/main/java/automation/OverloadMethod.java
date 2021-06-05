package automation;

/**
 * 
 * @author 40756
 *
 */

public class OverloadMethod {

	public static void main(String[] args) {
		int length = 7;
		drawSquare(length);
		drawSquare((short) 5);
	}

	/**
	 * Draws a square using one length
	 * 
	 * @param length
	 *        length of the square
	 */
	public static void drawSquare(int length) {
		for (int i = 1; i <= length; i++) {
			for (int j = 1; j <= length; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void drawSquare(short length) {
		for (int i = 1; i <= length; i++) {
			for (int j = 1; j <= length; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}

	}

}
