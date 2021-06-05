package exercitii.inheritance;

public class Point3D extends Point2D {
	private int z;

	/** Create a Point3D instance */
	public Point3D() {
		super();// x=y=0
		this.z = 0;
	}

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public int getZ() {
		return this.z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "(" + super.getX() + "," + super.getY() + "," + z + ")";
	}
}
