import java.util.Scanner;
public class greater {
    public static void main(String[] args) {
        int []a;
        System.out.println("enter a size of array");
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        a=new int[size];
        int temp;
        System.out.println("enter a array element of size"+a.length);
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){ 
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }
        System.out.println("after sorting");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
            int c=a[size-1];
            int d=a[size-2];
            System.out.println("greatest number"+c);
            System.out.println("second greatest number"+d);
        
            sc.close();
    }
}
