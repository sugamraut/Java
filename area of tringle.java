import java.util.Scanner;
class a{
    public static void main(String[] args)
    {
System.out.println("enter the base and height");
Scanner scan = new Scanner(System.in);
double b=scan.nextDouble();
double h=scan.nextDouble();
double c=(b*h)/2;
System.out.println(c);
scan.close();
    }
}