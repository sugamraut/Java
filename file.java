import java.io.FileReader;
import java.io.FileWriter;
 class file3 {
    public static void main(String[] args) {
        int count=0;
        try {
            FileWriter fw=new FileWriter("C:\\sugam\\a.txt");
            fw.write("welcome to nepal");
            fw.close();
           
            FileReader fr=new FileReader("C:\\sugam\\a.txt");
            char a[]= new char[50];
            fr.read(a);
            for (char c : a) {
                if(c=='\0'){
                    break;
                }
                else{
                        System.out.print(c);
                        count++;
                }
               
            }
            
            fr.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(count);
    }
    
}
