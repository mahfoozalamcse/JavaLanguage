package PracticePart2;


// Polymorphism — "Many forms"
// 2 types: Compile-time (Method Overloading) & Runtime (Method Overriding)

class Calculator {

    // Compile-time Polymorphism (Overloading)
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Runtime Polymorphism (Overriding)
class Parent {
    void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child show()");
    }
}



public class PolymorphismExample {
     public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add 2: " + calc.add(2, 3));
        System.out.println("Add 3: " + calc.add(2, 3, 4));
        System.out.println("Add double: " + calc.add(2.5, 3.7));

        Parent obj = new Child(); // Upcasting
        obj.show(); // Calls overridden method
    }
}
