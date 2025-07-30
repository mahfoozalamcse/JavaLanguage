package OOPS;

public class SingleInheritance {
    void show(){
        System.out.println(" Show me..");
    }
}

class child extends SingleInheritance{
    void display(){
        System.out.println(" I am child ");
    }
}

class B{
    public static void main(String[] args) {
        child ch = new child();
        ch.display();
        ch.show();
    }
}
