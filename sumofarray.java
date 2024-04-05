import java.util.Scanner;
public class sumofarray {
    public static void main(String[] args) {
        int [][] arr;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int m =sc .nextInt();
        int n=sc.nextInt();
        arr=new int[m][n];
        m=arr.length;
        n=arr[0].length;
       int sumrow=0;
       int sumc=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            sumrow=0;
            for(int j=0;j<n;j++){
                sumrow=sumrow+arr[i][j];
            }
            System.out.println("Sum of " + (i+1) +" row: " + sumrow); 
        }
       
        for(int i = 0; i < n; i++){  
        
            for(int j = 0; j < m; j++){  
              sumc = sumc + arr[j][i];  
            }  
            System.out.println("Sum of " + (i+1) +" column: " + sumc);  


    }
    sc.close();
}
}
