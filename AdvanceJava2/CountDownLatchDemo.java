package AdvanceJava2;

import java.util.concurrent.CountDownLatch;

// CountDownLatch — Waiting for Tasks to Complete
// Used when one thread needs to wait for multiple threads to finish.

class Worker extends Thread {
    private final CountDownLatch latch;

    Worker(CountDownLatch latch, String name) {
        super(name);
        this.latch = latch;
    }

    public void run() {
        System.out.println(getName() + " started.");
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        System.out.println(getName() + " finished.");
        latch.countDown(); // decrement latch
    }
}

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        new Worker(latch, "Worker-1").start();
        new Worker(latch, "Worker-2").start();
        new Worker(latch, "Worker-3").start();

        latch.await(); // wait for all workers to finish
        System.out.println("All workers finished, main thread proceeding!");
    }
}

