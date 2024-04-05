import java.io.File;
public class filehandling {
    public static void main(String[] args) {
        File f1=new File("c:/sugam");
        if(!f1.exists()){
            if(f1.mkdirs()){
                System.out.println("read successfuly");
            }
        }
        File f2=new File("c:/Sugam/a.text");
        if(!f2.exists()){
            try {
                if (f2.createNewFile()){
                    System.out.println("file is created");
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
        }
    }
}
