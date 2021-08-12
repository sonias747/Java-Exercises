/* In an n-sided regular polygon, all sides have the same length and all angles have the same degree.
 * Implement a class named RegularPolygon that contains:
 * 
 * 	- A data field named n that defines the number of sides in the polygon (default value 3).
 *  - A data field named length that stores the length of each side (default value 1).
 *  - A no-arg constructor that creates a regular polygon with default values
 *  - A constructor that creates a regular polygon with the specified number of sides and length of side.
 *  - Getter (accessor) and setter (mutator) methods for all data fields. 
 * 	- A method named getPerimeter() that returns the perimeter of a polygon
 * 	- A method named getArea()that returns the area of a polygon. The area is defined as:
 * 			area = (n ∗ length squared) / (4 ∗ tan π/n)
 * 	- A toString() method that returns a string representation of a polygon (i.e. returns the values of the data fields as a string).
 * 
 * In your setter methods, validate the argument by checking that the user is not providing a negative
 * number for the number of sides or the length of a side. If they are, print a message and leave the
 * data field unchanged. Write a test program that creates an array of four RegularPolygon objects
 * as follows:
 * 
 * 	- Polygon 1: number of sides = 3, side length = 10.0
 * 	- Polygon 2: number of sides = 6, side length = 7.5
 * 	- Polygon 3: number of sides = 8, side length = 3.5
 * 	- Polygon 4: number of sides = 12, side length = 4.0
 * 
 * For each object in the array, display its string representation, perimeter and area. Also, find and
 * display the string representation of the polygon in the array with (a) the smallest perimeter and
 * (b)the largest area
 */


package MA3;

import java.lang.Math;

// Regular Polygon Class
public class RegularPolygon {
	private int n;           // number of sides
	private double length;   // length of each side
	
	
	// No arg constructor that creates a regular polygon with specified n and length
	public RegularPolygon() {
		this.n = 3;
		this.length = 1;
	}
	
	
	// Constructor that creates a regular polygon with specified n and length
	public RegularPolygon(int n, double length) {
		if (n < 0 || length <0) {
			System.out.println("Invalid input");
		}
		else {
			this.n = n;
			this.length = length;
		}
	}
	
	
	// N Getter
	public int getN() {
		return n;
	}
	
	
	// N Setter
	public void setN(int n) {
		if (n < 0) {
			System.out.println("Invalid input");
		}
		else {
			this.n = n;
		}
	}
	
	
	// Length Getter
	public double getLength() {
		return length;
	}
	
	
	// Length Setter
	public void setLength(double length) {
		if (n < 0) {
			System.out.println("Invalid input");
		}
		else {
			this.length = length;
		}
	}
	
	
	// Method that returns the perimeter of a polygon
	public double getPerimeter() {
		double perimeter = n * length;
		return perimeter;
	}
	
	
	// Method that returns the area of a polygon
	public double getArea() {
		double area = (n * (length * length)) / (4 * (Math.tan(Math.PI/n)));
		return area;
	}
	
	
	// Method that returns a string representation of a polygon
	public String toString() {
		return "Number of Sides: " + n + ", Length of Each Side: " + length;
	}
}
