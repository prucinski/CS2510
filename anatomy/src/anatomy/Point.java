package anatomy;

public class Point {
	 private int x = 0;
	 private int y = 0;
	 // a constructor!
	 public Point(int a, int b) {
	 x = a;
	 y = b;
	 }
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	static double CalculateDistance(Point Point1, Point Point2) {
		double distance = Math.sqrt(Math.pow(Point1.getX() - Point2.getX(), 2) + Math.pow(Point1.getY() - Point2.getY(), 2));
		return distance;
	}
}

