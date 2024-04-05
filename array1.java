 import java.util.Scanner;
// public class array1 {
// public static void main(String [] args){
//     int a[];
//     Scanner sc=new Scanner(System.in);
//     System.out.println("ente a size of array");
//     int size=sc.nextInt();
//     a=new int[size];
//     System.out.println("enter a array size"+a.length);
//     for(int i=0;i<a.length;i++){
//        a[i]=sc.nextInt();
//     }
//     for (int i=0;i<a.length;i++){
//         if(a[i]%5==0){
//             System.out.println(a[i]);
//         }
//     }
// }
    
// }
// 

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the size of array");
//         int size = sc.nextInt();
//         int a[]=new int[size];
//          int sum=0;
//          System.out.println("enter a array element"+a.length);
//          for(int i=0;i<a.length;i++){
//             a[i]=sc.nextInt();
//          }
//         for(int i=0;i<a.length;i++){
//             sum=sum+a[i];
//         }
//         System.out.println(sum);
//     }
// }
public class array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size of array");
        int size =sc.nextInt();
        int a[]= new int[size];
        int temp;
        System.out.println("enter a array element");
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
    }
}
