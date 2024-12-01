package java102;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(4,3);
        System.out.println("x: " + point.x + "y: " + point.y);
    
        Point xTranslation = point.translateX(3); // should be (7, 3)
        Point yTranslation = point.translateY(-7); // should be (4, -4)
        Point xyTranslation = point.translateX(-4).translateY(-3); // should be (0, 0)

        System.out.println("x transl: " + xTranslation);
        System.out.println("y transl: " + yTranslation);    
        System.out.println("xy transl: " + xyTranslation);

        System.out.println("point: " + point);

        Point a = new Point(2, 3);
        Point b = new Point(5, 2);
        System.out.println("x: " + a.x + "y: " + a.y);
        System.out.println("x: " + b.x + "y: " + b.y);
        System.out.println(Point.distance(a, b) );







        Point[] points = { new Point(2, 3), new Point(5, 7), new Point(8, 6) };
        int sumX = 0, sumY = 0;
        for (Point p : points) {
            sumX += p.x;
            sumY += p.y;
        }
        Point center = new Point(sumX / points.length, sumY / points.length);
        System.out.println("Center of Mass: (" + center.x + ", " + center.y + ")");


        
    }}