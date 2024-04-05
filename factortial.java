import java.util.Scanner;

public class factortial {
     public static int factortial(int y){
        if(y==1)
        return y;
        else{
            return (y*factortial(y-1));
            
        }

    }
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        System.out.println("the output is:");
        int fact=factortial(y);
        System.out.println(fact);
    }
}
