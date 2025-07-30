package OOPS;

public class InherinceExe {
    public static void main(String[] args) {
        Derived g = new Derived();
        g.print();
    }
}

class Base{
    private int x = 10;
    public int getX(){
       return x;
    }
}

class Derived extends Base{
    int y = 100;
    void print(){
        System.out.println();
        System.out.println("Excess of Base class private data but not modified "+getX());
        System.out.println(" Y = "+ y);
    }
}
