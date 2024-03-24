class CallMe implements Runnable {
    String msg = "";
    void setMsg(String msg) {
        this.msg = msg;
    }
    synchronized void call(String msg) {
        try {
            System.out.print("[" + msg);
            Thread.sleep(2000);
            System.out.println("]");
        } catch (InterruptedException e) {
            System.err.println("Thread has been interrupted");
        }
    }
    public void run() {        
        this.call(msg);
    }
}

/*
    In your Java program, the issue is with the order of setting the message (msg) in the CallMe object before starting the threads. Since you're setting the message (msg) before starting each thread, the run() method of each thread executes immediately after starting, without waiting for the previous thread to finish its execution.

    As a result, when you call setMsg("Hello"), it sets the message to "Hello", but before the run() method of the first thread (t) executes, you set the message to "World", and similarly before t2 executes, you set the message to "Synchronized". Therefore, "Hello" is never printed because the message is overwritten before it gets a chance to be printed by the thread.
 */
class SyncDemo3 {
    public static void main(String[] args) {
        CallMe c1 = new CallMe();
        c1.setMsg("Hello");
        Thread t = new Thread(c1, "Thread 1");
        t.start();

        c1.setMsg("World");
        Thread t2 = new Thread(c1, "Thread 2");
        t2.start();

        c1.setMsg("Synchronized");
        Thread t3 = new Thread(c1, "Thread 3");
        t3.start();
    }
}
