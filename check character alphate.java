import java.util.Scanner;
class checkalphate {
    public static void main (String[] args){
        System.out.println("enter a character");
        Scanner scan=new Scanner(System.in);
        char  a=scan.next().charAt(0);
        if((a>=65 && a <= 90)|| (a >= 97 && a<=122)){
      System.out.println(a+ " is alphate");
        }
      else
      {
        System.out.println(a+ " is not alphate");
      }
      scan.close();
    }
}
