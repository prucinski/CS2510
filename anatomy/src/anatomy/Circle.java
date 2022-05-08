package anatomy;
import java.util.*;

public class Circle implements GeometricalObject{
	public int radius = 0;
	public Point origin;
	public static List<Circle> circleList = new ArrayList<Circle>();
	public Circle() {
		origin = new Point(0, 0);
		circleList.add(this);
	}
	public Circle(Point p) {
		origin = p;
		circleList.add(this);
	}
	public Circle(int r) {
		radius = r;
		circleList.add(this);
	}
	public Circle(Point p, int r) {
		origin = p;
		radius = r;
		circleList.add(this);
	}
	public double getArea() {
		return Math.PI*Math.pow(radius,2);
	}
	public void move(int x, int y) {
		origin.setX(x);
		origin.setY(y);
	}
}
