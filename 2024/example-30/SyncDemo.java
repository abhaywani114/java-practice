class CallMe implements Runnable {
    String msg = "";
    Thread t;
    CallMe(String msg) {
        this.msg = msg;
        t = new Thread(this);
        t.start();
    }
    //synchonrized not workd without static keyword
    /* 
        In your Java program, synchronization is not working as expected because the synchronized keyword is applied to a non-static method, syncMethod, within the CallMe class.

        When you use the synchronized keyword on a non-static method, it synchronizes on the object instance (this). Since each instance of the CallMe class (c1, c2, c3) is a separate object, synchronization is not achieved across instances.

        To synchronize access to the syncMethod across all instances of the CallMe class, you should declare the method as static. This way, the synchronization will be applied at the class level, ensuring that only one thread can execute the synchronized method at a time across all instances of the class.
     */
    static synchronized void syncMethod(String msg) {
        try {
            System.out.print("[" + msg);
            Thread.sleep(2000);
            System.out.println("]");
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
    }
    public void run() {
        syncMethod(this.msg);
    }
}
public class SyncDemo {
    public static void main(String[] args) {
        CallMe c1 = new CallMe("Hello");
        CallMe c2 = new CallMe("World");
        CallMe c3 = new CallMe("Synchronized");
    }
}