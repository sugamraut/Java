import java.util.Scanner;
class Student {
    String name;
    int age;
    char gender;
    String address;

    Student(String n, int a, char g, String add) {
        name = n;
        age = a;
        gender = g;
        address = add;
    }
}

 class ClassArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s[] = new Student[10];

        for (int i = 0; i < s.length; i++) {
            System.out.println("Enter a name:");
            String n = sc.next();
            System.out.println("Enter an age:");
            int a = sc.nextInt();
            System.out.println("Enter a gender:");
            char g = sc.next().charAt(0);
            System.out.println("Enter an address:");
            String add = sc.next();
            s[i] = new Student(n, a, g, add);
        }

        System.out.println("Female Students:");
        for (int i = 0; i < s.length; i++) {
            if (s[i].gender == 'f' || s[i].gender == 'F') {
                System.out.println("Name: " + s[i].name);
                System.out.println("Gender: " + s[i].gender);
            }
        }
    }
}
