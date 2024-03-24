class CallMe {
    void call(String msg) {
        try {
            System.out.print("[" + msg);
            Thread.sleep(2000);
            System.out.println("]");
        } catch (InterruptedException e) {
            System.err.println("Thread has been interrupted");
        }
    }
}

class Caller implements Runnable {
    CallMe target;
    String msg;
    Caller(CallMe target, String msg) {
        this.target = target;
        this.msg = msg;
        Thread t = new Thread(this);
        t.start();
    }
    public void run() {
        synchronized(target) {
            target.call(msg);
        }
    }
}
class SyncStatementDemo {
    public static void main(String[] args) {
        CallMe c1 = new CallMe();
        new Caller(c1, "hello");
        new Caller(c1, "world");
        new Caller(c1, "synchronized");
    }    
}
