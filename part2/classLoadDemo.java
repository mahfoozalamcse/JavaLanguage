package part2;

class A {
    static {
        System.out.println("Class A Loaded");
    }
}
public class classLoadDemo {

    public static void main(String[] args) {
        A obj = new A();
    }
}  

