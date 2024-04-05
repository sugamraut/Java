 import java.util.Scanner;
 class termrec {
     public static void number(int n) {
        if(n==0)
        return ;
        else{
            
              number(n-1);
                System.out.println(n);
        }
      

    }
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("the output is: ");
        number(n);
        sc.close();
    }

    
}

