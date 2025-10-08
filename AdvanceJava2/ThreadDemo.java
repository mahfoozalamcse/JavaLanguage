package AdvanceJava2;


class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running from Runnable...");
    }
}

   public class ThreadDemo {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunnable(), "Runnable-Thread");

        t1.setName("Thread-Class");
        t1.start();
        t2.start();

        System.out.println("Main thread: " + Thread.currentThread().getName());
    }
}


