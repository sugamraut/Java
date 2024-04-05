import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        System.out.println("enter a number ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=a;
        int s=0,r;
        while(a!=0){
            
                r=a%10;
               s=s*10+r;
                a /= 10;

        }
         
        if(n==s){
            System.out.println(n+" is palindrom");

        }
        //System.out.println("hello");
        else{
            System.out.println(n+" is not a palindrom");
        }
    }
    
}
