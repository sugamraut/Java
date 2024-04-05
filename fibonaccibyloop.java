import java.util.Scanner;
public class fibonaccibyloop {
    public static void main(String[] args) {
        int n1=0,n2=1,n3;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //System.out.println(n1+" \n "+n2);
        for(int i=1;i<=n;i++){
           n3=n1+n2;
           System.out.println(n1+" ");
           n1=n2;
           n2=n3; 
        }
        sc.close();
    }
}
