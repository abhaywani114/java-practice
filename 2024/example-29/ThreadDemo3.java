class TryThreadding implements Runnable {
    public void run() {
        try {
            System.out.println("New thread says: hello");
            Thread.sleep(5000);
            System.out.println("New thread says: I was sleepig");
        } catch (InterruptedException e) {
            System.out.println("New thread interruped");
        }
    }
}
class ThreadDemo3 {
    public static void main(String[] args) throws InterruptedException{
        Thread t = new Thread(new TryThreadding(), "New Thread");
        System.out.println("Main thread");
        System.out.println(t);
        t.start();
        t.interrupt();
        System.out.println("Is new thread alive: " + t.isAlive());
        if (t.isAlive() == true && args.length > 0 && args[0].equals("wait")) {
            System.out.println("Waiting for it to get completed");
             t.join();
        }
        System.out.println("Main thread: terminated");
    }
    
}