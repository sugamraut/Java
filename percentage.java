import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
System.out.println("enter the mark of 5 subject");
Scanner scan= new Scanner(System.in);
int a= scan.nextInt();
int b= scan.nextInt();
int c= scan.nextInt();
int d= scan.nextInt();
int e= scan.nextInt();

int sum =a+b+c+d+e;
double p=sum/5;
System.out.println("the percentage of 5 subject"+p);
scan.close();
    }
}
