package AdvanceJava2;

// ReentrantLock — Manual Lock Control
import java.util.concurrent.locks.ReentrantLock;

class SharedCounter {
    private int count = 0;
    private final ReentrantLock lock = new ReentrantLock();

    void increment() {
        lock.lock();
        try {
            count++;
            System.out.println(Thread.currentThread().getName() + " -> " + count);
        } finally {
            lock.unlock();
        }
    }
}


public class LockDemo {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();
        Runnable task = () -> {
            for (int i = 0; i < 3; i++) counter.increment();
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}

