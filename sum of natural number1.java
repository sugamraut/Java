import java.util.Scanner;
class sumofnaturalnumber1 {
       public static int sum(int y){
        if(y==1)
        return y;
        else{
            return y+sum(y-1);
        }

    }
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        System.out.println("the output is:");
        System.out.println(sum(y));
    }
}

