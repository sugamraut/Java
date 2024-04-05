import java.util.Scanner;

class currency{
    int rupees;
    int paisa;

}
public class classdemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter a rupess and paisa of 1");
        currency c1=new currency();
        c1.rupees=sc.nextInt();
        c1.paisa=sc.nextInt();
        currency c2=new currency();
         System.out.println("enter a rupess and paisa of 2");
        c2.rupees=sc.nextInt();
        c2.paisa=sc.nextInt();
        currency c3=new currency();
        c3.rupees=c1.rupees+c2.rupees;
        c3.paisa=c1.paisa+c2.paisa;
        if(c3.paisa>=100){
            c3.rupees++;
            c3.paisa-=100;
        }
        System.out.println("sum is: "+c3.rupees+" rupee and "+c3.paisa+ " pasia");
       sc.close();
    }
    
}
