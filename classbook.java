import java.util.Scanner;
class Book{
    String n,pu;
    double p;
    Book(String name,double price,String pub){
        n=name;
        p=price;
        pu=pub;
    }
}
public class classbook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Book[]b=new Book[10];
        System.out.println("enter a book detail");
        for (int i=0;i<b.length;i++){
        System.out.println("enter name priceand publication");
        String n=sc.next();
        double p=Double.valueOf(sc.next());
        String pu=sc.next();
        b[i]=new Book(n,p,pu);
        }
        double a=b[0].p;
        for(int i=0;i<b.length;i++){
            if(a<b[i].p){
                a=b[i].p;
            }
        }
        for(int i=0;i<b.length;i++){
            if(a==b[i].p){
                System.out.println("name"+b[i].n+"\n price"+b[i].p+"\npublication"+b[i].pu);
            }
        }
        sc.close();
    }
    
}
