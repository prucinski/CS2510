package anatomy;
import java.util.*;

public class CreateObjectDemo {
	public static void main(String[] args) {
		
		// Declare and create a point object and two rectangle objects.
        Point originOne = new Point(23, 94);
        //declaring a triangle from points
        Point pointOne = new Point(0, 0);
        Point pointTwo = new Point(3, 4);
        Point pointThree = new Point(3,0);
        Triangle trianglePoint = new Triangle(pointOne, pointTwo, pointThree);
        System.out.println(trianglePoint.getArea());
        
        //declaring a triangle from sides
        Triangle triangleSides = new Triangle (3, 5);
        System.out.println(triangleSides.getArea());
        
        
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);
        Circle circleOne = new Circle(originOne, 1);
        Circle circleTwo = new Circle(12);
        Square squareOne = new Square(new Point(12,12), 3);
        Square squareTwo = new Square(new Point(0,0), 1);
        
        //checking if squares append correctly
        //System.out.println(Square.squareList);
        
        System.out.println(squaresInCircles(Square.squareList, Circle.circleList));
        
        
		
        // display rectOne's width, height, and area
        System.out.println("Width of rectOne: " + rectOne.width);
        System.out.println("Height of rectOne: " + rectOne.height);
        System.out.println("Area of rectOne: " + rectOne.getArea());
        System.out.println("Radius of circleOne: " + circleOne.radius);
        System.out.println("Area of circleOne: " + circleOne.getArea());
        System.out.println("Area of squareOne: " + squareOne.getArea());
        // set rectTwo's position
        rectTwo.origin = originOne;
        
        circleOne.move(5,6);
		
        // display rectTwo's position
        System.out.println("X Position of rectTwo: " + rectTwo.origin.getX());
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.getY());
        System.out.println(circleOne.origin.getX());
		
        // move rectTwo and display its new position
        rectTwo.move(40, 72);
        System.out.println("X Position of rectTwo: " + rectTwo.origin.getX());
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.getY());
    }
	//method returning a list of squares which fit into all circles
	public static List<Square> squaresInCircles(List<Square> squareList, List<Circle> circleList){
		int broken = 0;
		 List<Square> squaresThatFit= new ArrayList<Square>();
		for (int i = 0; i<squareList.size(); i++) {
			for(int j = 0; j<circleList.size(); j++) {
				if (Math.sqrt(2)* squareList.get(i).width >= 2*circleList.get(i).radius) {
					broken = 1;
					break;
				}}
			if(broken == 0) {
				squaresThatFit.add(squareList.get(i));
				
			}
			broken = 0;
		}
		return squaresThatFit;
	}
	

}
