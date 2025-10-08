package PracticePart2;

// Abstract Class: defines common template with abstract (unimplemented) and concrete (implemented) methods
abstract class Vehicle {
    abstract void start(); // abstract method

    void stop() { // concrete method
        System.out.println("Vehicle stopped.");
    }
}

// Concrete Subclass implementing abstract methods
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started with key ignition.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike started with self-start button.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Abstract class cannot be instantiated directly
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        car.stop();

        bike.start();
        bike.stop();
    }
}
