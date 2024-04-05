//package Generics;
class ProcessArray{
public static <T> void printArray(T[] array) {
for (T element : array) {
System.out.println(element);
}
}
public static <T>  T getValue(T[] array, int index) {
return array[index];
}
}
public class Generics2 {
public static void main(String[] args) {
Integer[] i={1,2,3};
String[] s={"Prabin","maharjan","hi"};
ProcessArray.printArray(i);
ProcessArray.printArray(s);
}
}