package AdvanceJava2;

import java.util.concurrent.*;

// 4. Concurrent Collections
// Traditional collections (HashMap, ArrayList) fail under concurrency.
// Java provides thread-safe alternatives.

public class ConcurrentCollectionsDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        Runnable writer = () -> {
            for (int i = 0; i < 5; i++) {
                map.put(Thread.currentThread().getName() + "-" + i, i);
                list.add(Thread.currentThread().getName() + "-" + i);
            }
        };

        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(writer);
        t1.start(); t2.start();

        try { t1.join(); t2.join(); } catch (InterruptedException e) {}

        System.out.println("ConcurrentHashMap: " + map);
        System.out.println("CopyOnWriteArrayList: " + list);
    }
}

