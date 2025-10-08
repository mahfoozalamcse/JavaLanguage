package AdvanceJava2;

// Syncronization block in java
class Display {
    void wish(String name) {
        System.out.println("Entering non-critical section...");
        synchronized (this) {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Good Morning: " + name);
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        }
        System.out.println("Exiting non-critical section...");
    }
}

public class SyncBlockDemo {
    public static void main(String[] args) {
        Display d = new Display();

        Thread t1 = new Thread(() -> d.wish("Alice"));
        Thread t2 = new Thread(() -> d.wish("Bob"));

        t1.start();
        t2.start();
    }
}

