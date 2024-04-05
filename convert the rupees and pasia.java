import java.util.Scanner;
class currency{
    int rupees;
    int pasia;

}
 class classdemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter a rupess and paisa of 1");
        currency c1=new currency();
        c1.rupees=sc.nextInt();
        c1.pasia=sc.nextInt();
        currency c2=new currency();
         System.out.println("enter a rupess and paisa of 2");
        c2.rupees=sc.nextInt();
        c2.pasia=sc.nextInt();
        currency c3=new currency();
        c3.rupees= c1.pasia + c2.pasia;
        int e=c3.rupees/100;
         int f=c3.rupees%100;
        int g=(c1.rupees+c2.rupees)+e;
        int h=(c1.pasia+c2.pasia)+f;
       System.out.println(g);
        System.out.println(h);
        sc.close();
 
    }
}