package OOPS;
// multilevel inheritance

public class Multilavel {
    void grandpa(){
        System.out.println( " Walking");
    }
}

class Parent extends Multilavel{
    void talk(){
        System.out.println(" talk parent");
    }
}

class Child extends Parent{
    void display(){
        System.out.println( " Discussion");
    }
}

class Test{
    public static void main(String[] args) {
        Child c = new Child();
        c.grandpa();
        c.talk();
        c.display();
    }
}
