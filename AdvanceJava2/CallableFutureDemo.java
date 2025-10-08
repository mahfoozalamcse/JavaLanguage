package AdvanceJava2;

import java.util.concurrent.*;

// Callable and Future — Returning Values from Threads
// Unlike Runnable, Callable can return results and throw exceptions.

public class CallableFutureDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<Integer> task = () -> {
            int sum = 0;
            for (int i = 1; i <= 10; i++) sum += i;
            return sum;  // return value
        };

        Future<Integer> future = executor.submit(task);
        System.out.println("Result from Callable: " + future.get()); // blocks until done

        executor.shutdown();
    }
}


// ScheduledExecutorService — Task Scheduling
// Example — Delayed Task Execution
/*
import java.util.concurrent.*;

public class ScheduledDemo {
    public static void main(String[] args) throws Exception {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Task executed after delay by " + Thread.currentThread().getName());
        scheduler.schedule(task, 3, TimeUnit.SECONDS);

        scheduler.shutdown();
    }
}

 */
