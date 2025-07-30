package OOPS;

public class Inheritance1 {
    void eat(){
        System.out.println(" Animal eat food ");
    }
}

class Dog extends Inheritance1{
    void bark(){
        System.out.println(" Dog bark");
    }

}

class B{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}



