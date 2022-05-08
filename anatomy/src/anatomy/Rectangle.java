package anatomy;

public class Rectangle implements GeometricalObject{
    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public Rectangle() {
	origin = new Point(0, 0);
    }
    public Rectangle(Point p) {
	origin = p;
    }
    public Rectangle(int w, int h) {
	origin = new Point(0, 0);
	width = w;
	height = h;
    }
    public Rectangle(Point p, int w, int h) {
	origin = p;
	width = w;
	height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
	origin.setX(x);
	origin.setY(y);
    }

    // a method for computing the area of the rectangle
    public double getArea() {
	return width * height;
    }
}