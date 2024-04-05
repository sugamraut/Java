import java.util.Scanner;
public class sumofnaturalnumber {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int sum=0,i=0;
        while(i<=a){
            sum+=i;
            i++;
        }
        System.out.println("the sume is"+sum);
        scan.close();
    }
}
