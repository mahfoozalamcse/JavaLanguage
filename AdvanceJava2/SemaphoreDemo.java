package AdvanceJava2;

import java.util.concurrent.Semaphore;

// Semaphore — Controlling Access to Resources
// Used to limit the number of threads that can access a resource at once.

class SharedResource {
    private final Semaphore semaphore = new Semaphore(2); // only 2 threads at once

    void access(String threadName) {
        try {
            semaphore.acquire(); // get a permit
            System.out.println(threadName + " accessing resource...");
            Thread.sleep(1000);
            System.out.println(threadName + " done.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release(); // release permit
        }
    }
}

public class SemaphoreDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        for (int i = 1; i <= 5; i++) {
            final String name = "Thread-" + i;
            new Thread(() -> resource.access(name)).start();
        }
    }
}

