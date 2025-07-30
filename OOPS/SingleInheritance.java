package OOPS;
// interface like - comparable, runnable,printable like name exist 

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

        // test default case
        Test i = new Test();
        i.fun1();
        i.fun2();
        i.fun3();
    }
}

// more default example of interface
interface MyInt{
    default void fun1(){
        System.out.println("fun1");
    }
    default void fun2(){
        System.out.println("fun2");
    }

    void fun3();
}

class Test implements MyInt{
    public void fun3(){
        System.out.println(" Fun 3");
    }

}
