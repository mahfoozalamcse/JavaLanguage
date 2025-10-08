package PracticePart2;

//  Inheritance — Mechanism where one class acquires the properties and behaviors of another class
// It helps in code reusability and method overriding.

class Animal {
    String name;  // Base class field

    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps softly.");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.name = "Bruno"; // inherited from Animal
        System.out.println("Name: " + p.name);
        p.eat(); // from Animal
        p.bark(); // from Dog
        p.weep(); // from Puppy

        Cat c = new Cat();
        c.name = "Kitty";
        System.out.println("Name: " + c.name);
        c.eat();
        c.meow();
    }
}
