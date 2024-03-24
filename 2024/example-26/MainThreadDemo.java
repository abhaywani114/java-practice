class MainThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.err.println(t);
        t.setName("Demo");
        System.err.println(t);
        try {
            for(int i = 0; i < 10; i++ ){
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted");
        }
    }
    
}