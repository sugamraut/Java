public class MethodOverloadingEx {
    static int calculatearea (int l, int b)
 {
 return l * b;
 }
 static int calculatearea (int l, int b, int h)
 {
 return 2*((l*b) +(l*h) +(b*h));
 }
 public static void main (String [] args)
 {
 System.out.println("area of rectangle");
 System.out.println(calculatearea (5, 9));
 System.out.println("area of cuboid");
 System.out.println(calculatearea (4, 8, 2));
 }
}
