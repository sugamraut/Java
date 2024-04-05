import java.util.Scanner;
class currency{
    int rupees;
    int paisa;
         currency(int r,int p){
        rupees=r;
        paisa=p;
    }
    int total(){
        return rupees+paisa/100+((paisa % 100) / 100);
    }
}

 class currencysum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        currency []c=new currency[3];
        for(int i=0;i<c.length;i++){
            System.out.println("enter a rupess");
            int r=sc.nextInt();
            System.out.println("enter a paisa");
            int p=sc.nextInt();
            if (p >= 100) {
                r += p / 100;
                p %= 100;
            }
            c[i]=new currency(r,p);
        }
        currency highestcurrency=c[0];
            for(int i=0;i<c.length;i++){
                System.out.println("in");
               
               if(c[i].total()>highestcurrency.total()){
                highestcurrency=c[i];
               }

            }
            System.out.println("output");
            System.out.println(highestcurrency.total());
        sc.close();
    }
}
