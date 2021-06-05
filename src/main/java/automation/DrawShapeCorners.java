package automation;

public class DrawShapeCorners {

	public static void main(String[] args) {
		// drawShapeCorners(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		// acelasi lucru cu cei mai jos, doar ca in Run Configuration la argumente vom introduce datele
		drawShapeCorners(1, 5);
	}

	public static void drawShapeCorners(int height, int width) {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				if (i == 1 && j == 1 || i == 1 && j == width || i == height && j == 1 || i == height && j == width) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
		}
		System.out.println("");

	}

}
