import java.util.Scanner;
public class sumofintegerarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
          System.out.println("enter a size of array");
         int size=sc.nextInt();
        int []a;
        a=new int[size];
        int sum=0;
        System.out.println("enter an arry element");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }

        System.out.println("the sum of n number is"+sum);
        sc.close();
    }
}
