import java.io.*;
// import java.io.FileWriter;

public class Characterstreamdemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("c:\\FH\\test.txt");
            fw.write('a');
            fw.write('A');
            char arr[] = { 'a', 'b', 'c' };
            fw.write(arr);
            fw.write("Nepal is a beautiful country");
            fw.close();
           /*  FileReader fr = new FileReader("c:\\FH\\test.txt");
            // int c;
            // while ((c = fr.read()) != -1) {
            // System.out.print((char) c);
            // }
            char ch[] = new char[50];
            fr.read(ch);
            for(char c:ch)
            {
                System.out.println(c);
            }
            fr.close();
            */
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}