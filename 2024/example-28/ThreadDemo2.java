class NeoThread extends Thread {
    NeoThread() {
        super("New Thread");
        start();
    }
    public void run() {
        try {
            System.out.println("New thread says: hello");
            sleep(5000);
            System.out.println("New thread says: I woke up again");
        } catch (InterruptedException e) {
            System.out.println("New thread has been interrupted");
        } 
    }
}
 class ThreadDemo2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread: hi");
        Thread t = new NeoThread();
        // t.interrupt();
        // Thread.sleep(8000);
        System.out.println("Main thread: bye");
    }
}