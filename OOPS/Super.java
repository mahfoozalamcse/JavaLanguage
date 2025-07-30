package OOPS;

public class Super {
    int x = 100;
    Super(){
        System.out.println(" A constructor.. ");
    }
}

class B extends Super{
    int x = 200;
    B(){
        super(); // call Super constructor
        System.out.println(" B constructor");
        System.out.println(" x in Super " + super.x); // Acces Super x
    }
}

