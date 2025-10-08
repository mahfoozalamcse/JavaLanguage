package AdvanceJava3;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

// Task class
class Task implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int priority;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name + " [Priority: " + priority + "]";
    }
}

// Producer class
class Producer implements Runnable {
    private BlockingQueue<Task> queue;
    private AtomicInteger counter;
    private CopyOnWriteArrayList<Task> allTasks;

    Producer(BlockingQueue<Task> queue, AtomicInteger counter, CopyOnWriteArrayList<Task> allTasks) {
        this.queue = queue;
        this.counter = counter;
        this.allTasks = allTasks;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            Task task = new Task("Task-" + counter.incrementAndGet(), new Random().nextInt(100));
            try {
                queue.put(task);
                allTasks.add(task);
                System.out.println(Thread.currentThread().getName() + " produced: " + task);
                Thread.sleep(100); // simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Consumer class
class Consumer implements Runnable {
    private BlockingQueue<Task> queue;
    private ConcurrentHashMap<String, Task> processedTasks;

    Consumer(BlockingQueue<Task> queue, ConcurrentHashMap<String, Task> processedTasks) {
        this.queue = queue;
        this.processedTasks = processedTasks;
    }

    public void run() {
        while (true) {
            try {
                Task task = queue.take(); // blocks if empty
                System.out.println(Thread.currentThread().getName() + " processing: " + task);
                processedTasks.put(task.name, task);
                Thread.sleep(150); // simulate processing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class FAANGDemo {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BlockingQueue<Task> queue = new ArrayBlockingQueue<>(10);
        ConcurrentHashMap<String, Task> processedTasks = new ConcurrentHashMap<>();
        CopyOnWriteArrayList<Task> allTasks = new CopyOnWriteArrayList<>();
        AtomicInteger counter = new AtomicInteger(0);

        // Start producers
        Thread p1 = new Thread(new Producer(queue, counter, allTasks), "Producer-1");
        Thread p2 = new Thread(new Producer(queue, counter, allTasks), "Producer-2");
        p1.start(); p2.start();

        // Start consumers
        Thread c1 = new Thread(new Consumer(queue, processedTasks), "Consumer-1");
        Thread c2 = new Thread(new Consumer(queue, processedTasks), "Consumer-2");
        c1.setDaemon(true); c2.setDaemon(true); // run in background
        c1.start(); c2.start();

        try {
            p1.join(); p2.join();
            Thread.sleep(2000); // wait for consumers to finish
        } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("\nAll tasks produced: " + allTasks);
        System.out.println("Processed tasks in map: " + processedTasks);

        // Serialize tasks to file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tasks.ser"))) {
            oos.writeObject(allTasks);
        }

        // Read tasks back from file
        List<Task> deserializedTasks;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("tasks.ser"))) {
            deserializedTasks = (List<Task>) ois.readObject();
        }

        System.out.println("\nDeserialized tasks from file: " + deserializedTasks);

        // Save processed tasks to a text file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("processed_tasks.txt"))) {
            processedTasks.values().forEach(task -> {
                try { bw.write(task.toString() + "\n"); } 
                catch (IOException e) { e.printStackTrace(); }
            });
        }

        System.out.println("\nProcessed tasks saved to processed_tasks.txt");
    }
}
