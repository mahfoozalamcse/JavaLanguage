package AdvanceJava2;

// Dead lock in java
class Resource {
    synchronized void resourceA(Resource r) {
        System.out.println(Thread.currentThread().getName() + " locked ResourceA, waiting for ResourceB...");
        try { Thread.sleep(1000); } catch (Exception e) {}
        r.resourceB();
    }
    synchronized void resourceB() {
        System.out.println(Thread.currentThread().getName() + " locked ResourceB");
    }
}

public class DeadlockDemo {
    public static void main(String[] args) {
        Resource r1 = new Resource();
        Resource r2 = new Resource();

        Thread t1 = new Thread(() -> r1.resourceA(r2), "Thread-1");
        Thread t2 = new Thread(() -> r2.resourceA(r1), "Thread-2");

        t1.start();
        t2.start();
    }
}

