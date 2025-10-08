package AdvanceJava2;
// 5. Producer-Consumer Problem (important FAANG Question)
// Example — Producer-Consumer using wait/notify

import java.util.LinkedList;

class SharedBuffer {
    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (list.size() == capacity)
            wait();
        System.out.println("Produced: " + value);
        list.add(value);
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (list.size() == 0)
            wait();
        int value = list.removeFirst();
        System.out.println("Consumed: " + value);
        notify();
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) throws InterruptedException {
        SharedBuffer buffer = new SharedBuffer();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try { buffer.produce(i); Thread.sleep(300); } catch (Exception e) {}
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try { buffer.consume(); Thread.sleep(700); } catch (Exception e) {}
            }
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}
