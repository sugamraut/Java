import java.util.Scanner;
 class divide {
    public static void main(String[] args) {
       // int arr[];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size =sc .nextInt();
        int []arr=new int[size];
        System.out.println("enter an arry element of size:"+arr.length);
        for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
         
        }
        System.out.println("the number which is divide by 5 is");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%5==0){
                System.out.println(arr[i]);
            }
        }
        sc.close();

    }
    
}
