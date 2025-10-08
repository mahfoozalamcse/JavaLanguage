package AdvanceJava2;

import java.util.concurrent.locks.ReentrantLock;

// Deadlock Prevention using tryLock()
// Avoid deadlock

public class TryLockDemo {
    private final ReentrantLock lock1 = new ReentrantLock();
    private final ReentrantLock lock2 = new ReentrantLock();

    public void task1() {
        try {
            if (lock1.tryLock() && lock2.tryLock()) {
                System.out.println("Task1 acquired both locks");
            }
        } finally {
            if (lock1.isHeldByCurrentThread()) lock1.unlock();
            if (lock2.isHeldByCurrentThread()) lock2.unlock();
        }
    }

    public void task2() {
        try {
            if (lock2.tryLock() && lock1.tryLock()) {
                System.out.println("Task2 acquired both locks");
            }
        } finally {
            if (lock2.isHeldByCurrentThread()) lock2.unlock();
            if (lock1.isHeldByCurrentThread()) lock1.unlock();
        }
    }

    public static void main(String[] args) {
        TryLockDemo obj = new TryLockDemo();
        new Thread(obj::task1).start();
        new Thread(obj::task2).start();
    }
}

