package anatomy;
import java.util.*;


public class Square extends Rectangle implements GeometricalObject {
	public Square(Point p, int side) {
		this.origin = p;
		this.height = side;
		this.width = side;
		squareList.add(this);
	}
	public static List<Square> squareList = new ArrayList<Square>();
}
