package MA3;

public class RegularPolygonTest {
	public static void main(String[] args) {
	
	// Create array of four regular polygon objects
	RegularPolygon[] array = new RegularPolygon[4]; 
	array[0] = new RegularPolygon(3, 10.0);
	array[1] = new RegularPolygon(6, 7.5);
	array[2] = new RegularPolygon(8, 3.5);
	array[3] = new RegularPolygon(12, 4.0);
	
	
	// Display string representation of each object in array
	for (int i=0; i < array.length ; i++) {
		System.out.println(array[i].toString() + ", Perimeter: " + array[i].getPerimeter() + ", Area: " + array[i].getArea());
	}
	
	
	// Display string representation of object with smallest perimeter
	int objectWithSmallestPerimeter = 0;
	for (int i=1; i < array.length ; i++) {
		if (array[i].getPerimeter() < array[i-1].getPerimeter()) {
			objectWithSmallestPerimeter = i;
		}
	}
	System.out.println("");
	System.out.println("Polygon with smallest perimeter:");
	System.out.println(array[objectWithSmallestPerimeter].toString());
	
	
	// Display string representation of object with largest area
	int objectWithLargestArea = 0;
	for (int i=1; i < array.length ; i++) {
		if (array[i].getArea() > array[i-1].getArea()) {
			objectWithLargestArea = i;
		}
	}
	System.out.println("");
	System.out.println("Polygon with largest area:");
	System.out.println(array[objectWithLargestArea].toString());
	}
}
