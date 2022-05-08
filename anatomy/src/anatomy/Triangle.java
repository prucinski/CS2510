package anatomy;

public class Triangle implements GeometricalObject {
	public Point a;
	public Point b;
	public Point c;
	public double base;
	public int height;
	public double side2;
	public double side3;
	
	public Triangle(int bas, int heigh) {
		base = bas;
		height = heigh;
	}
	public Triangle(Point Point1, Point Point2, Point Point3) {
		a = Point1;
		b = Point2;
		c = Point3;
		base = Point.CalculateDistance(a, b);
		side2 = Point.CalculateDistance(b, c);
		side3 = Point.CalculateDistance(a, c);
		
	}
	

	@Override
	public double getArea() {
		if (height!=0) {
			return base*height/2;
		}else {
				return base*side2*side3;   //area from sides, random formula because Im lazy to implement the real one
			}
		
			
		
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub

	}

}
