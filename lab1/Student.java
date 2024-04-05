public class Student
{
 String name;
 double roll;
 double [] marks;
 // Constructor
 public Student (String sname, double r, double [] m)
 {
 name = sname;
 roll = r;
 marks = m;
 }
 // Method to calculate total marks
 public double calculateTotalMarks ()
 {
 double total = 0;
 for (int i = 0; i < marks. length; i++)
 {
 total = total + marks[i];
 }
 return total;
 }
 // Method to calculate average marks
 public double calculateAverageMarks ()
 {
 double totalMarks = calculateTotalMarks ();
 return (totalMarks / marks. length);
 }
 public static void main (String [] args)
 {
 Double [] studentMarks = {70, 90, 75, 65, 82};
 Student s = new Student ("hari", 102, studentMarks);
 System.out.println("Student Information:");
 System.out.println("Name: " + s.name);
 System.out.println("Roll Number: " + s.roll);
 double totalMarks = s. calculateTotalMarks ();
 double averageMarks = s. calculateAverageMarks ();
 System.out.println("Total Marks: " + totalMarks);
 System.out.println("Average Marks: " + averageMarks);
 }

 }
