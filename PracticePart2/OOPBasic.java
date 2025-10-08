package PracticePart2;
// import java.util.*;

public class OOPBasic {
    
  // Master OOP Concepts for FAANG — All in One

    public static void main(String[] args) {
        System.out.println(" OOP Concepts Demo ");

        // Q1: Class and Object
        Car c1 = new Car("Tesla", "Red");
        c1.drive();

        // Q2: Encapsulation
        Account acc = new Account(1000);
        acc.deposit(500);
        acc.withdraw(200);
        System.out.println("Balance: " + acc.getBalance());

        // Q3: Abstraction
        Payment p = new UPI();
        p.pay(100);

        // Q4: Inheritance
        Dog d = new Dog();
        d.eat();
        d.bark();

        // Q5: Polymorphism (Overriding)
        Animal a = new Dog();
        a.eat();

        // Q6: Polymorphism (Overloading)
        Calculator calc = new Calculator();
        System.out.println("Sum int: " + calc.add(2, 3));
        System.out.println("Sum double: " + calc.add(2.5, 3.5));

        // Q7: Constructor and this keyword
        Student s = new Student("Alice", 22);
        s.show();

        // Q8: Access modifiers demonstration
        Product p1 = new Product("Laptop ", 50000);
        p1.display();

        // Q9: Final keyword demonstration
        FinalExample.showFinalUsage();

        // Q10: Real-world example (Polymorphism)
        Vehicle bike = new Bike();
        Vehicle car = new CarVehicle();
        bike.start();
        car.start();

       System.out.println("  Complete OOPs basic .. ");
    }
}

// Q1 Class and Object
class Car {
    String brand;
    String color;

    Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    void drive() {
        System.out.println(color + " " + brand + " is driving...");
    }
}

// Q2 Encapsulation
class Account {
    private double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amt) {
        if (amt > 0) balance += amt;
    }

    void withdraw(double amt) {
        if (amt <= balance) balance -= amt;
    }

    double getBalance() {
        return balance;
    }
}

// Q3 Abstraction
interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid  RS.. " + amount + " via UPI");
    }
}

// Q4 Inheritance
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }

    @Override
    void eat() {
        System.out.println("Dog eats meat...");
    }
}

// Q6 Polymorphism (Overloading)
class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}

// Q7 Constructor and this keyword
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println("Student: " + name + ", Age: " + age);
    }
}

// Q8 Access modifiers
class Product {
    private String name;
    protected int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name + ", Price:  " + price);
    }
}

// Q9 Final keyword
class FinalExample {
    static final double PI = 3.14159;
    static void showFinalUsage() {
        System.out.println("Final constant PI = " + PI);
    }
}

// Q10 Polymorphism real-world
abstract class Vehicle {
    abstract void start();
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with kick...");
    }
}

class CarVehicle extends Vehicle {
    void start() {
        System.out.println("Car starts with button...");
    }
}


