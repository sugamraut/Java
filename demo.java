import java.util.Scanner;

public class demo {
    public static void main(String[] args) {

        // size of the square
        System.out.println("enter a size of row");
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        System.out.println("enter a column");
        int clo=scan.nextInt();
        int dia=clo;
        // outer loop
        for (int i = 1; i <= row; i++) {
            // inner loop
            for (int j = 1; j <= clo; j++) {
                // print only star in first and last row
                if (i == 1 || j == 1 || i == row || j == clo || i == j || (i == (row+1) && j == (clo - 1))||   j ==dia) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            dia--;
            System.out.println();
        }
        scan.close();
    }
    
}
