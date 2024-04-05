public class Shapecalculator {
    public double calculateArea (int l)
 {
 return l * l;
 }
 public double calculateArea (int length, int breadth)
 {
 return length * breadth;
 }

 public double calculateArea (double radius)
 {
 return Math.PI * radius * radius;
 }

 public static void main (String [] args)
 {
 Shapecalculator c = new Shapecalculator ();

 int square_Length = 5;
 double squareArea = c. calculateArea (square_Length);
 System.out.println("Area of Square with side length " + square_Length + ": " +
squareArea);
 int rectangle_Length = 4;
 int rectangle_Width = 6;
 double rectangleArea = c. calculateArea (rectangle_Length, rectangle_Width);
 System.out.println("Area of Rectangle with length " + rectangle_Length + " and width " +
rectangle_Width + ": " + rectangleArea);
 double circle_Radius = 3.5;
 double circleArea =c. calculateArea (circle_Radius);
 System.out.println("Area of Circle with radius " + circle_Radius + ": " + circleArea);
 }
}
