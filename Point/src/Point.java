
public class Point {

	private double x;
	private double y;

	public double distanceFromOrigin() {
		return Math.sqrt(x * x + y * y);
	}
	public Point(double a, double b) { // constructor
		x = a;
		y = b;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
}
