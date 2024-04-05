public class Person {
    String name;
 int age;
 String gender;
 // Default constructor
 public Person ()
 {
 name = "Unknown";
 age = 0;
 gender= "unknown";
 }
 // Parameterized constructor
 public Person (String xname, int xage, String gen) {
 name = xname;
 age = xage;
 gender = gen;
 }
 public void displayInfo () {
 System.out.println(" Name: " + name);
 System.out.println(" Age: " + age);
 System.out.println(" gender " + gender);
 System.out.println();
 }
 public static void main (String [] args)
 {
 Person po = new Person ();
 Person per = new Person ("Ram", 20, "ktm");
 System.out.println("Default Information:");
 po. displayInfo ();
 System.out.println("Parameterized Information:");
 per. displayInfo ();
 }
}

