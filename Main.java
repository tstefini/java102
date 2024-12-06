package java102;

import java.util.ArrayList;


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

        System.out.println(Math.toRadians(30));
        
        Point p1 = new Point(1, 1);  // Expected angle: 45 degrees
        System.out.println("Angle of p1: " + p1.angle());  // Output: 45.0

        ArrayList<String> arr = new ArrayList<>();

        arr.add("Hello");
        arr.add("World");
        System.out.println(arr);
        arr.set(0, "Goodbye");
        System.out.println(arr);

        ArrayList<Boolean> conditions = new ArrayList<>();
        conditions.add(true);
        conditions.add(arr.get(0) == "Hello");
        conditions.add(conditions.get(0) || conditions.get(1));
        System.out.println(conditions);

        ArrayList<Integer> intArr = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            intArr.add(0);
        }
        System.out.println(intArr.size());
        System.out.println(intArr.get(32));

        Grid<Integer> grid = new Grid<>(5, 0);
        grid.set(2, 2, 4);
        System.out.println(grid);



        center = new Point(0, 0);
        Circle circle = new Circle(center, 5);

        // Displaying the circle's area and perimeter
        System.out.println("Circle: " + circle);
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());



       // make a Point object for the bottom-left corner
        Point bottomLeft = new Point(0, 0);
        // Create a square with sideLength 5
        Square square = new Square(bottomLeft, 5);
        // Scale the square by a factor of 2
        double scalingFactor = 2.0;
        // Get the corners of the scaled square
        Point[] scaledCorners = square.corners(scalingFactor);
        // Print the corners of the scaled square
        for (Point corner : scaledCorners) {
        System.out.println(corner);
}
   
        Shape[] shapes = {new Circle(new Point(1.8, -20), 2), 
        new Square(new Point(100, 2.1), 5.4),
        new Circle(new Point(0, 0), 1),
        new Circle(new Point(4, 9.123), 98.32),
        new Square(new Point(-321, 0), 0.02)};
        System.out.println(sumArea(shapes));
    
         }

         Shape[] shapes = new Shape[2];{
        
         // Add instances of FakeShape and Square (or other shapes you might have)
         shapes[0] = new FakeShape(); // a FakeShape object
         shapes[1] = new Square(new Point(0, 0), 2); // a Square with side length 2
         
         // Scale all shapes by a factor of 2
         Shape[] scaledShapes = scaleAll(shapes, 2);
         
         // Print the scaled shapes
         for (Shape shape : scaledShapes) {
             System.out.println("Scaled shape area: " + shape.area());
         }

         int x1 = 1, y1 = 1;
         int x2 = 2, y2 = 4;
         int x3 = 5, y3 = 3;
         System.out.println(findCircle(x1, y1, x2, y2, x3, y3));    


         LibraryItem[] items = new LibraryItem[]{
            new LibraryItem("Book 1", "ID001"),
            new LibraryItem("Book 2", "ID002"),
            new LibraryItem("Magazine 1", "ID003")
        };

        // Print initial state before returning items
        System.out.println("Before returning items:");
        for (LibraryItem item : items) {
            item.printStatus();  // Print if it's checked out or not
        }

        // Call the returnAll method
        returnAll(items);

        // Print final state after returning items
        System.out.println("\nAfter returning items:");
        for (LibraryItem item : 
        
        items) {
            item.printStatus();  // Verify if all items have been returned
        }


            // Create an array of LibraryItem objects
           
    
            // Make some of the items checked out
            items[1].checkOut(); // Mark "Book 2" as checked out
    
            // Get the list of available items
            ArrayList<LibraryItem> available = availableItems(items);
    
            // Print the available items
            System.out.println("Available items:");
            for (LibraryItem item : available) {
                System.out.println(item.title);
            }
        
    }


                   //end of public static void main(String[] args)
             
                 
             
         
             static <T> String arrayToString(T[] arr) {
                 String str = "[";
                 for (int i = 0; i < arr.length - 1; i++) {
                     str += arr[i] + ", ";
                 }
                 return str + arr[arr.length - 1] + "]";
             }
         
         
                 private char[] findCircle(int x1, int y1, int x2, int y2, int x3, int y3) {
                 throw new UnsupportedOperationException("Unimplemented method 'findCircle'");
             }
         
         
                 public interface Shape {
            double area();
            
                    Shape scale(double k);
                }
                static double sumArea(Shape[] shapes) {
                    double sum = 0;
                    for (Shape shape : shapes) {
                        sum += shape.area();
                    }
                    return sum;
                }
            

            static Shape[] scaleAll(Shape[] shapes, double k) {
                Shape[] scaled = new Shape[shapes.length];
                for (int i = 0; i < shapes.length; i++) {
                    scaled[i] = shapes[i].scale(k);
                }
                return scaled;

                
            }
                
            public class FakeShape implements Shape {
                public double area() { return 0; }
            
                public Square scale(double k) { 
                    return new Square(new Point(0, 0), 1); 
                }
            }
 
            A a = new A(12.3, 430);
            B b = new B(-12.31, "hello");

            A bInDisguise = new B(1002.013, "world");
          
            public static void returnAll(LibraryItem[] items) {
                for (LibraryItem item : items) {
                    item.returnItem(); // Assuming each LibraryItem has a returnToLibrary method
                }
            }
            
           // Static method to get all available LibraryItems
    public static ArrayList<LibraryItem> availableItems(LibraryItem[] items) {
        ArrayList<LibraryItem> availableItemsList = new ArrayList<>(); // Create an empty ArrayList

        // Loop through each item in the input array
        for (LibraryItem item : items) {
            if (item.available()) { // Check if the item is available
                availableItemsList.add(item); // Add available item to the list
            }
        }

        return availableItemsList; // Return the ArrayList with available items
    } 
   }
