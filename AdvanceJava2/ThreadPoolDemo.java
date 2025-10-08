package AdvanceJava2;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// executorService — Thread Pool
// Example 1 — Fixed Thread Pool

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 6; i++) {
            int taskId = i;
            executor.execute(() -> {
                System.out.println("Executing Task " + taskId + " by " + Thread.currentThread().getName());
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            });
        }

        executor.shutdown();
    }
}



/* // SingleThreadExecutor & CachedThreadPool

 * ExecutorService singleExecutor = Executors.newSingleThreadExecutor();
  singleExecutor.execute(() -> System.out.println("Executed in single thread"));
  singleExecutor.shutdown();
 */


 // Cached Thread Pool (for lightweight tasks)
 /*
   ExecutorService cachedPool = Executors.newCachedThreadPool();
   
    for (int i = 1; i <= 5; i++) {

    cachedPool.execute(() -> System.out.println(Thread.currentThread().getName()));
    }

    cachedPool.shutdown();
  */

