package OOPS;

public class Interface {
    public static void main(String[] args) {
        MyClass g = new MyClass();
        g.print();
    }
}
interface Printable{
    void print();
}
 
class MyClass implements Printable{
    public void print(){
        System.out.println(" Print printabl.. ");
    }
}
