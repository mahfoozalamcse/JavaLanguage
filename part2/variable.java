package part2;

public class variable {
    int x = 10; // instance variable
    static int y = 20; // static variable   
    public static void main(String[] args) {
        int a = 100; // local variable
        
        variable v = new variable();

        System.out.println(a);
        System.out.println(v.x);
        System.out.println(y);
    }
}
