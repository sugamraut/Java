import java.util.Scanner;
public class checkprime {
   public static void main(String[] args) {
        System.out.println("enter a number");
        boolean flag=false;
        Scanner scan=new Scanner(System.in);
        int num = scan.nextInt();
        int i=2;
        while(i<=num/2){
            if(num%i==0){
                flag=true;
                break;
            }
            i++;
               
            }
            if(!flag){
                System.out.println("prime");

            }
            else{
                System.out.println("not prime");
            }
            scan.close();
        }
       
    }

