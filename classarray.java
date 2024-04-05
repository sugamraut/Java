import java.util.Scanner;
class Student{
    String name;
    int age;
    char gender;
    String Address;
    Student(String n,int a,char g,String add)
{
    name=n;
    age=a;
    gender=g;
    Address=add;
}
}
public class classarray {
    public static void main(String[] args) {
        Student s[]=new Student[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<s.length;i++){
            System.out.println("enter a name");
            String n=sc.next();
            System.out.println("enter a age");
            int a=sc.nextInt();
            System.out.println("gender");
            char g=sc.next().charAt(0);
            System.out.println("enter a address");
            String add=sc.next();
            s[i]=new Student(n,a,g,add);
        }
        for(int i=0;i<s.length;i++){
            System.out.println("inside for loop");
            if(s[i].gender=='f'||s[i].gender=='F'){
                System.out.println("inside if");
                    if(s[i].age>=22){
                        System.out.println("output");
                        System.out.println(s[i].name);
                        System.out.println(s[i].age);
                        System.out.println(s[i].gender);
                        System.out.println(s[i].Address);
                    }
            }
        }
        sc.close();
    }
    
}
