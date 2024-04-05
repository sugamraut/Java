class Animal {
 void eat () {
 System.out.println("eat () method of base class");
 System.out.println("eating.");
 }
}
class Dog extends Animal {
 void eat () {
 System.out.println("eat () method of derived class");
 System.out.println("Dog is eating.");
 }
}

public class Overriding {
    public static void main (String [] args) {
        Dog d1 = new Dog ();
        Animal a1 = new Animal ();
        d1.eat ();
        a1.eat ();
        Animal animal = new Dog ();
        // eat () method of animal class is overridden by
        // base class eat ()
        animal.eat ();
        }
    
}
