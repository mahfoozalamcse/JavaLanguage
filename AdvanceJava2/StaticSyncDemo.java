package AdvanceJava2;

// static syncronization
class Bank {
    synchronized static void deposit(String user) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(user + " depositing money... step " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

class CustomerThread extends Thread {
    String user;
    CustomerThread(String user) { this.user = user; }
    public void run() {
        Bank.deposit(user);
    }
}

public class StaticSyncDemo {
    public static void main(String[] args) {
        CustomerThread t1 = new CustomerThread("Alice");
        CustomerThread t2 = new CustomerThread("Bob");

        t1.start();
        t2.start();
    }
}

