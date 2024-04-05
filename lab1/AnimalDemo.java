interface Animal
{
 void makeSound ();
}
class Dog implements Animal
{
 public void makeSound ()
 {
 System.out.println("Dog barks: Woof! Woof!");
 }
}
class Cat implements Animal
{
 public void makeSound ()
 {
 System.out.println("Cat meows: Meow! Meow!");
 }
}
class Cow implements Animal
{
 public void makeSound ()
 {
 System.out.println("Cow mooes: Moo! Moo!");
 }
}
public class AnimalDemo {
    public static void main (String [] args)
 {
    
   Animal[] animals = new Animal[3];
   animals [0] = new Dog ();
  animals [1] = new Cat ();
  animals [2] = new Cow ();
 for(int i = 0; i<animals.length; i++)
 {
 animals[i].makeSound();
 }
    }
}
