package AdvanceJava2;

// simple and wait/notify
class Message {
    private String msg;
    private boolean ready = false;

    synchronized void write(String msg) {
        this.msg = msg;
        ready = true;
        System.out.println("Message written: " + msg);
        notify(); // notify waiting thread
    }

    synchronized void read() {
        while (!ready) {
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.println("Message read: " + msg);
    }
}

public class WaitNotifyDemo {
    public static void main(String[] args) {
        Message message = new Message();

        Thread writer = new Thread(() -> message.write("Hello from Writer!"));
        Thread reader = new Thread(message::read);

        reader.start();
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        writer.start();
    }
}

