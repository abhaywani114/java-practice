class Queue {
    int front = -1;
    int rare = -1;
    int size;
    int arr[];
    Queue(int size) {
        this.size = size;
        this.arr = new int[size];
    }
    void enqueue(int x) {
        if (rare >= size) {
            System.out.println("Queue is full");
            return;
        }
        arr[++rare] = x;
        if (front == -1) 
            front = 0;
    } 
    void dequeue() {
        if (front == rare){
            System.out.println("Queue is empty cann't dequeue anything");
            front = rare = -1;
        } else
            front++;
    }  
    boolean isEmpty() {
        return front == -1 && rare == -1;
    }
    int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    void display() {
        System.out.println();
        for(int i = front; i <= rare; i++)
            System.out.println(arr[i]);
    }
}
class DemoQueue {
    public static void main(String argv[]) {
        Queue q1 = new Queue(5);
        q1.dequeue();
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.dequeue();
        q1.display();
    }
}