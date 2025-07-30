package OOPS;

public class MethodOverride {
    void draw(){
        System.out.println(" Drawing shape.. ");
    }
}

class Circle extends MethodOverride{
    @Override
    void draw(){
        System.out.println(" Draw circle.. ");
    }
}

class Test{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}

