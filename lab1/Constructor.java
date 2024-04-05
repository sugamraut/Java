public class Constructor {
    String name;
 int age;
 String address;
 // Default constructor
 public Constructor () {
 name = "Unknown";
 age = 0;
 address = "unknown";
 }
 // Parameterized constructor
 public Constructor (String xname, int xage, String add) {
 name = xname;
 age = xage;
 address = add;
 }
 public void displayInfo () {
 System.out.println(" Name: " + name);
 System.out.println(" Age: " + age);
 System.out.println(" Address: " + address);
 System.out.println();
 }
 public static void main (String [] args) {
 Constructor co = new Constructor ();
 Constructor con = new Constructor ("Ram", 20, "ktm");
 System.out.println("Default Information:");
 co. displayInfo ();
 System.out.println("Parameterized Information:");
 con. displayInfo ();
 }
}
