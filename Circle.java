package java102;

import java.text.DecimalFormat;

import java102.Main.Shape;

public class Circle implements Shape{
	public final Point center;
	public final double radius;

	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}

	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	/** 
	* @return Whether point p is inside of the circle.
	*/
	public boolean isInside(Point p) {
		return Point.distance(center, p) < radius;
	}

	/** 
	* @return Whether point p part of/on the border of the circle.
	*/
	public boolean isOn(Point p) {
		return Point.distance(center, p) == radius;
	}

	/** 
	* @param x How much to translate the circle by in the + x direction.
	* @param y How much to translate the circle by in the + y direction.
	* @return The circle that results from the translation.
	*/
	public Circle translate(double x, double y) {
		return new Circle(center.translateX(x).translateY(y), radius);
	}

	/** 
	* @return The circle that results from scaling by k.
	*/
	public Circle scale(double k) {
		return new Circle(center, radius * k);
	}

	@Override
	public String toString() {
		return "(center: " + center + "; radius: " + radius + ")";
	}



    

// Function to find the circle on
// which the given three points lie
public static Circle findCircle(int x1, int y1, int x2, int y2, int x3, int y3) {

    int x12 = x1 - x2;
    int x13 = x1 - x3;

    int y12 = y1 - y2;
    int y13 = y1 - y3;

    int y31 = y3 - y1;
    int y21 = y2 - y1;

    int x31 = x3 - x1;
    int x21 = x2 - x1;

    // x1^2 - x3^2
    int sx13 = (int)(Math.pow(x1, 2) -
                    Math.pow(x3, 2));

    // y1^2 - y3^2
    int sy13 = (int)(Math.pow(y1, 2) -
                    Math.pow(y3, 2));

    int sx21 = (int)(Math.pow(x2, 2) -
                    Math.pow(x1, 2));
                    
    int sy21 = (int)(Math.pow(y2, 2) -
                    Math.pow(y1, 2));

    int f = ((sx13) * (x12)
            + (sy13) * (x12)
            + (sx21) * (x13)
            + (sy21) * (x13))
            / (2 * ((y31) * (x12) - (y21) * (x13)));
    int g = ((sx13) * (y12)
            + (sy13) * (y12)
            + (sx21) * (y13)
            + (sy21) * (y13))
            / (2 * ((x31) * (y12) - (x21) * (y13)));

    int c = -(int)Math.pow(x1, 2) - (int)Math.pow(y1, 2) -
                                2 * g * x1 - 2 * f * y1;

    // eqn of circle be x^2 + y^2 + 2*g*x + 2*f*y + c = 0
    // where centre is (h = -g, k = -f) and radius r
    // as r^2 = h^2 + k^2 - c
    int h = -g;
    int k = -f;
    int sqr_of_r = h * h + k * k - c;

    // r is the radius
    double r = Math.sqrt(sqr_of_r);
    DecimalFormat df = new DecimalFormat("#.#####");
    System.out.println("Centre = (" + h + "," + k + ")");
    System.out.println("Radius = " + df.format(r));



    
   return findCircle( x1,  y1,  x2,  y2,  x3,  y3) ;
}


    
//practice problem: fromPoints


}