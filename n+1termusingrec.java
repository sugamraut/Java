 import java.util.Scanner;
 class trem{
    public static void number(int n) {
        if(n==0)
        return ;
        else{
            System.out.println(n);
              number(n-1);
        }

    }
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("the output is: ");
        number(n);
    }
    
}
