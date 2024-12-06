package java102;

public class RightTriangle implements Shape {
    private double x, y;  // Coordinates of the right-angle corner
    private double sideA, sideB; // Two sides adjacent to the right angle

    // Constructor
    public RightTriangle(double x, double y, double sideA, double sideB) {
        this.x = x;
        this.y = y;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return 0.5 * sideA * sideB;
    }

    @Override
    public double perimeter() {
        double hypotenuse = Math.sqrt(sideA * sideA + sideB * sideB);
        return sideA + sideB + hypotenuse;
    }

    @Override
    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    // Static method to check if two right triangles are similar
    public static boolean similar(RightTriangle t1, RightTriangle t2) {
        double[] sides1 = {t1.sideA, t1.sideB};
        double[] sides2 = {t2.sideA, t2.sideB};
        java.util.Arrays.sort(sides1);
        java.util.Arrays.sort(sides2);
        return Math.abs(sides1[0] / sides2[0] - sides1[1] / sides2[1]) < 1e-9;
    }

    public static void main(String[] args) {
        RightTriangle t1 = new RightTriangle(0, 0, 3, 4);
        RightTriangle t2 = new RightTriangle(5, 5, 6, 8);

        System.out.println("Triangle 1 Area: " + t1.area());
        System.out.println("Triangle 1 Perimeter: " + t1.perimeter());

        t1.translate(2, 3);
        System.out.println("Triangle 1 New Position: (" + t1.x + ", " + t1.y + ")");

        System.out.println("Triangle 1 and Triangle 2 are Similar: " + RightTriangle.similar(t1, t2));
    }
}

// Shape interface
interface Shape {
    double area();
    double perimeter();
    void translate(double dx, double dy);
}