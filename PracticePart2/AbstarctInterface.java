package PracticePart2;


    abstract class Shape {
    abstract void draw(); // Abstract method

    void info() {
        System.out.println("Shape info method.");
    }
}

interface Drawable {
    void draw(); // abstract method
}

class Circle extends Shape implements Drawable {
    public void draw() {
        System.out.println("   Drawing Circle");
    }
}
public class AbstarctInterface {
public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();  // From both abstract & interface
        c.info();  // From abstract class
}
}
