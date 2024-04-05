class Animal {
    String name;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor");
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name); // Call the constructor of the superclass (Animal)
        System.out.println("Dog constructor");
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}

 class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.eat(); // Call the eat method from the superclass
        myDog.bark();
    }
}
