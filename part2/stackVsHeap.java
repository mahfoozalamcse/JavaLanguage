package part2;

class Test {
    int x = 10;
}
public class stackVsHeap {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = t1;

        t2.x = 50;

        System.out.println(" "+ t1.x);
    }
}
