package java102;

import java102.Main.Shape;

public class Square implements Shape{
    public final Point corner;
    public final double sideLength;
    
        /**
        * @param corner The bottom left corner of the square
        * @param sideLength
        */
        public Square(Point corner, double sideLength) {
            this.corner = corner;
            this.sideLength = sideLength;
        }
    
        public double area() {
            return sideLength*sideLength;
        }
        
        public double perimeter() {
            return sideLength*4;
        }
        
        /** 
        * @return Whether point p is inside of the square.
        */
        public boolean isInside(Point p) {
            double xDist = p.x - corner.x;
            double yDist = p.y - corner.y;
            return 0 < xDist && xDist < sideLength &&
                   0 < yDist && yDist < sideLength;
        }
    
        /** 
        * @return Whether point p part of/on the border of the square.
        */
        public boolean isOn(Point p) {
            double px = p.x;
            double py = p.y;
        return (p.x >= corner.x && px <= corner.x + sideLength) &&
               (p.y >= corner.y && py <= corner.y + sideLength);
        }
        
        /** 
        * @param x How much to translate the sqaure by in the + x direction.
        * @param y How much to translate the squarer by in the + y direction.
        * @return The sqaure that results from the translation.
        */
        public Square translate(double x, double y) {
            //return new Circle(center.translateX(x).translateY(y), radius);
            return new Square(corner.translateX(x).translateY(y), sideLength);
        }
    
        /** 
        * @return The sqaure that results from scaling the side length and maintaining the bottom left corner
        */
        public Square scale(double k) {
            return new Square(corner, sideLength * k);
        }
    
        public Point[] corners(double k) {
            double scaledSideLength = sideLength* k;
        
            Point bottomRight = new Point(corner.x + scaledSideLength, corner.y);
            Point topLeft = new Point(corner.x, corner.y + scaledSideLength);
            Point topRight = new Point(corner.x + scaledSideLength, corner.y + scaledSideLength);
            
            return new Point[]{corner, bottomRight, topLeft, topRight};
                   }
    
        @Override
        public String toString() {
            return "(corner: " + corner + "; side length: " + sideLength + ")";
        }
    }

