import java.util.Scanner;
public class shorting {
    public static void main(String[] args) {
        int[]a;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter an arry size");
        int size=sc.nextInt();
        a=new int[size];
        int temp;
        System.out.println("enter the arry element of size of element:"+a.length);
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<=a.length;i++){
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
        sc.close();
    }
}
