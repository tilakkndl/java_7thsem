package lab12;

//multilevel inheritance

class Animal {
    void eat() {
        System.out.println("Animal eats.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   // Inherited from Animal
        dog.walk();  // Inherited from Mammal
        dog.bark();  // Defined in Dog
    }
}

