package AdvanceJava2;

// Thread Lifecycle & Synchronization Basics
class Worker extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " working... " + i);
            try {
                Thread.sleep(1000); // Simulate time-consuming task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadManagementDemo {
    public static void main(String[] args) throws InterruptedException {
        Worker t1 = new Worker();
        Worker t2 = new Worker();

        t1.setName("Worker-1");
        t2.setName("Worker-2");

        t1.start();
        t2.start();

        t1.join(); // Main thread waits until t1 finishes
        System.out.println("Is t1 alive? " + t1.isAlive());
        System.out.println("Main thread done!");
    }
}
