import java.io.*;
class Employee implements Serializable{
    int age;
    String name;
  public Employee(int age,String name){
  this.age=age;
  this.name=name;
  }
}

class temp{
    public static void main(String[] args) {
       Employee e1=new Employee(18, "ram");
        try {
            FileOutputStream fos=new FileOutputStream("C:\\sugam\\b.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(e1);
            fos.close();
            oos.close();
            FileInputStream fis=new FileInputStream("C:\\sugam\\b.txt");
            ObjectInputStream ois= new ObjectInputStream(fis);
            Employee read =(Employee)ois.readObject();
            System.out.println(read.name+","+read.age);
            fis.close();
            ois.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}