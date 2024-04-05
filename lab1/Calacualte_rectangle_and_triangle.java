import java. util. Scanner;
class Rectangle
{
 private double length;
 private double width;
 public Rectangle (double l, double w)
 {
 length = l;
 width = w;
 }
 public double calculateArea ()
 {
 return length * width;
 }
}
class Triangle
{
 private double base;
 private double height;
 public Triangle (double b, double h)
 {
 base = b;
 height = h;
 }
 public double calculateArea ()
 {
 return 0.5 * base * height;
 }
}

public class Calacualte_rectangle_and_triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
 System.out.println("Enter length and width of the rectangle:");
 double rect_Length = s. nextDouble ();
 double rect_Width = s. nextDouble ();
 Rectangle rectangle = new Rectangle (rect_Length, rect_Width);

 System.out.println("Enter base and height of the triangle:");
 double tri_Base = s. nextDouble ();
 double tri_Height = s. nextDouble ();
 Triangle triangle = new Triangle (tri_Base, tri_Height);

 double rectArea = rectangle. calculateArea ();
 System.out.println("Area of Rectangle: " + rectArea);

 double triArea = triangle. calculateArea ();
 System.out.println("Area of Triangle: " + triArea);
 s. close (); 
    }
}
