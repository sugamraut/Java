import java.util.Scanner;
 class simpleinterst {
    public static void main(String[] args) {
System.out.println("find the simple intrest");
System.out.println("where p stand for principle and r for rate and t stand for time");
System.out.println("enter an principle rate and time");
Scanner scan= new Scanner(System.in);
double p= scan.nextDouble();
double t=scan.nextDouble();
double r=scan.nextDouble();
double c =(p*t*r)/100;

System.out.println(c);
        scan.close();
    }
}
