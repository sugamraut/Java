import java.util.Scanner;
public class Toutorial {
    public static void main (String [] args)
{
 Scanner s = new Scanner (System.in);
 System.out.print("Enter the size of the array: ");
 int size = s. nextInt ();
 int [] array = new int[size];
 System.out.println("Enter the elements of the array:");
 for (int i = 0; i < size; i++)
{
 System.out.print("Element " + (i + 1) + ": ");
 array[i] = s. nextInt ();
 }
 int smallest = findSmallest(array);
 int largest = findLargest(array);
 int sum = findSum(array);
 System.out.println("Smallest Element: " + smallest);
 System.out.println("Largest Element: " + largest);
 System.out.println("Sum of Elements: " + sum);
 s. close ();
 }
 public static int findSmallest(int[] array)
{
 int smallest = array [0];
 for (int i = 0; i < array. length; i++)
{
 if (array[i] < smallest)
{
 smallest = array[i];
}
 }
 return smallest;
 }
 public static int findLargest(int[] array)
{
 int largest = array [0];
 for (int i = 0; i < array. length; i++)
 {
 if (array[i] > largest) {
 largest = array[i];
 }
 }
 return largest;
 }
 public static int findSum(int[] array)
{
 int sum = 0;
 for (int i = 0; i < array. length; i++)
 {
 sum += array[i];
 }
 return sum;
 }
}

