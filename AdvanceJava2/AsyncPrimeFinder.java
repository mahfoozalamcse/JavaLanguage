package AdvanceJava2;

// Mini Project - Async Prime Finder (Executor + Future)
import java.util.*;
import java.util.concurrent.*;

public class AsyncPrimeFinder {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        List<Future<Boolean>> results = new ArrayList<>();

        for (int i = 100; i <= 110; i++) {
            int num = i;
            Callable<Boolean> task = () -> isPrime(num);
            results.add(executor.submit(task));
        }

        for (int i = 100; i <= 110; i++) {
            System.out.println(i + " is prime? " + results.get(i - 100).get());
        }

        executor.shutdown();
    }
}

