class NeoThread implements Runnable {
    public void run() {
        try {

            System.out.println("NeoThread says: Hello");
            Thread.sleep(5000);
            System.out.println("NeoThread says: I am going to die now");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread has beenm interruted ");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args)  throws InterruptedException  {
        System.out.println("Main thread started");
        Thread t = new Thread(new NeoThread(), "Neo Thead added");
        System.out.println(t);
        t.start();
        System.out.println("Hello");
        // Thread.sleep(7000);
        // System.out.println("Main thread: I was sleeping");
        System.out.println("Main thread: terminated");
    }
    
}