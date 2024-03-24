import java.util.Scanner;

class stack {
    int top = -1;
    int[] arr = new int[10];
    void push(int x) {
        if (top == 9)
            System.out.println("Stack is full");
        else
            arr[++top] = x;
    }
    int pop() {
        if (top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }
    void display() {
        System.out.println();
        for(int i = top; i >= 0; i--)
            System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        stack s1 = new stack();
        while (true) {
            System.out.println("1 - Push an element");
            System.out.println("2 - Pop an element");
            System.out.println("3 - Display stack");
            System.out.println("Enter choice: ");
            int choice = keyboard.nextInt();
            if (choice == 1) {
                System.out.println("Enter value to push into stack");
                s1.push(keyboard.nextInt());
            } else if (choice == 2) {
                System.out.println("Poping element: " + s1.pop());
            } else if (choice == 3) {
                s1.display();
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}