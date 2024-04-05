import java.util.Scanner;
public class checkreverse {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        System.out.println("the orginal number"+a);
        int c=0;
        while(a!=0){
            
            int r=a%10;
              c= c*10+r;
            a=a/10;

        }
        System.out.println("the reverse number is"+c);
    
    scan.close();
    }
}
